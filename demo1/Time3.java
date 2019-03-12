package com.statics.demo.controller.common.y201903.d3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xuwencong on 2019/3/12
 */
public class Time3 {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();

        //获取指定格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateFormat = sdf.format(date);

        //年月日分开格式化
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        SimpleDateFormat month = new SimpleDateFormat("MM");
        SimpleDateFormat day = new SimpleDateFormat("dd");

        String yearFormat = year.format(date);
        String monthFormat = month.format(date);
        String dayFormat = day.format(date);

        System.out.println("dateFormat:" + dateFormat);
        System.out.println("yearFormat:" + yearFormat + ",monthFormat:" + monthFormat + ",dayFormat:" + dayFormat);

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //时间格式化
        java.util.Date utilDate = new Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        java.sql.Time sTime = new java.sql.Time(utilDate.getTime());
        java.sql.Timestamp stp = new java.sql.Timestamp(utilDate.getTime());

        f.format(stp);
        f.format(sTime);
        f.format(sqlDate);
        f.format(utilDate);

        java.sql.Date sqLDate = java.sql.Date.valueOf("2019-3-12");

        utilDate = new java.util.Date(sqLDate.getTime());

        System.out.println("utilDate-Year:" + utilDate.getYear());
        System.out.println("utilDate:" + utilDate);
    }
}
