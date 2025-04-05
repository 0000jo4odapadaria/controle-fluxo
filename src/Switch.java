import java.util.Scanner;

public class Switch {
    public static void main( String [] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Escolha dentre os planos ruim, bosta ou o lixo ");
        String plano = scanner.nextLine();

        switch (plano) {
            case "lixo":
                
                System.out.println("100 minutos de ligação");
                
            case "bosta":
                
                System.out.println("ZAP ZAP e Instagram for FREE");
                
            case "ruim":
                
            System.out.println("800 GB de internet");
                break;
            
                default:
                System.out.println("null" );
        }
            








        scanner.close();
    }
}
