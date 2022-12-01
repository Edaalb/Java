package practice_04;

import java.util.Scanner;

public class dmfd {
    public static void main(String[] args) {
         /*Write a Java program to find a number that appears only once in a given array of
    integers, all numbers occur twice. */

        int n;
        System.out.println("Please write how many elements the number array has : ");
        Scanner scan = new Scanner(System.in);
        int elementNumber = scan.nextInt();
        int elementList[ ] = new int [ elementNumber ];
        int isSearched[ ] = new int [ elementNumber ];
        for (int i = 0; i < elementNumber; i++) {
            System.out.println((i+1) + ". number : ");
            elementList[i] = scan.nextInt();

        }
        int bakilansayi = 0;
        for (int i = 0; i < elementNumber; i++) {
            int a = 0;
            for (int j = 0; j < elementNumber; j++) {
                if(elementList[i]==isSearched[j])
                {
                    a++;
                }
            }
            if(a == 0 )
            {
                int howManyNumbers = 0;
                for (int t = 0; t < elementNumber; t++) {
                    if(elementList[i]== elementList[t])
                    {
                        howManyNumbers ++;
                    }
                }
                isSearched[bakilansayi] = elementList[i];
                bakilansayi ++;
                System.out.println("Number " + elementList[i]  + " is found " + howManyNumbers + " times in the List ");

            }
        }

    }

}

