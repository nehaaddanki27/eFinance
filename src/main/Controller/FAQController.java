package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FAQController
{
    @GetMapping("FAQ.html")
    @RequestMapping("/FAQ.html")
    public String faqController()
    {
        return "FAQ";
    }
}