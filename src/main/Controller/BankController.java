package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController
{
    @GetMapping("banks.html")
    @RequestMapping("/banks.html")
    public String bankController()
    {
        return "banks";
    }
}