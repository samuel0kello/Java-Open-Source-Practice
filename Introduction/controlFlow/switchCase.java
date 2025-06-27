
/**
 * This code demonstrates the use of a switch-case statement in Java.
 * The switch-case statement allows for multi-way branching based on the value of a variable.
 * In this example, it checks the value of the variable `day` and prints the corresponding
 * day of the week. If the value does not match any case, it defaults to printing "Invalid day".
 * The `break` statement is used to exit the switch block after a case is executed.
 * If no `break` is used, the execution will continue into the next case (known as "fall-through").
 */
public class switchCase {

    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}