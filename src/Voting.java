import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Voting {
    private int type;
    private String question;
    private List<Person> voters = new ArrayList<>();
    private HashMap<String , HashSet<Vote>> choices ;
    private boolean isAnonymous;
    public Voting(int type,String question,boolean isAnonymous) {
        this.type = type;
        this.question = question;
        this.isAnonymous = isAnonymous;

    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public List<Person> getVoters() {
        return voters;
    }
    public void setVoters(List<Person> voters) {
        this.voters = voters;
    }
    public HashMap<String , HashSet<Vote>> getChoices() {
        return choices;
    }
    public void setChoices(HashMap<String , HashSet<Vote>> choices) {
        this.choices = choices;
    }




}
