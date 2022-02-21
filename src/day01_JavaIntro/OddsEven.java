package day01_JavaIntro;

import java.util.Scanner;

public class OddsEven {

    public static void main(String[] args) {

        Scanner murat = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number =  murat.nextInt();

        if (number % 2 == 1){
            System.out.println("Odd = "+ number);
        }else {
            System.out.println("Even = "+ number);
        }



    }
}