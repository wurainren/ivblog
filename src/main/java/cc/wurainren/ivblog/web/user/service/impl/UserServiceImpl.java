package cc.wurainren.ivblog.web.user.service.impl;

import cc.wurainren.ivblog.web.user.service.IUserService;
import cc.wurainren.ivblog.web.user.dao.UserRepository;
import cc.wurainren.ivblog.web.user.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> queryAllUser() {
        return userRepository.findAll();
    }

    @Transactional
    @Override
    public void save(UserEntity userEntity) {
        userRepository.save(userEntity);
    }


}
