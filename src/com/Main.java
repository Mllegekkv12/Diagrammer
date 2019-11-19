package com;

import Graphics.*;

public class Main extends Diagram_Window {

    public Main(int width, int height) {
        super(width, height);
    }

    public static void main(String[] args) {
        new Diagram_Window(800, 1000);
        Diagram_Window.XXX();
        new Menu_Window(30, 30);
        Menu_Window.XXX();
    }
}

