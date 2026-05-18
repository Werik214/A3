# A3
Projeto desenvolvido para atividade acadêmica
Descrição do Projeto

O projeto consiste no desenvolvimento de um Sistema de Gestão de Projetos e Equipes utilizando a linguagem Java. A aplicação terá como principal objetivo auxiliar empresas no controle de projetos, equipes e tarefas, permitindo uma gestão mais eficiente dos colaboradores, acompanhamento de prazos e organização das atividades.

O sistema permitirá o cadastro e manutenção de usuários, projetos, tarefas e equipes, além de possibilitar a emissão de relatórios de acompanhamento dos projetos.

A solução será desenvolvida com base nos princípios da Programação Orientada a Objetos (POO), proporcionando maior organização, reutilização de código, manutenção e escalabilidade da aplicação.


Objetivos do Sistema
Melhorar o controle dos projetos da empresa.
Organizar as tarefas e responsabilidades das equipes.
Facilitar o acompanhamento do andamento dos projetos.
Garantir melhor distribuição das atividades entre os colaboradores.
Auxiliar no cumprimento dos prazos de entrega.
Disponibilizar relatórios de desempenho e acompanhamento.

Tecnologias Utilizadas
Linguagem de Programação
Java
Banco de Dados
MySQL
IDE de Desenvolvimento
IntelliJ IDEA ou NetBeans
Controle de Versão
GitHub
Paradigma de Desenvolvimento
Programação Orientada a Objetos (POO)

Funcionalidades do Sistema
1. Cadastro de Usuários

O sistema permitirá o cadastro e gerenciamento dos usuários.

Dados do usuário:
Nome completo
CPF
E-mail
Cargo
Login
Senha
Perfil de acesso
Perfis disponíveis:
Administrador
Gerente
Colaborador
Funcionalidades:
Cadastrar usuários
Editar usuários
Excluir usuários
Listar usuários
Controle de acesso por perfil
2. Cadastro de Projetos

O sistema permitirá o gerenciamento dos projetos da empresa.

Dados do projeto:
Nome do projeto
Descrição
Data de início
Data de término prevista
Status do projeto
Gerente responsável
Status possíveis:
Planejado
Em andamento
Concluído
Cancelado
Funcionalidades:
Cadastrar projetos
Editar projetos
Excluir projetos
Listar projetos
Associar gerente responsável
Acompanhar andamento do projeto
3. Cadastro de Equipes

O sistema permitirá a organização das equipes de trabalho.

Dados da equipe:
Nome da equipe
Descrição
Membros vinculados
Funcionalidades:
Cadastrar equipes
Editar equipes
Excluir equipes
Vincular usuários à equipe
Listar equipes
Relacionar equipes aos projetos

Observação: Uma equipe poderá atuar em vários projetos simultaneamente.

4. Cadastro de Tarefas

O sistema permitirá o controle das tarefas dos projetos.

Dados da tarefa:
Nome da tarefa
Descrição
Responsável
Data de início
Prazo de entrega
Status da tarefa
Funcionalidades:
Cadastrar tarefas
Editar tarefas
Excluir tarefas
Associar tarefas aos projetos
Atualizar andamento das tarefas
5. Relatórios

O sistema deverá gerar relatórios de acompanhamento dos projetos.

Relatórios previstos:
Projetos em andamento
Projetos concluídos
Tarefas pendentes
Desempenho das equipes
Acompanhamento de prazos
Estrutura Orientada a Objetos
Principais Classes do Sistema
Classe Usuario

Atributos:

nomeCompleto
cpf
email
cargo
login
senha
perfil

Métodos:

cadastrarUsuario()
editarUsuario()
excluirUsuario()
listarUsuarios()
Classe Projeto

Atributos:

nomeProjeto
descricao
dataInicio
dataTermino
status
gerenteResponsavel

Métodos:

cadastrarProjeto()
editarProjeto()
excluirProjeto()
listarProjetos()
Classe Equipe

Atributos:

nomeEquipe
descricao
membros

Métodos:

cadastrarEquipe()
adicionarMembro()
removerMembro()
listarEquipe()
Classe Tarefa

Atributos:

nomeTarefa
descricao
responsavel
dataInicio
prazoEntrega
status

Métodos:

cadastrarTarefa()
atualizarStatus()
listarTarefas()
Aplicação dos Conceitos de POO
Encapsulamento

Os atributos das classes serão privados e acessados por meio de métodos getters e setters.

Herança

Os diferentes tipos de usuários poderão herdar características de uma classe base Usuario.

Polimorfismo

Os perfis de usuário terão diferentes permissões e comportamentos dentro do sistema.

Abstração

Cada classe representará uma entidade real do sistema, contendo apenas os dados e comportamentos necessários.

Benefícios do Sistema
Melhor organização dos projetos.
Controle eficiente das tarefas.
Acompanhamento de prazos.
Melhor distribuição das atividades.
Maior produtividade das equipes.
Facilidade na geração de relatórios.
Centralização das informações.
