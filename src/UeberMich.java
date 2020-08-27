import java.time.LocalDate;

public class UeberMich {
    public static void main(String[] args) {

        int age = 26;
        String firstName = "Vanessa";
        String lastName = "Tiziani";
        char gender = 'W';
        LocalDate birthday = LocalDate.of(1993, 11, 15);
        double averageGrades = 3.4;
        boolean married = false;

        System.out.printf("Hello, my name is %s %s. I'm born on %s and i'm %C. My Grades' average is %.1f and married = %b.%n", firstName, lastName, birthday, gender, averageGrades, married);

    }
}
