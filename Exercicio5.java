import java.util.Scanner;
public class Ex5 {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        int nota1;
        int nota2;
        System.out.println("Digite a primeira nota: ");
        nota1 = leitor.nextInt();
        System.out.println("Digite a segunda nota: ");
        nota2 = leitor.nextInt();
        if ((nota1+nota2)/2 == 10) {
            System.out.println("Aprovado com distinção");
        } else if((nota1+nota2)/2 >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
