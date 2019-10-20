import java.util.Scanner;
import java.security.SecureRandom;

public class secureRandom {
    private boolean product = false;
    double correctAnswerCount = 0;
    double wrongAnswerCount = 0;

    public void randomQuestion(int a, int b) {
        SecureRandom randGen = new SecureRandom();

        for(int i = 0; i < 5; ++i ) {
            a = 2;
            b = randGen.nextInt(9) + 1;

            multiplicationCheck(a, b);
        }


    }

    public double countCheck(double correct) {
    double percentage;
        return percentage = (correct / 5) * 100;

    }

    public void multiplicationCheck(int num1, int num2) {
        Scanner scnr = new Scanner(System.in);
        SecureRandom randGen = new SecureRandom();
        responses printMessage = new responses();

        int userAnswer;
        double percentage;



        for (int i = 0; i < 10; ++i) {
            num1 = 2;
            num1 = randGen.nextInt(9) + 1;

            System.out.print("What is " + num1 + " times " + num2);

            userAnswer = scnr.nextInt();

            if ((num1 == 2 && num2 == 1) || (num1 == 1 && num2 == 2)) {

                if (userAnswer == 2) {
                    product = true;


                } else {
                    product = false;


                }
            } else if ((num1 == 2 && num2 == 2) || (num1 == 2 && num2 == 2)) {

                if (userAnswer == 4) {
                    product = true;

                } else {
                    product = false;


                }
            } else if ((num1 == 2 && num2 == 3) || (num1 == 3 && num2 == 2)) {

                if (userAnswer == 6) {
                    product = true;

                } else {
                    product = false;


                }
            } else if ((num1 == 2 && num2 == 4) || (num1 == 4 && num2 == 2)) {

                if (userAnswer == 8) {
                    product = true;

                } else {
                    product = false;


                }
            } else if ((num1 == 2 && num2 == 5) || (num1 == 5 && num2 == 2)) {

                if (userAnswer == 10) {
                    product = true;

                } else {
                    product = false;


                }
            } else if ((num1 == 2 && num2 == 6) || (num1 == 6 && num2 == 2)) {

                if (userAnswer == 12) {
                    product = true;

                } else {
                    product = false;


                }
            } else if ((num1 == 2 && num2 == 7) || (num1 == 7 && num2 == 2)) {

                if (userAnswer == 14) {
                    product = true;

                } else {
                    product = false;


                }
            } else if ((num1 == 2 && num2 == 8) || (num1 == 8 && num2 == 2)) {

                if (userAnswer == 16) {
                    product = true;

                } else {
                    product = false;


                }
            } else if ((num1 == 2 && num2 == 9) || (num1 == 9 && num2 == 2)) {

                if (userAnswer == 18) {
                    product = true;

                } else {
                    product = false;


                }
            } else if ((num1 == 3 && num2 == 1) || (num1 == 1 && num2 == 3)) {

                if (userAnswer == 3) {
                    product = true;

                } else {
                    product = false;


                }
            } else if ((num1 == 3 && num2 == 2) || (num1 == 2 && num2 == 3)) {

                if (userAnswer == 6) {
                    product = true;

                } else {
                    product = false;


                }
            } else if ((num1 == 3 && num2 == 3) || (num1 == 3 && num2 == 3)) {

                if (userAnswer == 9) {
                    product = true;

                } else {
                    product = false;

                }
            }

            //}

            if (product == true) {
                printMessage.responseCorrect();
                correctAnswerCount++;

            } else if (product == false) {
                printMessage.responseWrong();
                wrongAnswerCount++;

            }
        }



        percentage = (correctAnswerCount / 5) * 100;

        if (percentage > 75.00) {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else {
            System.out.println("Please ask your teacher for extra help.");
        }


    }
}
