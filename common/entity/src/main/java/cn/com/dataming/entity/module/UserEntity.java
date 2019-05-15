package cn.com.dataming.entity.module;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserEntity implements Serializable {
    private Integer id;
    private String name;
    private String password;
}
