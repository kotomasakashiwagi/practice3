import java.util.HashMap;
import java.util.Map;

public class QuestionSelector {
    private static final Map<String, Question> mapSec3 = new HashMap<String, Question>() {
        {
            put("3-1", new Question1());
            put("3-2", new Question2());
            put("3-3", new Question3());
            put("3-4", new Question4());
            put("3-5", new Question5());
            put("3-6", new Question6());
            put("3-7", new Question7());
            put("3-8", new Question8());
            put("3-9", new Question9());
            put("3-10", new Question10());
            put("3-11", new Question11());
            put("3-12", new Question12());
            put("3-13", new Question13());
            put("err", new OutOfQuestion());
        }
    };

    public static void selectQuestion(String s) {
        System.out.println(s);
        try {
            mapSec3.get(s).run();
        } catch (NullPointerException e) {
            mapSec3.get("err").run();
        }

    }
}
