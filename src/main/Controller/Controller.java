package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller 
{
    @RestController
    @GetMapping("index.html")
    @RequestMapping("/index.html")
    public String index()
    {
        return "index";
    }
}
