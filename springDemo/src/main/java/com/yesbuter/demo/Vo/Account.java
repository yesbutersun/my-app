package com.yesbuter.demo.Vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Account {
    private Integer id;
    private Integer money;
    private String userName;
}
