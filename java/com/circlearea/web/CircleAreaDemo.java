package com.circlearea.web;

import java.util.Scanner;

public class CircleAreaDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CircleAreaApp CircleArea = new CircleAreaApp();
        System.out.println((CircleArea.webSite));
        System.out.println("반지름을 입력하세요!");
        int half = scan.nextInt();

        String result = CircleArea.circleArea(half);
        System.out.println(result);
    }
}
