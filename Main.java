package Gerenciador_Tarefas;

public class Main {
    public static void main(String[] args) {
        // Criação do projeto
        Projeto projeto = new Projeto("Projeto Emerlly");

        // Criação das tarefas
        Tarefa tarefa1 = new TarefaDesenvolvimento("Implementar funcionalidade A");
        Tarefa tarefa2 = new TarefaTeste("Testar funcionalidade A");
        Tarefa tarefa3 = new TarefaDocumentacao("Documentar funcionalidade A");

        // Adição das tarefas ao projeto
        projeto.adicionarTarefa(tarefa1);
        projeto.adicionarTarefa(tarefa2);
        projeto.adicionarTarefa(tarefa3);

        // Atribuição das tarefas a membros da equipe
        projeto.atribuirTarefa("Desenvolvedor 1", tarefa1);
        projeto.atribuirTarefa("Engenheiro de Teste 1", tarefa2);
        projeto.atribuirTarefa("Documentador 1", tarefa3);

        // Marcar uma tarefa como concluída
        projeto.marcarTarefaConcluida(tarefa1);

        // Exibir as tarefas do projeto
        projeto.exibirTarefas();

        // Gerenciar o andamento do projeto
        projeto.gerenciarAndamento();
    }
}

