package com.workintech.model;

import com.workintech.model.enums.Direction;

public class Wall {

    private Direction direction; //NORTH, WEST, EAST, SOUTH

    public Wall(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public void create(){
        System.out.println("Wal has been created on: " + getDirection());
    }
}