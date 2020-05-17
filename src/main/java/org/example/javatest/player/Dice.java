package org.example.javatest.player;

import java.util.Random;

public class Dice {

    private int size;

    public Dice(int size) {
        this.size = size;
    }

    public int roll() {
        return new Random().nextInt(size+1);
    }

}
