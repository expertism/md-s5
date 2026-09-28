package org.mdigital;


public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1;
        }

        int occurrences = 1;
        double currentHeight = h * bounce;

        while (currentHeight > window) {
            occurrences += 2;
            currentHeight *= bounce;
        }

        return occurrences;
    }

    public static void main(String[] args) {
        System.out.println(bouncingBall(3.0, 0.66, 1.5));
        System.out.println(bouncingBall(30.0, 0.66, 1.5));
        System.out.println(bouncingBall(3.0, 0.66, 4.0));
    }
}
