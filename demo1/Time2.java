package com.statics.demo.controller.common.y201903.d3;

import org.jfree.data.time.Month;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by xuwencong on 2019/3/11
 */
public class Time2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // 获得2005年的第86天 (27-Mar-2005)
        LocalDate localDate = LocalDate.ofYearDay(2005, 86);
        System.out.println(localDate);
        // 根据年月日取日期 2013年8月10日
        localDate = LocalDate.of(2013, Month.AUGUST, 10);
        localDate = LocalDate.of(2013, 8, 10);
        // 根据字符串取
        LocalDate.parse("2014-02-28"); // 严格按照ISO yyyy-MM-dd验证，02写成2都不行
        LocalDate.parse("2014-02-29"); // 无效日期无法通过：DateTimeParseException: Invalid date
        // 取本月第1天：
        LocalDate firstDayOfThisMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        // 取本月第2天：
        LocalDate secondDayOfThisMonth = today.withDayOfMonth(2);
        // 取本月最后一天，再也不用计算是28，29，30还是31：
        LocalDate lastDayOfThisMonth = today.with(TemporalAdjusters.lastDayOfMonth());
        // 取下一天：
        LocalDate firstDayOf2015 = lastDayOfThisMonth.plusDays(1); // 变成了2015-01-01
        // 取2015年1月第一个周一，这个计算用Calendar要死掉很多脑细胞：
        LocalDate firstMondayOf2015 = LocalDate.parse("2015-01-01").with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        // LocalTime
        LocalTime now = LocalTime.now(); // 带纳秒
        LocalTime now1 = LocalTime.now().withNano(0); // 清除纳秒
        System.out.println(now);
        System.out.println(now1);
        LocalTime localTime = LocalTime.of(22, 33);
        System.out.println(localTime);
        // 返回一天中的第4503秒
        localTime = LocalTime.ofSecondOfDay(4503);
        System.out.println(localTime);
        LocalDateTime localDateTime0 = LocalDateTime.now();
        System.out.println(localDateTime0);
        // 当前时间加上25小时３分钟
        LocalDateTime inTheFuture = localDateTime0.plusHours(25).plusMinutes(3);
        System.out.println(inTheFuture);
        // 同样也可以用在localTime和localDate中
        System.out.println(localDateTime0.toLocalTime().plusHours(25).plusMinutes(3));
        System.out.println(localDateTime0.toLocalDate().plusMonths(2));
    }
}
