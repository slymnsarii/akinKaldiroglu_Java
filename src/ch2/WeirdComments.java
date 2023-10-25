package ch2;

public class WeirdComments {

    // /** That has no effect! */

    public static void main(String[] args) {
        int /** */ i = 5;
        boolean b = /** */ true;
        int k /** */ = i/** */++;
        System.out.println(i);
    }
}
