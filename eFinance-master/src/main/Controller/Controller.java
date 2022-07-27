package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controller 
{
    @RequestMapping("/index")
    @ResponseBody
    public String index()
    {
        return "index";
    }
}
