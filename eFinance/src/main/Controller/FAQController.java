package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FAQController
{
    @RequestMapping("/FAQ")
    @ResponseBody
    public String faqController()
    {
        return "FAQ";
    }
}