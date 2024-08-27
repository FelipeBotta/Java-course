import java.util.Scanner;

public class sexto_ex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a,b,c,tri,cir,tra,qua,ret;

        System.out.println("Entra a medida A: ");
        a = sc.nextDouble();
        System.out.println("Entra a medida B: ");
        b = sc.nextDouble();
        System.out.println("Entra a medida C: ");
        c = sc.nextDouble();

        tri = (a*c)/2;
        cir = (3.14159*(c*c));
        tra = ((a+b)*c)/2;
        qua = b*b;
        ret = a * b;

        System.out.println("Triangulo: " + tri);
        System.out.println("Circulo: " + cir);
        System.out.println("Trapézio: " + tra);
        System.out.println("Quadrado: " + qua);
        System.out.println("Retangulo: " + ret);




    }




}
