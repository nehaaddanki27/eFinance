package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController
{
    @GetMapping("loanApplications.html")
    @RequestMapping("/loanApplications.html")

    public String loanApplications()
    {
        return "loanApplications";
    }
}