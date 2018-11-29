package com.company;

/**
 * Created by tw073 on 11/26/18.
 */
public class Bull { //The name is supposed to be "bool" (for boolean) but this is easier to avoid syntax errors.

    //Class is used mainly for the numTrue method

    boolean[] array;

    public Bull (boolean[] a)
    {
        array = a;
    }

    //Method adds up how many elements in the boolean array are true and returns that value (all true should print out 100)
    public int numTrue ()

    {
            int all = 0;

            for (int j = 0; j < array.length; j++)
            {
                if (array[j] == true)
                {
                    all ++;
                }

            }
        return all;
    }

}
