import java.security.SecureRandom;
public class responses {
    SecureRandom randGen = new SecureRandom();
    int number;
    int countCorrect = 0;

    public void responseCorrect() {


        number = randGen.nextInt(4) + 1;

        switch(number) {

            case 1:
                System.out.println("Very good!");

                break;

            case 2:
                System.out.println("Excellent!");

                break;

            case 3:
                System.out.println("Nice work!");

                break;

            case 4:
                System.out.println("Keep up the good work!");

                break;

        }

    }

    public void responseWrong() {
        int number;

        number = randGen.nextInt(4) + 1;

        switch(number) {

            case 1:
                System.out.println("No. Please try again.");
                break;

            case 2:
                System.out.println("Wrong. Try once more.");
                break;

            case 3:
                System.out.println("Don't give up!");
                break;

            case 4:
                System.out.println("No. Keep trying.");
                break;

        }
    }
}
