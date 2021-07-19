package com.rxy.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author rongxiaoya
 */
@Data
public class Dept implements Serializable {

    private Integer deptNo;
    private String deptName;
    private String dbSource;


}
