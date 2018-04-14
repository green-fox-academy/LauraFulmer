public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        double a = 6 * 17 * 5;
        System.out.println(a);
        double b = 52*17;

        int percentage = (int) Math.ceil((1 - (a/b)) * 100);
        System.out.println(percentage + "%");
    }
}