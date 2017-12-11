package com.wurainren.po;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by ex-renwu on 2017/12/11.
 */
@Data
@Entity
@Table(name="blog_role")
public class Role {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "role_name",length=50,unique = true,nullable = false)
    private String roleName;
    @Column(name = "role_note",length=250)
    private String roleNote;

}
