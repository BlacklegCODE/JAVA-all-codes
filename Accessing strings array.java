// arrays in java

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Harsh
{
    public static void main(String[] args) {
        // array = a collection of values of same data type !
        String[] fruit = {"apple", "orange","Banana"};
        //each value within an array is an element

        fruit[2] = "Pineapple";


//        System.out.println(fruit[2]);

//        System.out.println(fruit[1]);

        int numOfFruits = fruit.length;

        System.out.println(numOfFruits);

        for(int i = 0;i< fruit.length;i++)
        {
            System.out.println(fruit[i]);
        }

        //this below is the enhanced for loot. aka for each loop !

        for(String froot : fruit)
        {
            System.out.println(froot);
        }

        Arrays.sort(fruit);
        System.out.println();

        Arrays.fill(fruit,"Pineaple");

        for(String froot : fruit)
        {
            System.out.println(froot);
        }

    }
}
