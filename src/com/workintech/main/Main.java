package com.workintech.main;

import com.workintech.model.enums.Direction;
import com.workintech.model.enums.LampType;
import com.workintech.model.enums.PaintColor;
import com.workintech.model.*;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("Ahmet",
                new Wall(Direction.NORTH),
                new Wall(Direction.SOUTH),
                new Wall(Direction.WEST),
                new Wall(Direction.EAST),
                new Ceiling(3, PaintColor.WHITE),
                new Lamp(LampType.LAVA, true, 4),
                new Wardrobe(2, 4, 40),
                new Carpet(3,5, PaintColor.RED),
                new Bed("Çift Kişilik", 4, 1, 2, 2));

        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();

        System.out.println("********************");

        System.out.println(bedroom.getBed());
        System.out.println(bedroom.getLamp());

        //String ler immutable
        String name1 = "Dogancan";
        String name2 = "Dogancan";
        String name3 = name1;

        if(name1.equals(name2)){
            System.out.println("Eşit");
        } else{
            System.out.println("Eşit değil");
        }
    }
}