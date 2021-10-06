import java.util.ArrayList;
import java.util.Scanner;

public class softwareLocacao {
    public static void main(String[] args) {
        //Entrada das informações dos clientes
        System.out.println("####BEM VINDO À CASTRO VEÍCULOS####");
        Scanner dd = new Scanner(System.in);
        ArrayList<Cliente> dadoscliente = new ArrayList<>();
        System.out.println("Qual o nome do cliente?");
        Cliente novocliente = new Cliente();
        novocliente.setNome(dd.nextLine());
        System.out.println("Qual o CPF do cliente?");
        novocliente.setCpf(dd.nextLine());
        System.out.println("Qual a data de Nascimento do cliente?(DD/MM/AAA)?");
        novocliente.setDtNasc(dd.nextLine());
        dadoscliente.add(novocliente);

        //Entrada das informações dos veiculos
        System.out.println("Qual tipo de veiculo deseja alugar?");
        System.out.println("\n");
        System.out.println("1 - Moto 2 - Carro Simples 3 - Carro de Luxo");
        Scanner entreTipo = new Scanner(System.in);
        int tipoVeiculo = entreTipo.nextInt();
        ArrayList<Veiculo> dadosVeiculo = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a marca do veiculo?");
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca(sc.nextLine());
        System.out.println("Qual o modelo do veiculo?");
        veiculo.setModelo(sc.nextLine());
        System.out.println("Qual a cor do veiculo?");
        veiculo.setCor(sc.nextLine());
        dadosVeiculo.add(veiculo);

        //Usa switch para definir quais as próximas perguntas serão exibidas na tela
        switch (tipoVeiculo) {
            case 1:
                ArrayList<Moto> dadosMoto = new ArrayList<>();
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Moto possui capacete?");
                Moto moto = new Moto();
                moto.setCapacete(sc1.nextLine());
                System.out.println("A partida da moto é elétrica ou manual?");
                moto.setPartida(sc1.nextLine());
                System.out.println("Quantas cilindradas tem a moto?");
                moto.setCilindrada(sc1.nextLine());
                dadosMoto.add(moto);
                break;
            case 2:
                ArrayList<Carro> dadosCarro = new ArrayList<>();
                Scanner ss = new Scanner(System.in);
                System.out.println("O carro possui estepe?");
                Carro carro1 = new Carro();
                carro1.setEstepe(ss.nextLine());
                System.out.println("O carro possui Airbag?");
                carro1.setEstepe(ss.nextLine());
                dadosCarro.add(carro1);
                break;
            case 3:
                ArrayList<Carro> dadosCarro2 = new ArrayList<>();
                Scanner ss1 = new Scanner(System.in);
                System.out.println("O carro possui estepe?");
                Carro carro2 = new Carro();
                carro2.setEstepe(ss1.nextLine());
                System.out.println("O carro possui Airbag?");
                carro2.setEstepe(ss1.nextLine());
                dadosCarro2.add(carro2);
                break;
        }
        //Cria variavel com a quantidade de dias
        System.out.println("Quantos dias de locação?");
        Scanner entredias = new Scanner(System.in);
        int qtddiasvar = entredias.nextInt();
        //Definição dos preços dos veículos no Array e quantidade de dias de aluguel
        ArrayList<Aluguel>  valoresAluguel = new ArrayList<>();
        Aluguel moto = new Aluguel();
        moto.setDiariaMoto(15);
        Aluguel carroSimples = new Aluguel();
        carroSimples.setDiariaCarroSimples(70);
        Aluguel carroLuxo = new Aluguel();
        carroLuxo.setDiariaCarroLuxo(100);
        Aluguel qtdDias = new Aluguel();
        qtdDias.setDiasAluguel(qtddiasvar);
        valoresAluguel.add(moto);
        valoresAluguel.add(carroSimples);
        valoresAluguel.add(carroLuxo);
        //Realiza o calculo do valor final do aluguel e exibe na tela o valor
        switch (tipoVeiculo) {
            case 1:
                double valorFinal1 = (moto.getDiariaMoto() * qtdDias.getDiasAluguel());
                System.out.println("O valor do aluguel ficou em: R$" + valorFinal1);
                break;
            case 2:
                double valorFinal2 = (carroSimples.getDiariaCarroSimples() * qtdDias.getDiasAluguel());
                System.out.println("O valor do aluguel ficou em: R$" + valorFinal2);
                break;
            case 3:
                double valorFinal3 = (carroLuxo.getDiariaCarroLuxo() * qtdDias.getDiasAluguel());
                System.out.println("O valor do aluguel ficou em: R$" + valorFinal3);
        }
    }
}
