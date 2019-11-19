package com;

import Graphics.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Menu_Window(300, 400);
        Diagram_Window DW =  new Diagram_Window(400, 500);
        Scanner inputX = new Scanner(System.in);
        Scanner inputY = new Scanner(System.in);//Для не статик функции нужно создание объекта класса
        DW.count(inputX.nextDouble(),inputY.nextDouble(),0,0);
    }
}


