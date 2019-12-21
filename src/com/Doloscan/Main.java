package com.Doloscan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        sphereVolume();
    }

    static double sphereVolume() {

        Scanner scr = new Scanner(System.in);
        System.out.print("Enter radius of a sphere => ");
        double radius = scr.nextDouble();

        double volume = (4 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of a sphere is " + volume);

        return volume;
    }
}
