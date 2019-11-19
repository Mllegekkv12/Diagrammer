package com;

import Graphics.*;

import java.util.Scanner;

public class Main extends Diagram_Window {

    public Main(int width, int height) {
        super(width, height);
    }

    public static void main(String[] args) {
        Diagram_Window DW = new Diagram_Window(400, 500);
        new Menu_Window(300, 400);
        Scanner inputX = new Scanner(System.in);
        Scanner inputY = new Scanner(System.in);
        DW.count(inputX.nextDouble(), inputY.nextDouble(), 0, 0); //Для не статик функции нужно создание объекта класса
    }
}


