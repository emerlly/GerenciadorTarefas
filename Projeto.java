package Gerenciador_Tarefas;

import java.util.ArrayList;
import java.util.List;

// Classe Projeto
public class Projeto {
    private String nome;
    private List<Tarefa> tarefas;

    public Projeto(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    public void exibirTarefas() {
        System.out.println("Tarefas do Projeto: " + nome);
        for (Tarefa tarefa : tarefas) {
            System.out.println("- " + tarefa.getDescricao() + " [" + (tarefa.estaConcluida() ? "Concluída" : "Pendente") + "]");
        }
    }

    public void atribuirTarefa(String membroEquipe, Tarefa tarefa) {
        tarefa.atribuirTarefa(membroEquipe);
    }

    public void marcarTarefaConcluida(Tarefa tarefa) {
        tarefa.marcarConcluida();
    }

    public void gerenciarAndamento() {
        int totalTarefas = tarefas.size();
        int tarefasConcluidas = 0;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.estaConcluida()) {
                tarefasConcluidas++;
            }
        }
        double progresso = (double) tarefasConcluidas / totalTarefas * 100;

        System.out.println("Andamento do Projeto: " + nome);
        System.out.println("Total de Tarefas: " + totalTarefas);
        System.out.println("Tarefas Concluídas: " + tarefasConcluidas);
        System.out.println("Progresso: " + progresso + "%");
    }
}
