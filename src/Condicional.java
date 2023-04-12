import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o ano de lançamento do filme: ");
        int anoDeLancamento = leitura.nextInt();
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";


        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento");
        } else {
            System.out.println("Filme retrô");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Pode acessar o filme");
        } else {
            System.out.println("Não pode acessar o filme");
        }
    }
}
