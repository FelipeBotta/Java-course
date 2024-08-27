import java.util.Scanner;

public class decimo_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio,fim,duracao;

        System.out.println("Digite o inicio do jogo: ");
        inicio = sc.nextInt();
        System.out.println("Digite o final do jogo: ");
        fim = sc.nextInt();

        if (inicio < fim){
            duracao = fim - inicio;
        } else {
            duracao = 24 - inicio + fim;
        }

        System.out.println("A partida teve um duração de " + duracao + " horas");
    }
}
