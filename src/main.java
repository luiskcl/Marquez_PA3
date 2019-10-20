import java.util.Scanner;
import java.security.SecureRandom;
public class main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        SecureRandom randGen = new SecureRandom();

        secureRandom question = new secureRandom();
        secureRandom countCheck = new secureRandom();

        int numA;
        int numB;
        int product;
        int response;


        numA = 2;
        numB = randGen.nextInt(9) + 1;

        question.multiplicationCheck(numA, numB);

        //System.out.println(countCheck.countCheck(2, 2));

        System.out.println("DONE");

    }
}
