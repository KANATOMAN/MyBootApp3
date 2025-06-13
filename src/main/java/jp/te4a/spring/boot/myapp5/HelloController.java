package jp.te4a.spring.boot.myapp5;

import org.springframework.stereotype.Controller;          // ← これが必要
import org.springframework.ui.Model;                    // ← これが必要
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(Model model) {
        // model.addAttribute("message", "Hello Spring Boot!");
        return "index";  // /WEB-INF/views/index.jsp にマッピングされる
    }
    @RequestMapping(value="/post", method=RequestMethod.POST)
public ModelAndView postForm(@RequestParam("text1") String text1) {
 ModelAndView mv = new ModelAndView("index");
 mv.addObject("msg", "you write '" + text1 + "'!!!");
 return mv;
}
}
