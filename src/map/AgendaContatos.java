package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    //remover o contato

    public void removerContato(String nome){
        if (agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    //exibir contato

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    //pesquisar por nome e retorna o número do telefone

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (agendaContatoMap.isEmpty()){
            agendaContatoMap.get(nome);
        }

        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Rodrigo", 123456);
        agendaContatos.adicionarContato("Rodrigo", 123457);
        agendaContatos.adicionarContato("Rodrigo Salsa", 12333456);
        agendaContatos.adicionarContato("Rodrigo DIO", 123456);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Rodrigo DIO");
        agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Rodrigo Salsa"));

    }

}
