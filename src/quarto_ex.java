import java.util.Scanner;

public class quarto_ex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int id,horas;
        Double hora_pg,salario;

        System.out.println("Digite seu ID: ");
        id = sc.nextInt();
        System.out.println("Digite a quantidade de horas trabaladas: ");
        horas = sc.nextInt();
        System.out.println("Digite o valor pago pela sua hora: ");
        hora_pg = sc.nextDouble();
        salario = horas * hora_pg;
        System.out.println("Seus vencimentos são de R$: " + salario);
    }


}
