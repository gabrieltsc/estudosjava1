import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Digite o ano de lançamento: ");
        int anoDeLancamento = leitura.nextInt();

        double mediaAvaliacao = 0;
        double nota = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação para esse filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.printf("""
                Filme: %s
                Ano de lançamento: %d
                Média da avaliação: %.2f%n
                """, filme, anoDeLancamento, mediaAvaliacao/3);
    }
}
