package com.example.springBootDemo.learn.service;

import com.example.springBootDemo.learn.dao.AppMenuMapper;
import com.example.springBootDemo.learn.domain.AppMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by v-caozuyun-os on 2018/11/7.
 */
@Service
public class LearnService {

    @Autowired
    private AppMenuMapper appMenuMapper;

    public List<AppMenu> findAll() {
        //return appMenuMapper.queryAppMenus();
        List<AppMenu> menuLists = new ArrayList<>();
        for (int i=0;i<10;i++){
            AppMenu appMenu = new AppMenu();
            appMenu.setId(i);
            appMenu.setName("曹祖珍"+" -----> "+i);
            appMenu.setMenuType("女"+" -----> "+i);
            appMenu.setOrderMethod(i+"");
            appMenu.setRelationModel(i+"");
            appMenu.setSort(i);
            appMenu.setStatus((byte)i);
            appMenu.setIsRecommended((byte)i);
            appMenu.setUpdateTime(new Date());
            appMenu.setPicUrl("https://www.baidu.com"+" ------> "+i);
            appMenu.setCreateTime(new Date());
            menuLists.add(appMenu);
        }
        return menuLists;
    }
}
