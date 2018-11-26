package com.company;

/**
 * Created by tw073 on 11/26/18.
 */
public class Bull {

    boolean[] array;

    public Bull (boolean[] a)
    {
        array = a;
    }

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
