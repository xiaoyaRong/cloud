package com.rxy.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author rongxiaoya
 */
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    private Integer deptNo;
    private String deptName;
    private String dbSource;


}
