package com.lxy;

import com.lxy.dbconfig.DBConfig1;
import com.lxy.dbconfig.DBConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration//自动配置
@ComponentScan(basePackages = {"com.lxy"})
@EnableConfigurationProperties(value = {DBConfig1.class,DBConfig2.class})
public class App 
{
    public static void main( String[] args )
    {
        //启动Spring项目
        SpringApplication.run(App.class,args);
    }
}
