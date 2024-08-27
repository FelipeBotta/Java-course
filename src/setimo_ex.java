import java.util.Scanner;

public class setimo_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        if (numero >=0){
            System.out.println("POSITIVO");
        } else{
            System.out.println("NEGATIVO");
        }


    }
}
