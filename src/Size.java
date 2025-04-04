import java.util.Scanner;

public class Size {

    public static void main(String[] args) {        
        // Criar um scanner para ler a entrada do usuario
        Scanner scanner = new Scanner(System.in);

        // Ler o tamanho da camisa
        System.out.println("Qual o tamanho de sua camisa? ");
        String size = scanner.nextLine();

        // Verificar o tamanho e imprimir a mensagem correspondente
        switch (size) {
            case "G":
                System.out.println("Tamanho Grande");
                break;
            case "P":
                System.out.println("Tamanho Pequeno");
                break;
            case "M":
                System.out.println("Tamanho Médio");
                break;
            default:
                System.out.println("Tamanho Inválido");
                break;
        }

        // Fechar o scanner
        scanner.close();
    }
}