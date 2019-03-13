package com.statics.demo.controller.statistics;


import javax.swing.*;
import java.awt.*;

/**
 * Created by xuwencong on 2019/1/30
 */
public class mainClass {
    public static void main(String[] args) {

        JFrame frame=new JFrame("Java数据统计图");
        frame.setLayout(new GridLayout(2,2,10,10));
        frame.add(new BarChart().getChartPanel());           //柱形图
        frame.add(new BarChart2().getChartPanel());          //柱形图第二种效果
        frame.add(new PieChart().getChartPanel());           //饼状图
        frame.add(new TimeSeriesChart().getChartPanel());    //折线图
        frame.setBounds(50, 50, 800, 600);
        frame.setVisible(true);

    }
}
