import java.util.Scanner;

public class Solution {
    public static class Prime {
        public static boolean checkPrime(int numCheck) {

            if ((numCheck == 0) || (numCheck == 1)) return false;

            numCheck = Math.abs(numCheck);
            for (int j = numCheck - 1; j > 1 ; j--) {
                if (numCheck % j == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (Prime.checkPrime(numbers[i])) {
               output.append(numbers[i]).append(" ");
                System.out.println(output);
            }

        }
    }
}
