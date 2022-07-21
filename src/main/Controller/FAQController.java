package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FAQController
{
    @GetMapping("FAQ.html")
    public String index()
    {
        return "FAQ";
    }
}