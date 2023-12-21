package Ducat;

public class CompareStringValues {//demonstrate compareTo() method
          public static void main(String[] args) {
                    //to positive number
                    String s1 = "cba";
                    String s2 = "abc";
                    System.out.println("Positive Value = "+s1.compareTo(s2));
                    s1 = "bca";
                    s2 = "cba";
                    System.out.println("Negative Value = "+s1.compareTo(s2));
                    s1 = "abc";
                    s2 = "abc";
                    System.out.println("Zero Value = "+s1.compareTo(s2));
          }
}
