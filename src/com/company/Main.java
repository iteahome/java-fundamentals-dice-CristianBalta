package com.company;

public class Main {

    public static void main(String[] args) {

        int rolls1[] = {1, 2, 3, 4, 6, 6, 3};
        int rolls2[] = {1, 2, 3, 4, 6, 6};

        System.out.println(nrOfGirls(rolls1));
        System.out.println(nrOfGirls(rolls2));


    }

    private static int nrOfGirls(int rolls[])
    {
        int nr = 0;
        int error = -1;

        if (rolls[rolls.length-1]!= 6)
        {
            for (int i = 0; i <rolls.length; i++)
            {
                if (rolls[i] != 6) nr++;

            }
        }
        else return error;

        return nr;
    }

}
