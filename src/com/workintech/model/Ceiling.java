package com.workintech.model;

import com.workintech.model.enums.PaintColor;

public class Ceiling {

    private int height;
    private PaintColor color;

    public Ceiling(int height, PaintColor color) {
        this.height = height;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void create(){
        System.out.println("Ceiling with " + height + " and color with " + color + " has been created");
    }
}