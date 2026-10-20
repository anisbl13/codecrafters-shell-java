import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("$ ");
            String command = scan.nextLine();

            String[] listeCom = command.split(" ", 2);
            String nomCommande = listeCom[0];

            if (nomCommande.equals("exit")) {
                break;
            }
            else if (nomCommande.equals("echo")) {
                System.out.println(listeCom.length > 1 ? listeCom[1] : "");
            }
            else if (nomCommande.equals("type")) {
                if (listeCom.length < 2) {
                    continue;
                }

                String cible = listeCom[1];

                try {
                    COM.valueOf(cible);
                    System.out.println(cible + " is a shell builtin");
                }
                catch (IllegalArgumentException e) {
                    System.out.println(cible + ": not found");
                }
            }
            else {
                System.out.println(nomCommande + ": not found");
            }
        }

        scan.close();
    }
}

enum COM {
    echo,
    exit,
    type
}