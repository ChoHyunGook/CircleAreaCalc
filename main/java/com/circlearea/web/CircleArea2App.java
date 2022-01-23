package com.circlearea.web;

//**반지름과 원주율(Pi)값을 입력했을때 원넓이가 구해지는 프로그램**//

public class CircleArea2App {
    public static String webSite = "CircleArea Calculator ver2";

    private int half;
    private double pi;

    public String circleArea(int halfParm,double piParm){
        half = halfParm;
        pi = piParm;

        double result = half * half * pi;

        return "반지름 " + half + "와 원주율 " + pi + "값의 원넓이는 " +result + "입니다.";

    }
}
