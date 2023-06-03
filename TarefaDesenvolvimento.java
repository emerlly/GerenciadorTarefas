package Gerenciador_Tarefas;

//Classe concreta TarefaDesenvolvimento
public class TarefaDesenvolvimento implements Tarefa {
 private String desenvolvedor;
 private String descricao;
 private boolean concluida;

 public TarefaDesenvolvimento(String descricao) {
     this.descricao = descricao;
     this.concluida = false;
 }

 @Override
 public void atribuirTarefa(String membroEquipe) {
     this.desenvolvedor = membroEquipe;
 }

 @Override
 public void marcarConcluida() {
     this.concluida = true;
 }

 @Override
 public String getDescricao() {
     return descricao;
 }

 @Override
 public boolean estaConcluida() {
     return concluida;
 }
}
