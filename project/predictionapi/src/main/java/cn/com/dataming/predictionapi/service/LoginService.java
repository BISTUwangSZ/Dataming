package cn.com.dataming.predictionapi.service;

import cn.com.dataming.entity.module.UserEntity;
import cn.com.dataming.predictionapi.dao.LoginDao;
import cn.com.dataming.predictionapi.mapper.LoginMapper;
import cn.com.dataming.predictionapi.util.DBHelper;
import cn.com.dataming.predictionapi.util.DS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
public class LoginService {

    @Autowired
    private LoginDao loginDao;

    public UserEntity login(UserEntity condition, HttpServletRequest request){
        UserEntity user = loginDao.checkUserInfo(condition);
        return user;
    }
}
