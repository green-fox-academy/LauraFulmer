public class Sponsor extends Person{
    public String company;
    public int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
       this("Jane Doe", 30, "female", "Google");
       this.hiredStudents = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public int hire() {
        hiredStudents ++;
        return hiredStudents;
    }

    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }
}
