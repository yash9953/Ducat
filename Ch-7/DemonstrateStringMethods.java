package Ducat;

public class DemonstrateStringMethods {
          public static void main(String[] args) {
                    String s = "It is better to deserve honours and not have them than to have them and not deserve them.";
                    System.out.println("indexOf('h') = "+s.indexOf('h'));
                    System.out.println("charAt(14) = "+s.charAt(14));
                    System.out.println("endsWith("+"Twain"+") = "+ s.endsWith("Twain"));
                    System.out.println("replace('a','A') = "+s.replace('a', 'A'));
          }
}
