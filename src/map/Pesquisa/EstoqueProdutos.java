package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributo

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    //adicionar produto

    public void adicionarProduto(Long cod,String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    //exibir todos os produtos

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    //calcular o valor total do estoque

    public double calculaValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }

        return valorTotalEstoque;
    }

    //obter o produto mais caro
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco()> maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }

        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1l,"Produto 1", 5,10);
        estoque.adicionarProduto(2l,"Produto 2", 10,7);
        estoque.adicionarProduto(3l,"Produto 3", 2,20);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoque.calculaValorTotalEstoque());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisCaro());
    }
}
