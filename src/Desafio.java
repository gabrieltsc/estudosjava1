import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        int operacao = 0;
        double saldo = 2500;
        Scanner leitura = new Scanner(System.in);
        System.out.println("""
                **********************************
                Dados Iniciais do cliente:
                
                Nome: Jackeline Oliveira
                Tipo conta: Corrente
                Saldo inicial: R$2500,00
                **********************************""");
        while (operacao != 4){
            System.out.println("""
                Operações:
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:\s
                """);
            operacao = leitura.nextInt();
            switch (operacao) {
                case 1 -> System.out.println("Saldo atual: " + saldo);
                case 2 -> {
                    System.out.println("Digite o valor que irá receber: ");
                    double recebe = leitura.nextDouble();
                    saldo += recebe;
                    System.out.println("Saldo da conta atualizado: " + saldo);
                }
                case 3 -> {
                    System.out.println("Digite o valor que deseja transferir: ");
                    double transfere = leitura.nextDouble();
                    if (transfere <= saldo) {
                        saldo -= transfere;
                        System.out.println("Saldo da conta atualizado: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                }
                case 4 -> System.out.println("Encerrando programa.");
                default -> System.out.println("Operação inválida.");
            }
        }
    }
}
