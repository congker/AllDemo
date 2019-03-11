package com.statics.demo.controller.common.y201903.d3;

import org.jfree.data.time.Month;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 * Created by xuwencong on 2019/3/8
 */
public class Time {
    public static void main(String[] args) {
        Clock c = Clock.systemDefaultZone();

        System.out.println("系统时间："+System.currentTimeMillis());

        System.out.println("时钟时间："+c.millis());
        Date date = Date.from(c.instant());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(""+sdf.format(date));
        // instant精确到纳秒，比原来的date的毫秒要更精确

        // 获取当前时间
        Instant in = Instant.now();
        System.out.println("in时间："+in);
        // 将现在的时间增加3小时2分,将产生新的实例
        Instant in1 = in.plus(Duration.ofHours(3).plusMinutes(2));
        System.out.println("in1时间："+in1);
        System.out.println(in1 == in);
        // 关于计算的例子
        in.minus(5, ChronoUnit.DAYS);// 计算5天前
        in.minus(Duration.ofDays(5));// 计算5天前
        // 计算两个Instant之间的分钟数
        long diffAsMinutes1 = ChronoUnit.MINUTES.between(in, in1); // 方法2
        System.out.println(""+diffAsMinutes1);
        // instant是可比较的，有isAfter和isBefore
        System.out.println(in.isAfter(in1));
        System.out.println(in.isBefore(in1));

    }
}
