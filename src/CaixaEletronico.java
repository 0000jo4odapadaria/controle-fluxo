import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {

    try(Scanner scanner = new Scanner(System.in)){
    
        System.out.println("Qual o valor do saque? ");
        double valorSaque = scanner.nextDouble();
        
        double saldo = 1000.00;
        
        if (valorSaque < saldo) {
            saldo = saldo - valorSaque;
            System.out.println("Sobrou = " + saldo + " na sua conta. ");
        } else {
            System.out.println("POBRE FUDIDO! ");
        }

        }
    }
}
