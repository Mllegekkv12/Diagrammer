package com;

import Graphics.*;

import java.util.Scanner;

public class Main extends Diagram_Window {

    public Main(int width, int height) {
        super(width, height);
    }

    public static void main(String[] args) {
        new Diagram_Window(800, 1000);
        Diagram_Window.XXX();
        Menu_Window MW =  new Menu_Window(300, 300);
        Scanner inputX = new Scanner(System.in);
        Scanner inputY = new Scanner(System.in);
        MW.count(inputX.nextDouble(), inputY.nextDouble(), 0, 0); //Для не статик функции нужно создание объекта класса
        Menu_Window.XXX();
    }
    /*public Main(int width, int height) {
        super(width, height);*/
}
//   Diagram_Window DW = new Diagram_Window(500, 300);

