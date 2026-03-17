public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("Welcome to Online Quiz Engine\n");

            QuizEngine quiz = new QuizEngine();

            quiz.loadQuestions();
            quiz.startQuiz();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
