package jp.te4a.spring.boot.myapp5;

import org.springframework.stereotype.Controller;          // ← これが必要
import org.springframework.ui.Model;                    // ← これが必要
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(Model model) {
        // model.addAttribute("message", "Hello Spring Boot!");
        return "index";  // /WEB-INF/views/index.jsp にマッピングされる
    }
}
