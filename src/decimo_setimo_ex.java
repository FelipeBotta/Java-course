import java.util.Scanner;

public class decimo_setimo_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int diesel = 0;
        int gasolina = 0;

        int tipo = sc.nextInt();

        while (tipo != 4){
            if(tipo == 1){
                alcool += 1;
            } else if (tipo == 2) {
                diesel +=1;
            } else if (tipo == 3) {
                gasolina += 1;
            }else{
                System.out.println("Digite um código válido !");
            }
            tipo = sc.nextInt();
        }
        sc.close();

        System.out.println("Muito obrigado !");
        System.out.println("Alcool: " + alcool);
        System.out.println("Diesel: " + diesel);
        System.out.println("Gasolina: " + gasolina);

    }
}
