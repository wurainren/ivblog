package cc.wurainren.ivblog.web.user.service.impl;

import cc.wurainren.ivblog.web.user.service.IUserService;
import cc.wurainren.ivblog.web.user.dao.UserRepository;
import cc.wurainren.ivblog.web.user.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Iterable<UserEntity> findAllSort(Sort sort){
        return userRepository.findAll(sort);
    }

    @Override
    public Page<UserEntity> findAll(Pageable page){
        return userRepository.findAll(page);
    }

    @Transactional
    @Override
    public void save(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

}
