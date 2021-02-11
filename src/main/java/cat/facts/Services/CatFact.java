package cat.facts.Services;

import java.util.Date;

public class CatFact {
    String text;
    String createAt;
    String updateAt;

    @Override
    public String toString() {
        return "CatFacts{" +
                "text='" + text + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }

}
