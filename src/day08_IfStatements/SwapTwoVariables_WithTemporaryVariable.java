package day08_IfStatements;

import java.util.Arrays;

public class SwapTwoVariables_WithTemporaryVariable {

    public static void main(String[] args) {


        int a = 15;
        int b = 10;

        //-------------

        int c = b ; // 15


        b = a ;  //b= 10
        a = c ;



        //------------

        System.out.println("a = " + a);  //15
        System.out.println("b = " + b);  //10

        }


    }




/*
1. write a program that can swipe two variables' value by using a temporary variable
		    Ex:
		        if a= 10, b=15
		    output:
		        a = 15
		        b = 10
 */