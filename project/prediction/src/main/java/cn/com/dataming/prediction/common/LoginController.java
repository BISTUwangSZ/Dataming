package cn.com.dataming.prediction.common;

import cn.com.dataming.entity.module.UserEntity;
import cn.com.dataming.core.utils.HttpsUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping
public class LoginController {

    @RequestMapping(value = "/login")
    public String loginPage(UserEntity user, HttpServletRequest request) {
        return "login/login";
    }

    @RequestMapping(value = "/logout")
    public Object logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        return "login/login";
    }

    @RequestMapping(value = "/login/submit")
    @ResponseBody
    public Object submit(Object t) throws IOException {
        String url = "http://localhost:8080/login/checkUserInfo";
        return HttpsUtil.doPost(url,t);
    }
}
