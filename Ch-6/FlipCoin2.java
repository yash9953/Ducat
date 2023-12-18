package Ducat;

public class FlipCoin2 {
          public static void main(String[] args) {
                    int head = 0, tail = 0;
                    for (int i = 1; i <= 1000; i++) {
                              // Generate a random number between 0 and 1
                              double result = Math.random();
                              // If the result is 0.5 or less, it is heads; otherwise, it is tails
                              if (result <= 0.5) {
                                        head++;
                                        // System.out.println("Toss " + i + ": Heads");
                              } else {
                                        tail++;
                                        // System.out.println("Toss " + i + ": Tails");
                              }
                    }
                    System.out.println("Head Percentage % = " + (float)(head * 100) / 1000);
                    System.out.println("Tail Percentage % = " + (float)(tail * 100) / 1000);
          }
}
