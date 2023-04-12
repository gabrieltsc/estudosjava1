public class Main {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        int classificacao = (int) (media / 2);

        System.out.println("Esse é o Screen Match.");
        System.out.println("Filme: Top Gun: Maverick");

        System.out.println("Ano de lançamento: " + anoDeLancamento);

        System.out.printf("Média das notas: %.2f%n", media);
        String sinopse = "Esta seria a sinopse do filme.";
        System.out.println("Sinopse: " + sinopse);
        System.out.printf("Classificação = %d estrelas%n", classificacao);

        int temperatura = 18;
        double fahrenheit = (temperatura * 1.8) + 32;
        System.out.printf("A temperatura de %d graus Ceusius " +
                "é igual a %.2f graus fahrenheit.%n", temperatura, fahrenheit);
    }
}