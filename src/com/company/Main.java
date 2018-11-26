package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        for(int p = 0; p < 5; p++) {


            int runNum = ((p % 5 == 5) ? (1) : 0));

            int runNum = 1;
            int num = 0;
            int reps = 0;
            int avg[] = new int[runNum];
            boolean val[] = new boolean[100];
            boolean con = true;


            //Sets every element in the val array false
            for (int i = 0; i < val.length; i++) {
                val[i] = false;
            }

            Bull list = new Bull(val);

            for (int i = 0; i < runNum; i++) {
                reps = 0;
                while (con == true) {

                    num = (int) ((Math.random() * 100) + 1);

                    //System.out.println(" " + num + " ");

                    val[num - 1] = true;


                    if (list.numTrue() == 100) {
                        con = false;
                    }

                    reps++;


                }

                avg[i] = reps;
                int time = i + 1;
                //System.out.println("Number of reps for \"" + time + "\" time: " + avg[i]);


                //Resets the boolean array and the number of reps
                for (int k = 0; k < val.length; k++) {
                    val[k] = false;
                }
                con = true;


            }

            int totalAvg = 0;

            for (int i = 0; i < avg.length; i++) {
                totalAvg = totalAvg + avg[i];
            }
            totalAvg = totalAvg / avg.length;

            System.out.println("\nOverall average for \"" + runNum + "\" times: " + totalAvg);


        }


    }


}
