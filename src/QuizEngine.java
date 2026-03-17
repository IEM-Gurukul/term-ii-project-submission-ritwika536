import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizEngine {

    private List<Question> questions = new ArrayList<>();
    private int score = 0;

    public void loadQuestions() {

        questions.add(QuestionFactory.createQuestion("MCQ"));
        questions.add(QuestionFactory.createQuestion("TRUEFALSE"));
        questions.add(QuestionFactory.createQuestion("FILLBLANK"));
    }
    public void startQuiz() {

        Scanner scanner = new Scanner(System.in);

        for (Question q : questions) {

            q.displayQuestion();

            System.out.print("Your Answer: ");
            String answer = scanner.nextLine();

            if (q.checkAnswer(answer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong Answer!\n");
            }
        }
        System.out.println("Final Score: " + score + "/" + questions.size());
    }
}

