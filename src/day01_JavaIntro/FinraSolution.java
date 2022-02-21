package day01_JavaIntro;

import java.util.IllegalFormatCodePointException;

public class FinraSolution {

    public static void main(String[] args) {

        for (int number = 1 ; number<=30; number++ ){



            if (number % 15== 0){
                System.out.println("FINRA");
            }else if (number % 5== 0){
                System.out.println("RA");
            }else if (number % 3 == 0){
                System.out.println("FIN");
            }else{
                System.out.println(number);
            }

        }
    }
}



// division by 3 FIN
// divisiable by 5 RA
// divisible by 15 finra