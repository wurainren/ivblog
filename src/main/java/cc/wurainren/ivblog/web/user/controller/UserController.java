package cc.wurainren.ivblog.web.user.controller;

import cc.wurainren.ivblog.core.util.ajax.R;
import cc.wurainren.ivblog.web.user.model.UserEntity;
import cc.wurainren.ivblog.web.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService iUserService;

//    @RequestMapping("/get")
//    public R getUsers(){
//        return R.ok().content(iUserService.queryAllUser());
//    }

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("測試spring boot devtools 123");
        return "hello,world.......123";
    }

    @RequestMapping("/save")
    public R save(@RequestBody UserEntity userEntity){
        iUserService.save(userEntity);
        return R.ok();
    }

    @RequestMapping("/page")
    public R sortPage(int pageIndex){
        //指定排序对象
        Sort sort = new Sort(Sort.Direction.DESC,"id");

        /*
        封装分页实体
        参数1：pageIndex表示当前查询的是第几页（默认从0开始，0表示第1页）
        参数2：表示每页展示多少数据，现在设置每页展示2条数据
        参数3：封装排序对象，根据该对象的参数指定根据id降序查询
        */
        Pageable pageable = PageRequest.of(pageIndex-1,10,sort);
        Page<UserEntity> page = iUserService.findAll(pageable);
        Integer totalPage =  page.getTotalPages(); //总页数
        System.out.println("总页数："+totalPage);
        Long totalCount = page.getTotalElements(); //总记录数
        System.out.println("总记录数："+totalCount);
        Integer currentPage = page.getNumber()+1;   //当前第几页
        System.out.println("当前第几页："+currentPage);
        Integer currentPageCount = page.getNumberOfElements(); //当前页展示几条数据
        System.out.println("当前页展示几条数据："+currentPageCount);
        List<UserEntity> userEntityList = page.getContent(); //当前结果数据集合
        System.out.println("当前结果数据集合："+userEntityList);
        return R.ok().content(page);
    }
}
