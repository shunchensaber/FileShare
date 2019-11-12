package com.njit.fileshare.cs.Setting;

public class DividePage {
    //一页放五个
    public static int pagesize = 9;

    //返回共有几个页面
    public static int getpages(int allnums) {
        return allnums / pagesize + (allnums % pagesize == 0 ? 0 : 1);
    }

    //返回第几页的首地址
    public static  int getStartIndex(int page)
    {
        return pagesize*(page-1);
    }
}
