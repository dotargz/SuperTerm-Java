import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            CommandHandler commandHandler = new CommandHandler();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("SuperTerm: Java Edition v0.0.1");
            System.out.println("Type 'help' for available commands");
            System.out.println("");
            // Main loop
            while (true) {
                System.out.print("~$ ");
                String command = scanner.nextLine();
                commandHandler.handleCommand(command);
            }
        }


    }
}