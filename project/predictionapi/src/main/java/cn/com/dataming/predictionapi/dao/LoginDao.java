package cn.com.dataming.predictionapi.dao;

import cn.com.dataming.entity.module.UserEntity;
import cn.com.dataming.predictionapi.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {
    @Autowired
    private LoginMapper mapper;

    public UserEntity checkUserInfo(UserEntity user){
        return mapper.checkUserInfo(user);
    }
}
