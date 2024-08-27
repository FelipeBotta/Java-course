import java.util.Scanner;

public class decimo_segundo_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        System.out.println("Digite um valor: ");
        a = sc.nextDouble();

        if(a < 0.0 || a > 100.0){
            System.out.println("Fora do Intervalo");


        }else if(a < 25.0){
            System.out.println("Intervalo (0,25)");

        } else if (a < 50){
            System.out.println("Intervalo (25,50)");
        } else if (a < 75) {
            System.out.println("Intervalo (50,75)");
        } else{
            System.out.println("Intervalo (75,100)");
        }
        sc.close();
    }
}
