public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(String questionText, String correctAnswer) {
        super(questionText, correctAnswer);
    }

    @Override
    public void displayQuestion() {
        System.out.println(questionText + " (True/False)");
    }
}