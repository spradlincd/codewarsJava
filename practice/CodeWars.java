class CodeWars {
  /*
  * 10/16/22
  * 7 kyu Reverse words
  * Complete the function that accepts a string parameter, and reverses each word in the string.
  * All spaces in the string should be retained.
  */

  public static String reverseWords2(String original) {

    String[] strArr = original.split(" ");

    // if the array is empty, return original string
    if (strArr.length == 0) return original;

    //use StringBuilder to reverse the strings
    for (int i = 0; i < strArr.length; i++)
      strArr[i] = new StringBuilder(strArr[i]).reverse().toString();

    // reunite the reversed strings and return
    return String.join(" ", strArr);
    
  }

  public static String reverseWords1(String original) {
    String revStr = "";
    String tempStr = "";
    for (int i = 0; i < original.length(); i++) {
      
      if (i == original.length() - 1) {
        tempStr = original.charAt(i) + tempStr;
        revStr += tempStr;
      }
      else if (original.charAt(i) != ' ') {
        tempStr = original.charAt(i) + tempStr;
      }
      else {
        revStr += tempStr + ' ';
        tempStr = "";
      }
      
    }
    return revStr;
  }


  class Solution3 {
    public static String camelCase(String input) {
      
      return String.join( " ", input.split( "(?=[A-Z])" ) );
      
    }/*
  * 10/15/22
  * 6 kyu Break camelCase
  * Complete the solution so that the function will break up camel casing, using a space between words.
  */
  }

  class Solution2 {
    public static String camelCase(String input) {

      String ret = "";
      
      // make sure there is a string available to manipulate
      if (!input.isEmpty()) {
        // iterate through the rest of the string and add spaces
        for (int i = 0; i < input.length(); i++) {
          ret += Character.isUpperCase(input.charAt(i)) ? (" " + input.charAt(i)) : (input.charAt(i));
        }
      }
      
      // return the result
      return ret;
    }
  }

  class Solution1 {
    public static String camelCase(String input) {
      String ret = "";

      if (input.length() > 0) {
        for (int i = 0; i < input.length(); i++) {
          if (input.charAt(i) > 0x40 && input.charAt(i) < 0x5B)
            ret += " " + input.charAt(i);
          else ret += input.charAt(i);
        }
      }
      
      return ret;
    }
  }

  /*
  * 10/15/22
  * 8 kyu Returning Strings
  * Make a function that will return a greeting statement that uses an input; your program should return, "Hello, <name> how are you doing today?* ".
  *
  * [Make sure you type the exact thing I wrote or the program may not execute properly]
  *
  */

  public class Kata
  {
    public static String greet(String name)
    {
      // Your code here
      return new String("Hello, " + name + " how are you doing today?");
    }
  }

  /*
  * 10/9/22
  * 8 kyu Convert boolean values to strings 'Yes' or 'No'.
  * Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
  */

  class YesOrNo
  {
    public static String boolToWord(boolean b)
    {
      return b ? "Yes" : "No";
    }
    
  }

  /*
      10/9/22
      8 kyu  Remove String Spaces
      Simple, remove the spaces from the string, then return the resultant string.
  */

  public class Kata1 {
      public static String noSpace(final String x) {
        String ret = new String();
        
        for (int i = 0; i < x.length(); i++) {
          if (x.charAt(i) != ' ') { ret += x.charAt(i); }
        }
        
        return ret;
      }
  }
}