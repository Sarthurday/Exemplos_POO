import java.util.Scanner;
import java.util.stream.StreamSupport;

public class ExemploPraticoAula05 {

    Scanner scanner = new Scanner(System.in);
    private int numeroConta;

    private int numeroAgencia;

    private String tipo;

    private String dono;

    private double saldo;

    private boolean status;

    private double saldoFinal;

    private boolean emDebito;

    private double valorEmDebito;

    private int numeroDecisao;

    private int numeroDecisaoConta;

    private double valorSacado;


    // Se a pessoa abrir uma conta-corrente, ela ganha R$ 50

    // Se a pessoa abrir uma conta-poupança, ela ganha R$ 150

    // Conta-corrent: CC

    // Conta Poupança: CP

    // Para fechar uma conta, é necessário que não haja dinheiro na conta e não haja nenhum débito pendente

    // O cliente com uma CC pagará R$ 12 reais mensais. O cilente com uma CP vai pagar R$ 20.


    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public double getValorSacado() {
        return valorSacado;
    }

    public void setValorSacado(double valorSacado) {
        this.valorSacado = valorSacado;
    }

    public int getNumeroDecisaoConta() {
        return numeroDecisaoConta;
    }

    public void setNumeroDecisaoConta(int numeroDecisaoConta) {
        this.numeroDecisaoConta = numeroDecisaoConta;
    }

    public int getNumeroDecisao() {
        return numeroDecisao;
    }

    public void setNumeroDecisao(int numeroDecisao) {
        this.numeroDecisao = numeroDecisao;
    }

    public double getValorEmDebito() {
        return valorEmDebito;
    }

    public void setValorEmDebito(double valorEmDebito) {
        this.valorEmDebito = valorEmDebito;
    }

    public boolean isEmDebito() {
        return emDebito;
    }

    public void setEmDebito(boolean emDebito) {
        this.emDebito = emDebito;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta() {
        new ExemploPraticoAula05();
    }

    public void fecharConta() {
        do {
            if (saldo > 0) {
                System.out.println("Erro, retire o dinheiro da sua conta para encerrá-la");
            } else if (emDebito == true) {
                System.out.println("Erro, você apresenta débito para com o banco. Pague-os, para, depois, fechar a sua conta.");
            } else {
                System.out.println("Conta encerrada com sucesso!");
            }
            System.out.println("O que você gostaria de realizar hoje " + dono + " ?");
            System.out.println("1 --- ABRIR CONTA");
            System.out.println("2 --- SAIR");
            numeroDecisao = 0;
            numeroDecisao = scanner.nextInt();
            switch (numeroDecisao) {
                case 1:
                    new ExemploPraticoAula05();
                    break;
                case 2:

                    break;
            }
        } while (numeroDecisao != 7);
    }

    public void depositar() {
        do {
            System.out.println("Digite o valor que você deseja depositar na conta-corrente/poupança: ");
            double valor = 0;
            valor = scanner.nextInt();
            saldoFinal = (getSaldo() + valor);
            setSaldo(saldoFinal);
            System.out.println("Valor depositado com sucesso!");
            System.out.println("Saldo final:" + getSaldoFinal());
            System.out.println("O que você gostaria de realizar hoje " + dono + " ?");
            System.out.println("1 --- SACAR");
            System.out.println("2 --- DEPOSITAR");
            System.out.println("3 --- PAGAR MENSALIDADE");
            System.out.println("4 --- PAGAR BOLETO");
            System.out.println("5 --- PAGAR DÉBITOS");
            System.out.println("6 --- FECHAR CONTA");
            System.out.println("7 --- SAIR");
            numeroDecisao = 0;
            numeroDecisao = scanner.nextInt();
            switch (numeroDecisao) {
                case 1:
                    sacar();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    pagarMensalidade();
                    break;
                case 4:
                    pagarBoleto();
                    break;
                case 5:
                    pagarValorEmDebito();
                    break;
                case 6:
                    fecharConta();
                    break;
                case 7:

                    break;
            }
        } while (numeroDecisao != 7);

    }

    public void sacar() {
        do {
            System.out.println("Digite o valor que você deseja sacar da conta-corrente/poupança: ");
            double valor = 0;
            valor = scanner.nextInt();
            saldoFinal = (getSaldo() - valor);
            setValorSacado(valor);
            if (valor > saldo) {
                System.out.println("Não é possível realizar essa saque, pois o valor de saque é maior que o saldo!");
            } else {
                System.out.println("Valor sacado com sucesso!");
                System.out.println("Saldo final:" + getSaldoFinal());
            }
            System.out.println("O que você gostaria de realizar hoje " + dono + " ?");
            System.out.println("1 --- SACAR");
            System.out.println("2 --- DEPOSITAR");
            System.out.println("3 --- PAGAR MENSALIDADE");
            System.out.println("4 --- PAGAR BOLETO");
            System.out.println("5 --- PAGAR DÉBITOS");
            System.out.println("6 --- FECHAR CONTA");
            System.out.println("7 --- SAIR");
            numeroDecisao = 0;
            numeroDecisao = scanner.nextInt();
            switch (numeroDecisao) {
                case 1:
                    sacar();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    pagarMensalidade();
                    break;
                case 4:
                    pagarBoleto();
                    break;
                case 5:
                    pagarValorEmDebito();
                    break;
                case 6:
                    fecharConta();
                    break;
                case 7:

                    break;
            }
        } while (numeroDecisao != 7);
    }

    public void pagarBoleto() {
        do {
            System.out.println("O valor que você possui sacado no momento é: " + getValorSacado());
            System.out.println("Digite o valor do boleto que você deseja pagar: ");
            double valorBoleto = scanner.nextInt();
            saldoFinal = getValorSacado() - valorBoleto;
            setSaldo(saldoFinal);
            if (saldoFinal < 0) {
                System.out.println("Aviso, a sua conta se encontra em débito com o banco. Caso queira cancelar essa conta, pague esse débito antes.");
                boolean statusDebito = true;
                setEmDebito(statusDebito);
                setValorEmDebito(saldoFinal);
                System.out.println("O valor em débito é igual à: " + getValorEmDebito());
            } else {
                System.out.println("Boleto pago com sucesso!");
                System.out.println("O dinheiro remanescente do saque é igual à:" + saldoFinal);
            }
            System.out.println("O que você gostaria de realizar hoje " + dono + " ?");
            System.out.println("1 --- SACAR");
            System.out.println("2 --- DEPOSITAR");
            System.out.println("3 --- PAGAR MENSALIDADE");
            System.out.println("4 --- PAGAR BOLETO");
            System.out.println("5 --- PAGAR DÉBITOS");
            System.out.println("6 --- FECHAR CONTA");
            System.out.println("7 --- SAIR");
            numeroDecisao = 0;
            numeroDecisao = scanner.nextInt();
            switch (numeroDecisao) {
                case 1:
                    sacar();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    pagarMensalidade();
                    break;
                case 4:
                    pagarBoleto();
                    break;
                case 5:
                    pagarValorEmDebito();
                    break;
                case 6:
                    fecharConta();
                    break;
                case 7:

                    break;
            }
        } while (numeroDecisao != 7);


    }

    public void pagarValorEmDebito() {
        do {
            System.out.println("O valor que necessita ser pago é igual à " + getValorEmDebito());
            System.out.println("Deseja pagar? ");
            System.out.println("1 --- SIM");
            System.out.println("2 --- NÃO");
            int decisao = 0;
            decisao = scanner.nextInt();
            if (decisao == 1) {
                saldoFinal = getSaldo() - getValorEmDebito();
                System.out.println("Operação concluída com sucesso!");
                System.out.println("O saldo final da sua conta é de: " + getSaldoFinal());
            } else if (decisao == 2) {
                System.out.println("Operação finalizada com sucesso!");
                System.out.println("Caso queira fazer outra ação, reinicie o programa");
            }
            System.out.println("O que você gostaria de realizar hoje " + dono + " ?");
            System.out.println("1 --- SACAR");
            System.out.println("2 --- DEPOSITAR");
            System.out.println("3 --- PAGAR MENSALIDADE");
            System.out.println("4 --- PAGAR BOLETO");
            System.out.println("5 --- PAGAR DÉBITOS");
            System.out.println("6 --- FECHAR CONTA");
            System.out.println("7 --- SAIR");
            numeroDecisao = 0;
            numeroDecisao = scanner.nextInt();
            switch (numeroDecisao) {
                case 1:
                    sacar();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    pagarMensalidade();
                    break;
                case 4:
                    pagarBoleto();
                    break;
                case 5:
                    pagarValorEmDebito();
                    break;
                case 6:
                    fecharConta();
                    break;
                case 7:

                    break;
            }
        } while (numeroDecisao != 7);
    }

    public void pagarMensalidade() {
        do {
            if (getNumeroDecisaoConta() == 1) {
                System.out.println("A mensalidade a ser paga para a conta-corrente é igual de R$ 12,00");
                double valorMensalidade = 12;
                System.out.println("Deseja continuar? ");
                System.out.println("1 --- SIM");
                System.out.println("2 --- NÃO");
                int decisao = 0;
                decisao = scanner.nextInt();
                if (decisao == 1) {
                    saldoFinal = getSaldo() - valorMensalidade;
                    setSaldo(saldoFinal);
                    System.out.println("Operação concluída com sucesso!");
                    System.out.println("O saldo final da sua conta é de: " + getSaldo());
                    System.out.println("O que você gostaria de realizar hoje " + dono + " ?");
                    System.out.println("1 --- SACAR");
                    System.out.println("2 --- DEPOSITAR");
                    System.out.println("3 --- PAGAR MENSALIDADE");
                    System.out.println("4 --- PAGAR BOLETO");
                    System.out.println("5 --- PAGAR DÉBITOS");
                    System.out.println("6 --- FECHAR CONTA");
                    System.out.println("7 --- SAIR");
                    numeroDecisao = 0;
                    numeroDecisao = scanner.nextInt();
                    switch (numeroDecisao) {
                        case 1:
                            sacar();
                            break;
                        case 2:
                            depositar();
                            break;
                        case 3:
                            pagarMensalidade();
                            break;
                        case 4:
                            pagarBoleto();
                            break;
                        case 5:
                            pagarValorEmDebito();
                            break;
                        case 6:
                            fecharConta();
                            break;
                        case 7:

                            break;
                    }
                } else if (decisao == 2) {
                    System.out.println("Operação finalizada com sucesso!");
                    System.out.println("O que você gostaria de realizar hoje " + dono + " ?");
                    System.out.println("1 --- SACAR");
                    System.out.println("2 --- DEPOSITAR");
                    System.out.println("3 --- PAGAR MENSALIDADE");
                    System.out.println("4 --- PAGAR BOLETO");
                    System.out.println("5 --- PAGAR DÉBITOS");
                    System.out.println("6 --- FECHAR CONTA");
                    System.out.println("7 --- SAIR");
                    numeroDecisao = 0;
                    numeroDecisao = scanner.nextInt();
                    switch (numeroDecisao) {
                        case 1:
                            sacar();
                            break;
                        case 2:
                            depositar();
                            break;
                        case 3:
                            pagarMensalidade();
                            break;
                        case 4:
                            pagarBoleto();
                            break;
                        case 5:
                            pagarValorEmDebito();
                            break;
                        case 6:
                            fecharConta();
                            break;
                        case 7:

                            break;
                    }
                }
            } else {
                System.out.println("A mensalidade a ser paga para a conta poupança é igual de R$ 20,00");
                double valorMensalidade = 20;
                System.out.println("Deseja continuar? ");
                System.out.println("1 --- SIM");
                System.out.println("2 --- NÃO");
                int decisao = 0;
                decisao = scanner.nextInt();
                if (decisao == 1) {
                    saldoFinal = getSaldo() - valorMensalidade;
                    System.out.println("Operação concluída com sucesso!");
                    System.out.println("O saldo final da sua conta é de: " + saldoFinal);
                    System.out.println("O que você gostaria de realizar hoje " + dono + " ?");
                    System.out.println("1 --- SACAR");
                    System.out.println("2 --- DEPOSITAR");
                    System.out.println("3 --- PAGAR MENSALIDADE");
                    System.out.println("4 --- PAGAR BOLETO");
                    System.out.println("5 --- PAGAR DÉBITOS");
                    System.out.println("6 --- FECHAR CONTA");
                    System.out.println("7 --- SAIR");
                    numeroDecisao = 0;
                    numeroDecisao = scanner.nextInt();
                    switch (numeroDecisao) {
                        case 1:
                            sacar();
                            break;
                        case 2:
                            depositar();
                            break;
                        case 3:
                            pagarMensalidade();
                            break;
                        case 4:
                            pagarBoleto();
                            break;
                        case 5:
                            pagarValorEmDebito();
                            break;
                        case 6:
                            fecharConta();
                            break;
                        case 7:

                            break;
                    }
                } else if (decisao == 2) {
                    System.out.println("Operação finalizada com sucesso!");
                    System.out.println("O que você gostaria de realizar hoje " + dono + " ?");
                    System.out.println("1 --- SACAR");
                    System.out.println("2 --- DEPOSITAR");
                    System.out.println("3 --- PAGAR MENSALIDADE");
                    System.out.println("4 --- PAGAR BOLETO");
                    System.out.println("5 --- PAGAR DÉBITOS");
                    System.out.println("6 --- FECHAR CONTA");
                    System.out.println("7 --- SAIR");
                    numeroDecisao = 0;
                    numeroDecisao = scanner.nextInt();
                    switch (numeroDecisao) {
                        case 1:
                            sacar();
                            break;
                        case 2:
                            depositar();
                            break;
                        case 3:
                            pagarMensalidade();
                            break;
                        case 4:
                            pagarBoleto();
                            break;
                        case 5:
                            pagarValorEmDebito();
                            break;
                        case 6:
                            fecharConta();
                            break;
                        case 7:

                            break;
                    }
                }
                System.out.println("O que você gostaria de realizar hoje " + dono + " ?");
                System.out.println("1 --- SACAR");
                System.out.println("2 --- DEPOSITAR");
                System.out.println("3 --- PAGAR MENSALIDADE");
                System.out.println("4 --- PAGAR BOLETO");
                System.out.println("5 --- PAGAR DÉBITOS");
                System.out.println("6 --- FECHAR CONTA");
                System.out.println("7 --- SAIR");
                numeroDecisao = 0;
                numeroDecisao = scanner.nextInt();
                switch (numeroDecisao) {
                    case 1:
                        sacar();
                        break;
                    case 2:
                        depositar();
                        break;
                    case 3:
                        pagarMensalidade();
                        break;
                    case 4:
                        pagarBoleto();
                        break;
                    case 5:
                        pagarValorEmDebito();
                        break;
                    case 6:
                        fecharConta();
                        break;
                    case 7:

                        break;
                }
            }
        }while (numeroDecisao != 7) ;
    }

    public void menuDecisao(){
        System.out.println("O que você gostaria de realizar hoje " + dono + " ?");
        System.out.println("1 --- SACAR");
        System.out.println("2 --- DEPOSITAR");
        System.out.println("3 --- PAGAR MENSALIDADE");
        System.out.println("4 --- PAGAR BOLETO");
        System.out.println("5 --- PAGAR DÉBITOS");
        System.out.println("6 --- FECHAR CONTA");
        System.out.println("7 --- SAIR");
        int decisaoOpcao = 0;
        decisaoOpcao = scanner.nextInt();
        setNumeroDecisao(decisaoOpcao);
        switch (numeroDecisao) {
            case 1:
                sacar();
                break;
            case 2:
                depositar();
                break;
            case 3:
                pagarMensalidade();
                break;
            case 4:
                pagarBoleto();
                break;
            case 5:
                pagarValorEmDebito();
                break;
            case 6:
                fecharConta();
                break;
            case 7:

                break;
        }
    }

    public ExemploPraticoAula05() {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
        System.out.println("Digite o número da conta da sua nova conta: ");
        int numeroConta = scanner.nextInt();
        setNumeroConta(numeroConta);
        System.out.println("Digite o número da Agência da sua nova conta:");
        int numeroAgencia = scanner.nextInt();
        setNumeroAgencia(numeroAgencia);
        System.out.println("Digite o tipo da sua nova conta: 1 para conta-corrente e 2 para conta poupança");
        int decisao = 0;
        decisao = scanner.nextInt();
        setNumeroDecisaoConta(decisao);
        System.out.println("Digite o seu nome: ");
        String dono = scanner.next();
        setDono(dono);
        System.out.println("Como você acabou de criar a sua conta, o seu saldo atual será igual à R$ 0,00");
        setSaldo(0);
        System.out.println("Como você acabou de criar a sua conta, o seu status será de verdadeiro");
        setStatus(true);
        if (getNumeroDecisaoConta() == 1) {
            System.out.println("Muito obrigado por abrir uma conta-corrente com o banco XYH! Você acaba de ganhar R$ 50,00 por abrir uma conta conosco!");
            int bonus = 50;
            saldo += bonus;
        } else  {
            System.out.println("Muito obrigado por abrir uma conta poupança com o banco XYH! Você acaba de ganhar R$ 150,00 por abrir uma conta conosco!");
            int bonus = 150;
            saldo += bonus;
        }
        menuDecisao();
        /*System.out.println("O que você gostaria de realizar hoje " + dono + " ?");
        System.out.println("1 --- SACAR");
        System.out.println("2 --- DEPOSITAR");
        System.out.println("3 --- PAGAR MENSALIDADE");
        System.out.println("4 --- PAGAR BOLETO");
        System.out.println("5 --- PAGAR DÉBITOS");
        System.out.println("6 --- FECHAR CONTA");
        System.out.println("7 --- SAIR");
        int decisaoOpcao = 0;
        decisaoOpcao = scanner.nextInt();
        setNumeroDecisao(decisaoOpcao);
        switch (numeroDecisao) {
            case 1:
                sacar();
            break;
            case 2:
                depositar();
            break;
            case 3:
                pagarMensalidade();
            break;
            case 4:
                pagarBoleto();
            break;
            case 5:
                pagarValorEmDebito();
            break;
            case 6:
                fecharConta();
            break;
            case 7:

            break;
        }*/
    }
}