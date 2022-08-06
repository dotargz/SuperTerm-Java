public class CommandHandler {
    KvManager kvManager = new KvManager();
    public void handleCommand(String command) {
        if (command.equals("exit")) {
            System.exit(0);
        } else if (command.equals("help")) {
            System.out.println("Available commands:");
            System.out.println("exit - exits the program");
            System.out.println("clear - clears the terminal");
            System.out.println("help - prints this message");
            System.out.println("kv - manage key-value pairs");
            System.out.println("version - prints the current version of the program");
        } else if (command.equals("version")) {
            System.out.println("SuperTerm: Java Edition v0.0.1");
        } else if (command.equals("clear")) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } else if (command.startsWith("kv")) {
            kvManager.remove("SYS.version");
            kvManager.add("SYS.version", "0.0.1");
            if (command.equals("kv")) {
                System.out.println("Available commands:");
                System.out.println("add - adds a key-value pair");
                System.out.println("get - gets a value by a key");
                System.out.println("remove - removes a key-value pair");
                System.out.println("list - lists all key-value pairs");
                System.out.println("help - prints this message");
            } else if (command.startsWith("kv add")) {
                if (command.equals("kv add")) {
                    System.out.println("Usage: kv add <key> <value>");
                } else {
                    String[] tokens = command.split(" ");
                    if (tokens.length == 4) {
                        kvManager.add(tokens[2], tokens[3]);
                    } else {
                        System.out.println("Usage: kv add <key> <value>");
                    }
                }
            } else if (command.startsWith("kv get")) {
                if (command.equals("kv get")) {
                    System.out.println("Usage: kv get <key>");
                } else {
                    String[] tokens = command.split(" ");
                    if (tokens.length == 3) {
                        System.out.println(kvManager.get(tokens[2]));
                    } else {
                        System.out.println("Usage: kv get <key>");
                    }
                }
            } else if (command.startsWith("kv remove")) {
                if (command.equals("kv remove")) {
                    System.out.println("Usage: kv remove <key>");
                } else {
                    String[] tokens = command.split(" ");
                    if (tokens.length == 3) {
                        kvManager.remove(tokens[2]);
                    } else {
                        System.out.println("Usage: kv remove <key>");
                    }
                }
            } else if (command.startsWith("kv list")) {
                if (command.equals("kv list")) {
                    kvManager.list();
                } else {
                    System.out.println("Usage: kv list");
                }
            } else {
                System.out.println("Unknown command");
                
            }
        }
        else {
            System.out.println("Unknown command");
        }
    }
}
