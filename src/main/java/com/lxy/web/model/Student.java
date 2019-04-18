package com.lxy.web.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//使用lombok插件来简化操作
public class Student {
    public Integer id;
    public String username;
    public String gender;
}
