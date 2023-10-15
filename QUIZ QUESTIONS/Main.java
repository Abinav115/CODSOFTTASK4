import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<QuizQuestion> questions = new ArrayList<>();

        System.out.print("Enter the number of questions for the quiz: ");
        int numQuestions = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numQuestions; i++) {
            System.out.print("Enter question " + (i + 1) + ": ");
            String question = scanner.nextLine();

            List<String> options = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter option " + (j + 1) + ": ");
                options.add(scanner.nextLine());
            }

            System.out.print("Enter the correct answer index (1-4): ");
            int correctAnswerIndex = scanner.nextInt() - 1;
            scanner.nextLine(); // Consume newline

            questions.add(new QuizQuestion(question, options, correctAnswerIndex));
        }

        // TODO: Implement quiz logic, timer, score calculation, and result display here
    }
}
