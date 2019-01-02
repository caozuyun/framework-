package com.example.springBootDemo.learn.controller;

import com.example.springBootDemo.learn.domain.AppMenu;
import com.example.springBootDemo.learn.service.LearnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by v-caozuyun-os on 2018/11/7.
 */
@RestController
@RequestMapping("/learn")
public class LearnController {

    @Autowired
    private LearnService learnService;


    //@RequestMapping(value = "/findAll")
    @GetMapping(value = "/findAll")
    public List<AppMenu> findAll(){
        return learnService.findAll();
    }


}
