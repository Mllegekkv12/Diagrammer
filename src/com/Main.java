package com;

import Graphics.*;

public class Main extends Diagram_Window {

    public Main(int width, int height) {
        super(width, height);
    }

    public static void main(String[] args) {
        //new Diagram_Window(800, 1000);
        new Menu_Window(400, 300);
    }
}


