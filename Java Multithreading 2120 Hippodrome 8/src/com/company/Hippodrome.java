package com.company;

/*

2113 Hippodrome 8

In the run method, do a cycle from 1 to 100. This will be our race.
In the body of the loop, we first call move, then print.
To prevent the whole cycle from working in a split second - add Thread.sleep (200) to it;

Requirements:
1. In the run method of the Hippodrome class, the move method must be called 100 times.
2. In the run method of the Hippodrome class, the print method must be called 100 times.
3. In the run method of the Hippodrome class, the Thread.sleep (200) method must be called 100 times.
4. The print method must be called after the move method.


 */

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static Hippodrome game;
    private List<Horse> horses;

    public List<Horse> getHorses() {
        return this.horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) {
        Horse horse1 = new Horse("me", 3, 0);
        Horse horse2 = new Horse("myself", 3, 0);
        Horse horse3 = new Horse("i", 3, 0);
        List<Horse> horses = new ArrayList<Horse>();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game = new Hippodrome(horses);
        }
        public void move() {
        }
        public void print() {
        }
        public void run() {
        for (int i=0; i<100; i++) {
            this.move();
            this.print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
}

