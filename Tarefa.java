package Gerenciador_Tarefas;

//Interface Tarefa
public interface Tarefa {
 void atribuirTarefa(String membroEquipe);
 void marcarConcluida();
 String getDescricao();
 boolean estaConcluida();
}

