import java.util.Scanner;

public class quinto_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo_a,codigo_b, qtd_a,qtd_b;
        double valor_a,valor_b, total;

        System.out.println("Digite o código da peça: ");
        codigo_a = sc.nextInt();
        System.out.println("Digite a quantidade de peças: ");
        qtd_a = sc.nextInt();
        System.out.println("Digite o valor da peça: ");
        valor_a = sc.nextDouble();
        System.out.println("Digite o código da peça: ");
        codigo_b = sc.nextInt();
        System.out.println("Digite a quantidade de peças: ");
        qtd_b = sc.nextInt();
        System.out.println("Digite o valor da peça: ");
        valor_b = sc.nextDouble();

        total = (valor_a*qtd_a) + (valor_b*qtd_b);

        System.out.println("Total a ser pago R$: " + total);




    }
}
