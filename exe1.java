import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float soma,sub,multi,div,n1,n2;

        System.out.print("Digite o primeiro valor: ");
        n1 = leia.nextFloat();
        System.out.print("Digite o segundo valor: ");
        n2 = leia.nextFloat();

        soma = n1 + n2;
        sub = n1 - n2;
        multi = n1 * n2;
        div = n1 / n2;

        System.out.println("A soma dos valores é " + soma);
        System.out.println("A subtração dos valores é " + sub);
        System.out.println("A multiplicação dos valores é " + multi);
        System.out.println("A divisão dos valores é " + div);
    }
}