package Iphone2007;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar() { System.out.println("Tocando música."); }
    public void pausar() { System.out.println("Música pausada."); }

    @Override
    public void selecionarMusica() {

    }

    public void selecionarMusica(String musica) { System.out.println("Selecionando música: " + musica); }
    public void ligar() { System.out.println("Ligando..."); }
    public void atender() { System.out.println("Chamada atendida."); }
    public void iniciarCorreioVoz() { System.out.println("Iniciando correio de voz."); }
    public void exibirPagina(String url) { System.out.println("Exibindo página: " + url); }

    @Override
    public void exibirPagina() {

    }

    public void adicionarNovaAba() { System.out.println("Nova aba adicionada."); }
    public void atualizarPagina() { System.out.println("Página atualizada."); }
}
