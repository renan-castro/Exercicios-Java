import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Digite o primeiro número: ");
        num1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = leitor.nextInt();
        System.out.println("Digite o terceiro número: ");
        num3 = leitor.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é: " + num1);
        } else if(num2 > num1 && num2 > num3 ){
            System.out.println("O maior número é " + num2);
        }else{
            System.out.println("O maior numero é " + num3);
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println("O menor número é: " + num1);
        }else if(num2 < num1 && num2 <num3){
            System.out.println("O menor número é: " + num2);
        }else{
            System.out.println("O menor é o número: " + num3);
        }
    }
}
