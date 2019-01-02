package com.example.springBootDemo.learn.dao;

import com.example.springBootDemo.learn.domain.AppMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AppMenuMapper {

    List<AppMenu> queryAppMenus();

}