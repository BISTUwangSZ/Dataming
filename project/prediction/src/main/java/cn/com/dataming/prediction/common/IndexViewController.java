package cn.com.dataming.prediction.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping
public class IndexViewController {

    @RequestMapping("/")
    public String index(HttpServletRequest request,HttpServletResponse response){
        return "index";
    }
}
