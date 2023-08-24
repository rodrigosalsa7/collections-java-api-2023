package Eventos;

import java.util.Scanner;

public class OrcamentoEventos {
        public static void main(String[] args) {
            // Programa para calcular os gastos e o lucro de cada evento.

            Scanner input = new Scanner(System.in);

            String cliente, data, horário, tipoEvento, bebida1, bebida2, bebida3, bebida4;
            String fruta1, fruta2, fruta3, fruta4, fruta5, fruta6;
            double valorfruta1, valorfruta2, valorfruta3, valorfruta4, valorfruta5, valorfruta6, valorCopo, valorCanudo, valorAçúcar;
            double valorCremeDeLeite, valorLeiteCondensado, valorGelo, valorAgua, valorPagoPeloCliente, transporte;
            double quantidadePessoas, valorFuncionário, quantidadeFuncionário, valorBebida1, valorBebida2, valorBebida3, valorBebida4;
            double valorTotalFuncionário,valorTotalBebidas, valorTotalFrutas, valorCompras, valorTotalGasto, lucro;

            System.out.println("Digite o nome do cliente: ");
            cliente = input.nextLine();
            System.out.println("Digite o local/endereço do evento: ");
            String localFesta = input.nextLine();
            System.out.println("Quantidade de pessoas: ");
            quantidadePessoas = input.nextDouble();
            System.out.println("Digite a data do evento: ");
            data = input.nextLine();
            System.out.println("Digite o horário do evento: ");
            horário = input.nextLine();
            System.out.println("Digite o tipo do evento: ");
            tipoEvento = input.nextLine();
            System.out.println("Digite o valor cobrado ao cliente: ");
            valorPagoPeloCliente = input.nextDouble();

            System.out.println("Quantidade de funcionários: ");
            quantidadeFuncionário = input.nextDouble();
            System.out.println("Valor pago por funcionário: ");
            valorFuncionário = input.nextDouble();
            System.out.println("Valor do transporte: ");
            transporte = input.nextDouble();

            System.out.println("Nome da 1° fruta: ");
            fruta1 = input.nextLine();
            System.out.println("Valor da 1° fruta: ");
            valorfruta1 = input.nextDouble();
            System.out.println("Nome da 2° fruta: ");
            fruta2 = input.nextLine();
            System.out.println("Valor da 2° fruta: ");
            valorfruta2 = input.nextDouble();
            System.out.println("Nome da 3° fruta: ");
            fruta3 = input.nextLine();
            System.out.println("Valor da 3° fruta: ");
            valorfruta3 = input.nextDouble();
            System.out.println("Nome da 4° fruta: ");
            fruta4 = input.nextLine();
            System.out.println("Valor da 4° fruta: ");
            valorfruta4 = input.nextDouble();
            System.out.println("Nome da 5° fruta: ");
            fruta5 = input.nextLine();
            System.out.println("Valor da 5° fruta: ");
            valorfruta5 = input.nextDouble();
            System.out.println("Nome da 6° fruta: ");
            fruta6 = input.nextLine();
            System.out.println("Valor da 6° fruta: ");
            valorfruta6 = input.nextDouble();

            System.out.println("Qual a 1° bebida? ");
            bebida1 = input.nextLine();
            System.out.println("Valor da 1° bebida: ");
            valorBebida1 = input.nextDouble();
            System.out.println("Qual a 2° bebida? ");
            bebida2 = input.nextLine();
            System.out.println("Valor da 2° bebida: ");
            valorBebida2 = input.nextDouble();
            System.out.println("Qual a 3° bebida? ");
            bebida3 = input.nextLine();
            System.out.println("Valor da 3° bebida: ");
            valorBebida3 = input.nextDouble();
            System.out.println("Qual a 4° bebida? ");
            bebida4 = input.nextLine();
            System.out.println("Valor da 4° bebida: ");
            valorBebida4 = input.nextDouble();

            System.out.println("Valor pago pelos copos: ");
            valorCopo = input.nextDouble();
            System.out.println("Valor pago pelos açúcares: ");
            valorAçúcar = input.nextDouble();
            System.out.println("Valor pago pelos canudos: ");
            valorCanudo = input.nextDouble();
            System.out.println("Valor da água mineral: ");
            valorAgua = input.nextDouble();
            System.out.println("Valor dos cremes de leite: ");
            valorCremeDeLeite = input.nextDouble();
            System.out.println("Valor leite condensado: ");
            valorLeiteCondensado = input.nextDouble();
            System.out.println("Valor do gelo: ");
            valorGelo = input.nextDouble();

            valorTotalFuncionário = valorFuncionário * quantidadeFuncionário;
            valorTotalBebidas = valorBebida1 + valorBebida2 + valorBebida3 + valorBebida4;
            valorTotalFrutas = valorfruta1 + valorfruta2 + valorfruta3 + valorfruta4 + valorfruta5 + valorfruta6;
            valorCompras = valorCopo + valorAçúcar + valorCanudo + valorAgua + valorCremeDeLeite + valorLeiteCondensado + valorGelo;
            valorTotalGasto = valorTotalFuncionário + valorTotalBebidas + valorTotalFrutas + valorCompras;
            lucro = valorPagoPeloCliente - valorTotalGasto;

            System.out.println("Seu gasto total nesse evento é de: " + valorTotalGasto);
            System.out.println("Seu lucro total no evento é de: " + lucro);
            if (lucro >= 500) {
                System.out.println("Você está tendo um ótimo lucro para esse evento.");
            } else {
                System.out.println("Você está tendo um lucro razoável.");
            }

            input.close();

        }
    }

