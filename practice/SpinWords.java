/* 
 * Spin Words
 * 11/14/22
 * 
 * Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
*/

public class SpinWords {
    public static void main (String args[]) {
        String str1 = "emocleW";
        String str2 = "Hey wollef sroirraw";
        String str3 = "This is another test";

        System.out.println(spin(str1));
        System.out.println(spin(str2));
        System.out.println(spin(str3));
    }

    public static String spin (String orig) {
        
        /*
         * if orig is empty, return spun as empty
         * split orig into a string array using a space as a delimeter
         * for each word in the array
         *      if the length is greater than 4
         *          reverse the word
         * reassemble the string and return
         */

        if (orig.length() == 0) return orig;

        String[] spunArr = orig.split(" ");
        for (int i = 0; i < spunArr.length; i++) {
            if (spunArr[i].length() > 4)
                spunArr[i] = new StringBuilder(spunArr[i]).reverse().toString();
        }
        return String.join(" ", spunArr);
    }
}