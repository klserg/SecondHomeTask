public class Human {
    private String firstName;
    private String lastName;
    private String surname;

    public Human(String surname, String firstName) {
        this.surname = surname;
        this.firstName = firstName;
    }

    public Human(String surname, String firstName, String lastName) {
        this.surname = surname;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getFullName() {
        if (lastName == null)
            System.out.printf("%s %s\n", surname, firstName);
        else
            System.out.printf("%s %s %s\n", surname, firstName, lastName);
    }

    public void getShortName() {
        if (lastName == null)
            System.out.printf("%s %.1s.\n", surname, firstName);
        else
            System.out.printf("%s %.1s. %.1s.\n", surname, firstName, lastName);
    }

}
