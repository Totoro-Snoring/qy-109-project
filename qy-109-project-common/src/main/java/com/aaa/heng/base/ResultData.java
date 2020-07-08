package com.aaa.heng.base;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author zjh
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 * 通过接口返回值
 * 也就是返回所有的 controller
 */
@Data
@Accessors(chain = true)
public class ResultData<T> implements Serializable {

    private String code;
    private String msg;
    private String detail;
    private T data;

}
