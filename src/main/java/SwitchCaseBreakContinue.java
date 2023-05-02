import java.util.Scanner;
import static java.lang.System.in;

public class SwitchCaseBreakContinue {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(in);
        String correctAnswer;

        System.out.println("Отгадай загадку, у тебя три попытки");
        System.out.println("Не лает, не кусает, а в дом не пускает? Что это?");
        System.out.println("Можешь написать сдаюсь для завершения программы");

        one: for (int i = 0; i <= 3; i++) {

            correctAnswer = scanner.nextLine();

            switch (correctAnswer) {
                case ("замок") :
                    System.out.println("Правильно!");
                    break one;

                case ("сдаюсь") :
                    System.out.println("Слабак!");
                    break one;

                default:
                    System.out.println("Не верно, попробуй еще раз");
            }
        }
    }
}



class SwitchCaseContinue {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(in);
        String correctAnswer;

        System.out.println("Отгадай загадку, у тебя три попытки");
        System.out.println("Не лает, не кусает, а в дом не пускает? Что это?");
        System.out.println("Можешь написать сдаюсь для завершения программы");

        int i;
        one: for (i = 0; i < 3; i++) {

            correctAnswer = scanner.nextLine();

            switch (correctAnswer) {
                case ("замок") :
                    System.out.println("Правильно!");
                    continue one;

                case ("сдаюсь") :
                    System.out.println("Слабак!");
                    continue one;

                default:
                    System.out.println("Не верно, попробуй еще раз");
            }
        }
    }
}
