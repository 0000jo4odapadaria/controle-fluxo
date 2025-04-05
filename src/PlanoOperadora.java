import java.util.Scanner;

public class PlanoOperadora {

    public static void main( String [] args ) {
        
        Scanner scanner = new Scanner( System.in ) ;
        System.out.println(" Escolha dentre os planos: basico, prime ou plus "); ;
    String plano = scanner.nextLine();
    if (plano.equals("basico")) {
        System.out.println("100 minutos de ligação");
    } else if (plano.equals("prime")) {
        System.out.println("100 minutos de ligação");
        System.out.println("ZAP ZAP e Instagram for FREE");
    } else if (plano.equals("plus")) {
        System.out.println("100 minutos de ligação");
        System.out.println("ZAP ZAP e Instagram for FREE");
        System.out.println("800 GB de internet");
    } else {
        System.out.println("null" ) ;
    }
    

    scanner.close();
    }
}