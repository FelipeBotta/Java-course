import java.util.Scanner;

public class conta_telefone {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        double conta;

        conta = 50;

        double total = (minutos > 100) ? conta += (minutos - 100) * 2 : conta;


        System.out.println("Total da Conta R$: " + total);
    }

}
