import java.util.Scanner;

public class Main {
    public static void main (String[] arg){
        Scanner scan = new Scanner(System.in);

        final String TWO = "abc";
        final String THREE = "def";
        final String FOUR = "ghi";
        final String FIVE = "jkl";
        final String SIX = "mno";
        final String SEVEN = "pqrs";
        final String EIGHT = "tuv";
        final String NINE = "wxyz";
        final String ZERO = " ";

        String number = "";
        String firstLetter = "";
        int index = 0;
        int num = 10;

        System.out.println();
        System.out.print("Enter a message: ");
        String message = scan.nextLine();

        while (message.length() != 0) {
            firstLetter = message.substring(0, 1);

            if (TWO.indexOf(firstLetter) != -1) {
                index = TWO.indexOf(firstLetter);
                if (message.length() != 1) {
                    message = message.substring(1);
                } else {
                    message = "";
                }
                num = 2;
            }

            if (THREE.indexOf(firstLetter) != -1) {
                index = THREE.indexOf(firstLetter);
                if (message.length() != 1) {
                    message = message.substring(1);
                } else {
                    message = "";
                }
                num = 3;
            }

            if (FOUR.indexOf(firstLetter) != -1) {
                index = FOUR.indexOf(firstLetter);
                if (message.length() != 1) {
                    message = message.substring(1);
                } else {
                    message = "";
                }
                num = 4;
            }

            if (FIVE.indexOf(firstLetter) != -1) {
                index = FIVE.indexOf(firstLetter);
                if (message.length() != 1) {
                    message = message.substring(1);
                } else {
                    message = "";
                }
                num = 5;
            }

            if (SIX.indexOf(firstLetter) != -1) {
                index = SIX.indexOf(firstLetter);
                if (message.length() != 1) {
                    message = message.substring(1);
                } else {
                    message = "";
                }
                num = 6;
            }

            if (SEVEN.indexOf(firstLetter) != -1) {
                index = SEVEN.indexOf(firstLetter);
                if (message.length() != 1) {
                    message = message.substring(1);
                } else {
                    message = "";
                }
                num = 7;
            }

            if (EIGHT.indexOf(firstLetter) != -1) {
                index = EIGHT.indexOf(firstLetter);
                if (message.length() != 1) {
                    message = message.substring(1);
                } else {
                    message = "";
                }
                num = 8;
            }

            if (NINE.indexOf(firstLetter) != -1) {
                index = NINE.indexOf(firstLetter);
                if (message.length() != 1) {
                    message = message.substring(1);
                } else {
                    message = "";
                }
                num = 9;
            }

            if (ZERO.indexOf(firstLetter) != -1) {
                index = ZERO.indexOf(firstLetter);
                if (message.length() != 1) {
                    message = message.substring(1);
                } else {
                    message = "";
                }
                num = 0;
            }

            if (index == 0) {
                number = number + num;
            } else if (index ==1) {
                number = number + num + num;
            } else {
                number = number + num + num + num;
            }
        }

        System.out.println(number);
    }
}
