import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.print("$ " );
            String command = scan.nextLine();
            if(command.equals("exit"))
                return ;
            System.out.println(command + ": command not found");
        }
    }

}
