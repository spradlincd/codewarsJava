import java.lang.StringBuilder;

public class ReverseWords {

    public static void main (String args[]) {
    // Have at it
    String str1 = "ehT kciuq nworb xof spmuj revo eht yzal .god";
    String str2 = "elppa";
    String str3 = "a b c d";
    String str4 = "elbuod  decaps  sdrow";
    String str5 = "This is an example! ";
    String str6 = "double  spaces";

    System.out.println(reverseWords(str1));
    System.out.println(reverseWords(str2));
    System.out.println(reverseWords(str3));
    System.out.println(reverseWords(str4));
    System.out.println(reverseWords(str5));
    System.out.println(reverseWords(str6));

  }

  public static String reverseWords(String original) {

    String[] strArr = original.split(" ");

    // if the array is empty, return original string
    if (strArr.length == 0) return original;

    //use StringBuilder to reverse the strings
    for (int i = 0; i < strArr.length; i++)
      strArr[i] = new StringBuilder(strArr[i]).reverse().toString();

    // reunite the reversed strings and return
    return String.join(" ", strArr);
    
  }
}
