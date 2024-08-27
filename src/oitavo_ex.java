import java.util.Scanner;

public class oitavo_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um valor: ");
        numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("Número Par");
        }else{
            System.out.println("Número Ímpar");
        }
    }
}
