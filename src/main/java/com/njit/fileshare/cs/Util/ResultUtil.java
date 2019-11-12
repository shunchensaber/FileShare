package com.njit.fileshare.cs.Util;

public class ResultUtil {
    /**
     * 请求成功与失败返回
     */

    public static Msg success(Object data) {
        Msg msg = new Msg();
        msg.setCode(200);
        msg.setMsg("请求成功");
        msg.setData(data);
        return msg;
    }
    public static Msg success()
    {
        return success(null);
    }

    public static Msg error(Integer code,String resultmsg)
    {
        Msg msg = new Msg();
        msg.setMsg(resultmsg);
        msg.setCode(code);
        return msg;
    }
}

