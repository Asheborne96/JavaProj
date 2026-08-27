import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramLauncher 
{

    private static final String JAVA_HOME = System.getProperty("java.home");
    private static final String JAVA_COMMAND = JAVA_HOME + File.separator + "bin" + File.separator + "java";
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int choice;

        do 
        {
            System.out.println("==========================================");
            System.out.println("\nChoose a school activity:");
            System.out.println("\n1. Biodata");
            System.out.println("\n2. Calculator");
            System.out.println("\n3. Relational Operators");
            System.out.println("\n4. Exit");
            System.out.println("\n==========================================");
            System.out.print("\nEnter your choice: ");

            choice = readChoice();

            switch (choice)
            {
                case 1:
                    runProgram("Biodata.java");
                    break;
                case 2:
                    runProgram("Calculator.java");
                    break;
                case 3:
                    runProgram("RelationalOperators.java");
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } 
        while (choice != 4);
    }

    private static int readChoice()
    {
        while (!INPUT.hasNextInt()) 
        {
            System.out.println("Please enter a number.");
            INPUT.next();
            System.out.print("Enter your choice: ");
        }
        return INPUT.nextInt();
    }

    private static void runProgram(String fileName) 
    {
        String sourcePath = "School Activity Projects" + File.separator + fileName;

        try

        {
            Process process = new ProcessBuilder(JAVA_COMMAND, sourcePath)
                    .inheritIO()
                    .start();
            process.waitFor();
        } 
        
        catch (IOException exception) 

        {
            System.out.println("Could not start " + fileName + ": " + exception.getMessage());
        } 

        catch (InterruptedException exception) 

        {
            Thread.currentThread().interrupt();
            System.out.println("The program was interrupted.");
        }
    }
}
