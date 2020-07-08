package com.aaa.heng.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author zjh
 * @Date 2020/7/8
 * @Description //TODO
 */
@Data
public class User implements Serializable {

    private String id;
    private String username;
    private String password;

}
