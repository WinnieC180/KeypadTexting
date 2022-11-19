import java.util.Scanner;

public class RandMathQuiz {
    public static void main (String[] arg) {
        double score = 0.0;
        for (int i = 1; i <= 10; i++) {
            int num1 = (int)(Math.random()*20)+1;
            int num2 = (int)(Math.random()*20)+1;
            String sign = "";
            double answer =0.0;
            int operation = (int)(int)(Math.random()*4)+1;
            Scanner scan = new Scanner(System.in);

            switch (operation) {
                case 1:
                    sign= " + ";
                    answer = num1 + num2;
                    break;
                case 2:
                    sign = " - ";
                    answer = num1 - num2;
                    break;
                case 3:
                    sign = " * ";
                    answer = num1 * num2;
                    break;
                case 4:
                    sign = " % ";
                    answer = num1 % num2;
                    break;
            }
            System.out.println();
            System.out.println("Here's is equation number " + i + ": " + num1 + sign + num2);
            System.out.print("What's your answer?: ");
            double userAnswer = scan.nextDouble();
            if (userAnswer == answer) {
                System.out.println("You are correct!");
                score++;
            } else {
                System.out.println("Your answer is incorrect the correct answer is " + answer);
            }
        }

        System.out.println();
        System.out.println("     _______________________");
        System.out.println("        Your Score Is: " + (int)((score/10)*100) + "%");
        System.out.println("     _______________________");
        System.out.println("You got " + (int)(10 - score) + " wrong out of 10 questions");
    }
}
