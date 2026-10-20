import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.print("$ " );
            String command = scan.nextLine();

            if(command.equals("exit")){

                break ;

            }
            else if (command.startsWith("echo")) {

                System.out.println(command.substring(5));

            }
            else if (text.contains("type")) {

                if (argument.equals("echo") || argument.equals("type") || argument.equals("exit"))

                    System.out.println(argument + " is a shell builtin");
                    
                else System.out.println(argument + ": not found");
            }
            else{

                System.out.println(command + ": command not found");

            }  
        }
    }
}