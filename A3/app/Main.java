package A3.app;


    

import A3.Usuario;
import A3.Projeto;
import A3.Equipe;
import A3.Tarefa;

public class Main {

    public static void main(String[] args) {

        Usuario gerente = new Usuario(
                "Carlos Silva",
                "12345678900",
                "carlos@email.com",
                "Gerente",
                "carlos",
                "123",
                "GERENTE"
        );

        Projeto projeto = new Projeto(
                "Sistema de Gestão",
                "Controle de projetos e equipes",
                "01/06/2026",
                "30/07/2026",
                "EM_ANDAMENTO",
                gerente
        );

        Equipe equipe = new Equipe(
                "Equipe Desenvolvimento",
                "Responsável pelo sistema"
        );

        equipe.adicionarMembro(gerente);

        Tarefa tarefa = new Tarefa(
                "Cadastro de Usuários",
                "Implementar CRUD de usuários",
                "PENDENTE"
        );

        System.out.println(projeto);
        equipe.listarMembros();
        System.out.println(tarefa);
    }
}

