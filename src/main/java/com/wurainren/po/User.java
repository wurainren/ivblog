package com.wurainren.po;

import com.wurainren.dto.RoleType;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ex-renwu on 2017/12/11.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name="blog_user")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    public Long id;
    @Column(name = "user_name",length=50,nullable = false)
    public String userName;
    @Column(name = "pass_word",length=50,nullable = false)
    public String passWord;
    @Column(columnDefinition="tinyint default 0")
    public Boolean disabled;
    @Enumerated(EnumType.STRING)
    public RoleType role;

}
