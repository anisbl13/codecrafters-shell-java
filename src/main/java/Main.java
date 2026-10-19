import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.print("$ " );
            String command = scan.nextLine();
            String[] chaine = command.split(" ");
            if(command.equals("exit"))
                return ;
            if(chaine[0].equals("echo")){
                System.out.println(command.substring(command.indexOf(" ") + 1));
            }else{
                System.out.println(command + ": command not found");

            }  
        }
    }
}