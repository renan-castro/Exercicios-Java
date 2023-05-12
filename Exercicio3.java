import java.util.Scanner;
public class Ex3 {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        String sexo;
        System.out.println("Digite seu Sexo: ");
        sexo = leitor.next();
        if (sexo.equals("F")) {
            System.out.println("Seu sexo é feminino");
        } else if(sexo.equals("M")){
            System.out.println("Seu sexo é masculino");
            
        }else{
            System.out.println("O sexo é inválido");
        }
    }
}
