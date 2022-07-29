package com.example.efinance.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApplicationController
{
    @RequestMapping("/loanApplications")
    @ResponseBody
    public String loanApplications()
    {
        return "loanApplications";
    }
}