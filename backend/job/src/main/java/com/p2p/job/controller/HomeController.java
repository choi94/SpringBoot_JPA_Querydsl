package com.p2p.job.controller;



import com.p2p.job.repository.PDSBoardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    
    @Autowired
	PDSBoardRepository pdsRepo;
    
    @RequestMapping("/")
    public String Home(){
        return "index";
    }
}