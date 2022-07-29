package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BankController
{
    @RequestMapping("/banks")
    @ResponseBody
    public String bankController()
    {
        return "banks";
    }
}