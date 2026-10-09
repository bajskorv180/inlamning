
import java.util.Scanner;

public class main {

    static void main() {

        String text = "";

        Scanner scanner = new Scanner(System.in);

        conunter conunter = new conunter();
        while(!text.toLowerCase().contains("stop")){
            System.out.print("skriv: ");
            text = scanner.nextLine();
            if(!text.equals("stop")){
                conunter.add(text);
            }

        }
        System.out.println("Antal ord: " + conunter.getList() );
        System.out.println("Antal rader: " + conunter.getRow());
        System.out.println("Antal tecken: " + conunter.getLetter());
    }

}



