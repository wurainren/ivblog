package cc.wurainren.ivblog.web.user.service;

import cc.wurainren.ivblog.web.user.model.UserEntity;

import java.util.List;

public interface IUserService {
    List<UserEntity> queryAllUser();

    void save(UserEntity userEntity);
}
