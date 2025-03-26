import java.util.Scanner;

public class test {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the priority of the case (High, Medium or Low): ");
        String priority = input.next();
        System.out.println("Enter 'true' if there is a critical bug associated with the test case and 'false' otherwise: ");
        boolean hasCriticalBug = input.nextBoolean();
        System.out.println("Enter the number of hours since the test case was ast executed: ");
        int hoursSinceLastExecution = input.nextInt();
        System.out.println("Enter 'Ready' if the environment is ready for test to execute and 'Not ready' if it's not: ");
        String environmentStatus = input.next();

        // You want priority to high or medium

        boolean havePriority =
                (priority.equalsIgnoreCase("medium") && hasCriticalBug)
                || priority.equalsIgnoreCase("high");
        boolean isExecutedRecently = hoursSinceLastExecution < 24;

        boolean isEnvReady = environmentStatus.equalsIgnoreCase("ready");

        if(
                isEnvReady && havePriority && !isExecutedRecently
        ){
            System.out.println("Test should be executed");
        }else if(!isEnvReady ){
            System.out.println("Test Case Skipped: Environment Not Ready");
        }else if(isExecutedRecently){
            System.out.println("Test Case Skipped: Execution Too Recent");
        }else{
            System.out.println("Test Case Skipped: Not Eligible");
        }

    }
}
