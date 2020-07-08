package com.aaa.heng.base;

import java.util.Map;

/**
 * @Author zjh
 * @Date 2020/7/8
 * @Description //TODO
 */
public abstract class CommonController<T> extends BaseController {

    public abstract  BaseService<T> getBaseService();

    public ResultData add(Map map) {
        return new ResultData();
    }

}
