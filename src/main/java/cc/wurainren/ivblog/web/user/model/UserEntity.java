package cc.wurainren.ivblog.web.user.model;



import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_user")
@Data
public class UserEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String userIcon;
    private String userDiscri;


}
