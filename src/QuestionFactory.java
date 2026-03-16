public class QuestionFactory {

    public static Question createQuestion(String type) {

        if(type.equalsIgnoreCase("MCQ")) {

            String[] options = {
                "A. Java",
                "B. Python",
                "C. C++",
                "D. Ruby"
            };

            return new MCQQuestion(
                    "Which language is platform independent?",
                    options,
                    "A"
            );
        }

        else if(type.equalsIgnoreCase("TRUEFALSE")) {

            return new TrueFalseQuestion(
                    "Java supports Object Oriented Programming.",
                    "True"
            );
        }

        else if(type.equalsIgnoreCase("FILLBLANK")) {

            return new FillBlankQuestion(
                    "Java was developed by ______.",
                    "James Gosling"
            );
        }

        return null;
    }
}
