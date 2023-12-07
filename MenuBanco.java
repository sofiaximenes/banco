import java.util.ArrayList;
import java.util.Scanner;

public class MenuBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        int numConta;
        double valor;

        ContaBancaria conta;

        Banco b = new Banco();

        System.out.println("Bem-vindo ao Banco da Sofia");
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Criar conta Corrente");
            System.out.println("2. Criar conta Poupança");
            System.out.println("3. Listar contas ativas no Banco");
            System.out.println("4. Depositar");
            System.out.println("5. Sacar");
            System.out.println("0. Sair");

            System.out.print(">>> ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Opção 1 selecionada: Criando conta Corrente");
                    System.out.print("Digite quanto você quer depositar em reais, R$: ");
                    double valorInicialCC = scanner.nextDouble();
                    numConta = b.gerarNumeroConta("corrente");
                    ContaCorrente cc = new ContaCorrente(numConta, valorInicialCC);
                    b.inserir(cc);
                    break;
                case 2:
                    System.out.println("Opção 2 selecionada: Criar conta Poupança");
                    System.out.print("Digite quanto você quer depositar em reais, R$: ");
                    double valorInicialCP = scanner.nextDouble();
                    numConta = b.gerarNumeroConta("poupanca");
                    ContaPoupanca cp = new ContaPoupanca(numConta, valorInicialCP, 100);
                    b.inserir(cp);
                    break;
                case 3:
                    System.out.println("Opção 3 selecionada: Listar contas ativas");
                    ArrayList<ContaBancaria> contas = b.getContas();
                    if (contas.size() == 0) {
                        System.out.println("Nenhuma conta cadastrada no banco");
                        break;
                    }
                    for (ContaBancaria c : contas) {
                        if (c.contaAtiva) {
                            System.out.println(c);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Opção 4 selecionada: Depositar");
                    System.out.print("Digite para qual conta você depositar: ");
                    numConta = scanner.nextInt();
                    conta = b.procurarConta(numConta);
                    System.out.print("Digite quanto você quer depositar em reais, R$: ");
                    valor = scanner.nextDouble();
                    conta.depositar(valor);
                    System.out.print("Valor depositado com sucesso");
                    break;
                case 5:
                    System.out.println("Opção 5 selecionada: Sacar");
                    System.out.print("Digite de qual conta você quer sacar: ");
                    numConta = scanner.nextInt();
                    conta = b.procurarConta(numConta);
                    System.out.print("Digite quanto você quer sacar em reais, R$: ");
                    valor = scanner.nextDouble();
                    conta.sacar(valor);
                    break;
                case 6:
                    System.out.println("Opção 6 selecionada: Aplicar investimento");
                    break;
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