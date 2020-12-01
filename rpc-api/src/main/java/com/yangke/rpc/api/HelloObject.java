package com.yangke.rpc.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *  测试用API的传递对象
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
// 使用后添加一个构造函数，该构造函数含有所有已声明字段属性参数
public class HelloObject implements Serializable {
    private Integer id;
    private String message;
}
