package com.circlearea.web;

import java.util.Scanner;

public class CircleArea2Demo {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        CircleArea2App circleArea2App = new CircleArea2App();
        System.out.println(circleArea2App.webSite);
        System.out.println("반지름을 입력하세요.");
        int half = scanner.nextInt();
        System.out.println("원주율을 입력하세요.");
        double pi = scanner.nextDouble();

        String result = circleArea2App.circleArea(half,pi);
        System.out.println(result);
    }
}
