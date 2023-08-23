package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributos

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    //adicionar o livro
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    //pesquisar por autor do livro
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor =new ArrayList<>();
        if (!LivroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }

        }
            return livrosPorAutor;
        }

        //pesquisa por intervalo de anos

    public List<livro>pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!LivroList.isEmpty()){
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    //pesquisar por título retornando o primeiro valor encontrado

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null; //não temos nenhum objeto a partir desse título
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CalatogoLivros calatogoLivros = new CatalogoLivros();
        calatogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        calatogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
        calatogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        calatogoLivros.adicionarLivro("Livro 3", "Autor 3", 2021);
        calatogoLivros.adicionarLivro("Livro 4", "Autor 4", 2023);
        calatogoLivros.adicionarLivro("Livro 5", "Autor 5", 1993);

        //pesquisar livro por autor
        System.out.println(catalogoLivros.pesquisarPorautor("Autor 2"));
        //pesquisar por autor
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2023));
        //pesquisar por título
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
