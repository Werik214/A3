package A3;

import java.util.ArrayList;

public class Equipe {
    
    private String nome;
    private String descricao;
    private ArrayList<Usuario> membros;

    public Equipe(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(Usuario usuario) {
        membros.add(usuario);
    }

    public void listarMembros() {
        for (Usuario usuario : membros) {
            System.out.println(usuario);
        }
    }
}

