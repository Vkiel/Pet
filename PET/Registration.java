import java.util.Scanner;

public class Registration {

    static Register register = new Register();

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter firstName => ");
            String firstName = scanner.nextLine();
            register.setFirstName(firstName);

            System.out.print(" Enter password => ");
            String password = scanner.nextLine();
            register.setPassword(password);

            System.out.println(register.toString());
        }
    }
}

class Register {
    private String firstName;

    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "Registered firstName=" + firstName + ", password=" + password;
    }
}