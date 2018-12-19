package cc.wurainren.ivblog.web.user.service;

import cc.wurainren.ivblog.web.user.model.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface IUserService {
    List<UserEntity> getAll();

    Iterable<UserEntity> findAllSort(Sort sort);

    Page<UserEntity> findAll(Pageable page);

    void save(UserEntity userEntity);


}
