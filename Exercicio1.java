import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Digite o primeiro número: ");
        num1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = leitor.nextInt();
        if (num1 > num2) {
            System.out.println("O maior é o: " + num1);
        } else {
            System.out.println("O maior é o número: " + num2);
        }
}
}