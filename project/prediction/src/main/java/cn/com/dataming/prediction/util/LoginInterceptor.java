package cn.com.dataming.prediction.util;

import cn.com.dataming.entity.module.UserEntity;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    //在控制器执行前调用
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("执行preHandle方法-->01");
        HttpSession session = request.getSession();
        UserEntity user = (UserEntity) session.getAttribute("user");
        if (user == null) {
            request.getRequestDispatcher("/login").forward(request, response);
            return false;
        } else {
            return true;
        }
    }

    //在后端控制器执行后调用
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("执行postHandle方法-->02");
    }

    //整个请求执行完成后调用
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("执行afterCompletion方法-->03");
    }
}
