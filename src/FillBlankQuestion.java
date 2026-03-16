public class FillBlankQuestion extends Question {

    public FillBlankQuestion(String questionText, String correctAnswer) {
        super(questionText, correctAnswer);
    }

    @Override
    public void displayQuestion() {
        System.out.println(questionText);
    }
}
