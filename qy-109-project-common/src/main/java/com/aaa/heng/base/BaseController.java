package com.aaa.heng.base;

import static com.aaa.heng.status.LoginStatus.LOGIN_FAILED;
import static com.aaa.heng.status.LoginStatus.LOGIN_SUCCESS;

/**
 * @Author zjh
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 * 统一controller
 * 统一返回
 *      eg:
 *          登录成功和失败
 *          code:200 msg:登录成功
 *          code:400 msg:登录失败，系统异常
 *          code:201 msg:用户已经存在
 *          code:401 msg:用户不存在
 *          code:402 msg:密码错误
 *          code:405 msg:用户退出异常
 */
public class BaseController {

    protected ResultData loginSuccess(){
    ResultData resultData=new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        return  resultData;


    }

/**
 * @Author zjh
 * @Date 2020/7/8
 * @Description //自定义返回消息
 */
    protected ResultData loginSuccess(String msg){
        ResultData resultData=new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        return  resultData;
    }

/**
 * @Author zjh
 * @Date 2020/7/8
 * @Description //返回数据信息 使用系统消息
 */
    protected ResultData loginSuccess(Object data){
        ResultData resultData=new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        resultData.setData(data);
        return  resultData;
    }   
    
    /**
     * @Author zjh
     * @Date 2020/7/8
     * @Description //登录失败使用系统消息
     */

    protected  ResultData loginFailed(){
        ResultData resultData=new ResultData();
        resultData.setCode(LOGIN_FAILED.getCode());
        resultData.setMsg(LOGIN_FAILED.getMsg());
        return  resultData;
    }


/**
 * @Author zjh
 * @Date 2020/7/8
 * @Description //详细解释说明
 */

    protected ResultData loginFailed(String detail) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_FAILED.getCode());
        resultData.setMsg(LOGIN_FAILED.getMsg());
        resultData.setDetail(detail);
        return resultData;
    }

    //TODO  未完善

}
