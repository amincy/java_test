package com.gifmis;

public class Main {

    public static void main(String[] args){

    Animal cow = new Animal(3, "moo", "calf");
    Animal fowl = new Animal(2, "clurk", "chick");
            // write your code here
        System.out.println(fowl.getSound());
        System.out.println(cow.getPikin());
        System.out.println(cow.getLegs());
        cow.setLegs(12);
        System.out.println(cow.getLegs());
        System.out.println("This is my first GIT repository");
        }
    }

