package components;

import java.util.List;
import java.util.Arrays;

public class QuestionProvider {

    // Method to get the list of questions
    public static List<String> getQuestions() {
        return Arrays.asList(
                "1. How effective is the teacher in explaining concepts?",
                "2. How well does the teacher engage with the students during class?",
                "3. How approachable is the teacher for questions and help?",
                "4. Has the teacher contributed to your personal growth or interest in the subject?",
                "5. How would you describe the classroom environment created by the teacher?"
        );
    }
}
