import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList makingMatches(ArrayList girl, ArrayList boy) {
        ArrayList<String> matches = new ArrayList<>();
        for (int i = 0; i < (girl.size()); i++) {
            matches.add(girl.get(i).toString());
            for (int j = i; j < (boy.size()) ; j++) {
                matches.add(boy.get(i).toString());
                break;
            }
        }
        return matches;
    }
}