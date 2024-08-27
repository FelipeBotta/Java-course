import java.util.Scanner;

public class segundo_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int raio;
        Double pi, area;


        System.out.println("Digite o raio do circulo: ");
        raio = sc.nextInt();
        pi = 3.14159;
        area = pi * (raio*raio);

        System.out.println("A área do círculo é de: " + area);


    }
}
