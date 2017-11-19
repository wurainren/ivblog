package com.wurainren.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2017/11/19.
 */
@Data
@Log4j
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_user")
public class UserInfo {
    @Id
    @GeneratedValue
    Long id;

    @Column
    String username;

    @Column
    String pwd;

    @Column
    Date createdate;

    @Column
    String remark;
}
