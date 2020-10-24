package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int i=0;
        for (i=0; i<=100; i++)
        {
            //vereficação para os multiplus de 3
            if((i % 3 == 0) & (i % 5!=0))
            {
                System.out.println(i+"->[FIZZ]");
            }

            //vereficação para os multiplus de 5
            if((i % 5 == 0) & (i % 3!=0))
            {
                System.out.println(i+"->[BUZZ]");
            }

            //vereficação para os multiplus de 3 e 5
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(i+"->[FIZZBUZZ]");
            }

            //vereficação para os NÃO multiplus de 3 e 5
            if(i % 3!=0 && i % 5!=0)
            {
                System.out.println(i);
            }

        }
    }
}