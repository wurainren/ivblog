package com.wurainren.po;

import lombok.*;
import lombok.extern.log4j.Log4j;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/11/19.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "bg_user")
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    @Column(name="username",unique = true)
    private String userName;

    @NonNull
    @Column(name="password")
    private String passWord;

    @NonNull
    @Column(name="emial", unique = true)
    private String email;

    @NonNull
    @Column(name="nickname",unique = true)
    private String nickName;

    @NonNull
    @Column(name="regtime")
    private String regTime;

    @NonNull
    @Column(name="disabled",nullable = false)
    private Boolean disabled;

    @Column(name="remark")
    private String remark;
}
