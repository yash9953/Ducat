package Ducat;

public class ComparisonCase {//demonstrate difference b/w .equals() & .equalsIgnoreCase()
          public static void main(String[] args) {
                    String s = "Yash";
                    String s2 = "yASh";
                    System.out.println(".equals() method for String "+s+" & "+s2+" = "+s.equals(s2));
                    System.out.println(".equalsIgnoreCase() method for String "+s+" & "+s2+" = "+s.equalsIgnoreCase(s2));

          }
}
