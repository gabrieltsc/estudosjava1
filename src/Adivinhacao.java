import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        int qtdTentativas = 0;
        int tentativa = -1;
        int numero = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        System.out.println("Tente adivinhar o número em 5 tentativas ou menos.");
        while (numero != tentativa) {
            System.out.println("Digite um número: ");
            tentativa = leitura.nextInt();
            qtdTentativas++;
            if (tentativa > numero) {
                System.out.println("O número digitado é maior que o correto.");
            } else if (tentativa < numero) {
                System.out.println("O número digitado é menor que o correto.");
            } else {
                System.out.println("Você acertou! O número era " + numero);
                System.out.println("Número de tentativas: " + qtdTentativas);
            }
        }
    }
}
