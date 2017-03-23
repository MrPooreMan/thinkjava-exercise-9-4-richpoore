
public class Recurse {
    /**
    * Returns the first character of the given String.
    * 
    * @return the first character of the given string <s>
    * 
    * @param s The string the first character is to be returned from
    */
    public static char first(String s) {
    return s.charAt(0);
    }
    
    /**
    * Returns all but the first letter of the given String.
    */
    public static String rest(String s) {
    return s.substring(1);
    }
    
    /**
    * Returns all but the first and last letter of the String.
    */
    public static String middle(String s) {
    return s.substring(1, s.length() - 1);
    }
    
    /**
    * Returns the length of the given String.
    */
    public static int length(String s) {
    return s.length();
    }

}
