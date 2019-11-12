package com.njit.fileshare.cs.Util;

import lombok.Data;

@Data
public class Msg<T>{
    /*错误码*/
    private Integer code;

    /*提示信息*/
    private String msg;

    /*据以内容*/
    private T data;


}
