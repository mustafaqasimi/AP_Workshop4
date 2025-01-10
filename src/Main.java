import java.util.HashSet;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for 1 vote per voter. Enter 2 m vote per voter:");
        int type = sc.nextInt();
        String title;
        System.out.println("Enter title: ");
        title = sc.nextLine();
        System.out.println("Enter 1 for anonymous voting. Enter 0 for non-anonymous voting.");
        boolean isAnonymous = sc.nextBoolean();
        Voting votingSystem = new Voting(type, title, isAnonymous);


        Vote vote = new Vote(new Person("ali", "ahmadi"), String.valueOf(System.currentTimeMillis()));

    }
}