public class MCQQuestion extends Question {

    private String[] options;

    public MCQQuestion(String questionText, String[] options, String correctAnswer) {
        super(questionText, correctAnswer);
        this.options = options;
    }

    @Override
    public void displayQuestion() {

        System.out.println(questionText);

        for(String option : options) {
            System.out.println(option);
        }
    }
}
