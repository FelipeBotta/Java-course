import java.util.Scanner;

public class decimo_primeiro_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo,quantidade;
        double total;
        total = 0;
        System.out.println("Informe o código desejado: ");
        codigo = sc.nextInt();
        System.out.println("Informe a quantidade desejada: ");
        quantidade = sc.nextInt();

        if(codigo == 1){
            total = quantidade * 4;

        } else if (codigo ==2 ) {
            total = quantidade * 4.5;

        } else if (codigo == 3) {
            total = quantidade * 5;

        } else if (codigo == 4) {
            total = quantidade * 2;

        } else if (codigo == 5) {
            total = quantidade * 1.5;

        }

        System.out.println("O total da sua compra foi de R$: " + total);
    }
}
