package com.szq.mybatisswagger2.controller;

import com.szq.mybatisswagger2.domain.TbsFeel;
import com.szq.mybatisswagger2.server.FeelServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeelController {
    @Autowired
    private FeelServer feelServer;

    @GetMapping("/feel")
    public List<TbsFeel> selAll(){
        return feelServer.SelAll();
    }
}
