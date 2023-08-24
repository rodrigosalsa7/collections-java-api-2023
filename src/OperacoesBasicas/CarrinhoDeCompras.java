package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributos
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuant();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caneta", 3d, 5);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);
        carrinhoDeCompras.adicionarItem("Desconto", 2d, 2);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Desconto");
        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }

    public static class ListaTarefa {
        //atributo
        private List<Tarefa> tarefaList;

        public ListaTarefa() {
            this.tarefaList = new ArrayList<>();
        }

        public void adicionarTarefa(String descricao) {
            tarefaList.add(new Tarefa(descricao));
        }

        public void removerTarefa(String descricao){
            List<Tarefa> tarefasParaRemover = new ArrayList<>();
            for (Tarefa t : tarefaList){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasParaRemover.add(t);
                }
            }
            tarefaList.removeAll(tarefasParaRemover);
        }

        public int obterNumeroTotalTarefas() {
            return tarefaList.size();
        }

        public void obterDescricoesTarefas (){
            System.out.println(tarefaList);
        }

        public static void main(String[] args) {
            ListaTarefa listaTarefa = new ListaTarefa();
            System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());


            listaTarefa.adicionarTarefa( "Tarefa 1");
            System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

            listaTarefa.adicionarTarefa("Tarefa 2");
            listaTarefa.adicionarTarefa("Tarefa 2");
            listaTarefa.adicionarTarefa("Tarefa 2");
            System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

            listaTarefa.removerTarefa("Tarefa 1");
            System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

            listaTarefa.obterDescricoesTarefas();

        }
    }
}