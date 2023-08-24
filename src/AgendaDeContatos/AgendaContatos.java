package AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    //adicionar contatos
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    //exibir contato
    public void exibirContato() {
        System.out.println(contatoSet);
    }

    //pesquisar por nome
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }

        return contatosPorNome;
    }

    //atualizar o contato
    public Contato atualizarNomeContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Rodrigo", 123456);
        agendaContatos.adicionarContato("Rodrigo", 7);
        agendaContatos.adicionarContato("Rodrigo Alves", 123455);
        agendaContatos.adicionarContato("Rodrigo Salsa", 1233242);
        agendaContatos.adicionarContato("Rodrigo Silva", 4343487);
        agendaContatos.adicionarContato("Igor", 12222);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Rodrigo"));

        System.out.println(agendaContatos.pesquisarPorNome("Rodrigo"));
    }

}
