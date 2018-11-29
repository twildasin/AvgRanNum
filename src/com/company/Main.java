package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {


            //Amount of times the program repeats
            int runNum = 10000;
            int num = 0;
            int reps = 0;
            int avg[] = new int[runNum];
            boolean val[] = new boolean[100];
            boolean con = true;
        

            //Instantiates a new Bull object called list with parameter of the boolean array
            Bull list = new Bull(val);

            //This for loop is how many times we are seeing how many reps it takes to generate all number from 1-100 inclusive.
            for (int i = 0; i < runNum; i++) {
                reps = 0;
                while (con == true) {

                    //Generates random number from 0-99 inclusive. Even though we are trying to find 1-100 inclusive, since we keep the same range for the entire code, it is the same probability.
                    num = (int) ((Math.random() * 100));

                    //System.out.println(" " + num + " ");

                    //Sets the position in the boolean array equal to true. (position in the array equals the random number generated (0-99))
                    val[num] = true;

                    //Runs numTrue method (explained in the Bull class) to see if all elements in the boolean array are true.
                    if (list.numTrue() == 100) {
                        con = false;
                    }

                    reps++;

                }
                avg[i] = reps;
                //System.out.println("Number of reps for \"" + time + "\" time: " + avg[i]);


                //Resets the boolean array and the number of reps
                for (int k = 0; k < val.length; k++) {
                    val[k] = false;
                }
                //Resets the boolean variable for the while loop
                con = true;
            }

            int totalAvg = 0;

            //Finds the average number of reps for the number of iterations
            for (int i = 0; i < avg.length; i++) {
                totalAvg = totalAvg + avg[i];
            }
            totalAvg = totalAvg / avg.length;


            //Prints out the average reps for _____ iterations
            System.out.println("\nOverall average for \"" + runNum + "\" times: " + totalAvg);

        }

}
