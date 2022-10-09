import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Pedir um número:
        System.out.print("Insira um número: ");
        int n1 = sc.nextInt();
        sc.close();

        // Mensagem
        System.out.println("O número informado foi: " + n1);

    }
}
