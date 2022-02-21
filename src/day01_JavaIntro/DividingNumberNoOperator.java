package day01_JavaIntro;

import java.util.Scanner;

public class DividingNumberNoOperator {

    public static void main(String[] args) {

        int a = 80;
        int b = 7;

        System.out.println(dvision(a,b));
        System.out.println(dvision(20,3));

        division2(30,8);
    }

    public static int dvision(int a , int b){

        int result = 0;

        while (a>=b){
            a-=b;
            result++;
        }
        return result;

    }

    public static  void division2(int a, int b){
        int result = 0;

        while (a>=b){
            a-=b;
            result++;

        }
        System.out.println(result);


    }



    }



