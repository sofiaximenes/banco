import java.util.Scanner;

public class MenuBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        Banco b = new Banco();

        do {
            System.out.println("Bem-vindo ao Banco Fulaninho de Tal");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Criar conta Poupança");
            System.out.println("2. Criar conta Corrente");
            System.out.println("3. Selecionar conta");
            System.out.println("4. Gerar relatório");
            System.out.println("5. Imprimir contas");
            System.out.println("0. Sair");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Opção 1 selecionada: Criando conta Poupança");
                    System.out.println("Digite quanto você quer depositar");
                    double valorInicialCP = scanner.nextDouble();
                    ContaPoupanca cp = new ContaPoupanca(100, valorInicialCP, 100);
                    b.inserir(cp);
                    break;
                case 2:
                    System.out.println("Opção 2 selecionada: Criar conta Corrente");
                    System.out.println("Digite quanto você quer depositar");
                    double valorInicialCC = scanner.nextDouble();
                    ContaCorrente cc = new ContaCorrente(200, valorInicialCC);
                    b.inserir(cc);
                    break;
                case 3:
                    System.out.println("Opção 3 selecionada: Selecionar conta");
                    break;
                case 4:
                    System.out.println("Opção 4 selecionada: Gerar relatório");
                    break;
                case 5:
                    System.out.println("imprimindo contas criadas");
                    b.procurarConta(100);
                case 6:
                    System.out.println("Opção 6 selecionada: Aplicar investimento");
                    b.investimentos(in)
                case 0:
                    System.out.println("Saindo do programa. Obrigada!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 0);

        scanner.close();
    }
}