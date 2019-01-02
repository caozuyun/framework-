package com.example.springBootDemo.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;


/**
 * Created by v-caozuyun-os on 2018/11/9.
 */
public class MyBatisGenerate {

    /**
     * mybatis逆向工程生成文件入口
     * @param args
     */
    public static void main(String[] args) throws Exception{

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //项目根路径不要有中文,我的有中文,所以使用绝对路径
        File configFile = new File("E:\\demo\\springBootDemo\\src\\main\\java\\com\\example\\springBootDemo\\utils\\genreatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        System.out.println(myBatisGenerator);
        myBatisGenerator.generate(null);
    }

}
