package com.circlearea.web;


/**반지름을 입력했을때 원넓이가 구해지는 프로그램**/

public class CircleAreaApp {
    public static  String webSite = "CIRCLE AREA Calculator";

    private int half;
    private double pi = 3.14;
    //private double pi = 3.14 => pi는 3.14 라는 상수라고한다.
    //중요!!  private final double PI = 3.14;로 많이 사용한다고 함.


    public String circleArea(int halfParm){
        half = halfParm;
        //pi는 따로 받지 않으므로 선언X

        double result = half*half*pi;

        return "반지름"+ half + "의 원의 넓이는 " + result + "입니다.";
}
}