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
            else if (input.startsWith("echo ")) {

                System.out.println(input.substring(5));

            }
            else{

                System.out.println(command + ": command not found");

            }  
        }
    }
}