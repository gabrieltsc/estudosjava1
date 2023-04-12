import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite sua avaliação para esse filme ou -1 para sair: ");
            nota = leitura.nextDouble();
            if (nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }
        if (totalDeNotas != 0) {
            System.out.printf("Média da avaliação: %.2f%n",  mediaAvaliacao / totalDeNotas);
        } else {
            System.out.println("Nenhuma nota inserida.");
        }

    }
}
