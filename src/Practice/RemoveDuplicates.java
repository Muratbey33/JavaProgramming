package Practice;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {


        String str1 = "abc";
        String str2 = "bcf";

        System.out.println(anagram(str1, str2));

    }

    public static boolean anagram(String str1, String str2) {

        char[] chr1 = str1.toCharArray();
        char[] chr2 = str2.toCharArray();

        Arrays.sort(chr1);
        Arrays.sort(chr2);


        boolean r = Arrays.toString(chr1).equals(Arrays.toString(chr2));

        return r;








    }
}