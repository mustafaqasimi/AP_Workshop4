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

    public void setChoices(HashMap<String , HashSet<Vote>> choices) {
        this.choices = choices;
    }

    public void createChoices(String choice) {
        if (!this.choices.containsKey(choice)) {
            this.choices.put(choice, new HashSet<>());
        }

    }

    public void vote (Person voter ,String voter_choices) {
        if (this.type == 0 && voters.contains(voter)) {
            System.out.println(
                    voter.getName() + " " + voter.getSurname() + " has already voted and can not vote again.");
            return;
        }

        HashSet<Vote> votes = this.choices.getOrDefault(choices, new HashSet<>());
        votes.add(new Vote(voter, "2004-08-12"));
        this.choices.put(voter_choices, votes);
        this.voters.add(voter);
    }
    public void vote(Person person,ArrayList<String> choices){
        for (String choice : choices) {
            vote(person, choice);
        }

    }
    public void printResults() {
        System.out.println("Voting results for: " + this.question);
        for (String choice : this.choices.keySet()) {
            System.out.println(choice + ": " + this.choices.get(choice).size() + " votes");
        }
    }

    public void printVoters() {
        if (this.isAnonymous) {
            System.out.println("The voting is anonymous. Voters' names cannot be displayed.");
            return;
        }

        System.out.println("Voters:");
        for (Person voter : this.voters) {
            System.out.println(voter.toString());
        }
    }

    public ArrayList<String> getChoices() {
        return new ArrayList<>(this.choices.keySet());
    }




}
