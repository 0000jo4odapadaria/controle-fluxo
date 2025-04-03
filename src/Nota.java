import java.util.Scanner;
import java.util.Locale;

public class Nota {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner (System.in).useLocale(Locale.US) ) {

            System.out.println(" Qual a sua nota arrombado? " );
            byte nota = scanner.nextByte();

            if( nota >= 5 ) 
                System.out.println("Você não é tão burro assim, não é? ");

            else 
                System.out.println("JUMENTO ! ISSO NÂO é SUA VOCAÇÂO !");

        }
    }
}