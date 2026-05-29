package A3;

public class Tarefa {
    
    private String nome;
    private String descricao;
    private String status;

    public Tarefa(String nome, String descricao, String status) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
    }

    @Override
    public String toString() {
        return nome + " - " + status;
    }
}

