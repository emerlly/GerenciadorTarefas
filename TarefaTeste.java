package Gerenciador_Tarefas;

//Classe concreta TarefaTeste
public class TarefaTeste implements Tarefa {
 private String engenheiroTeste;
 private String descricao;
 private boolean concluida;

 public TarefaTeste(String descricao) {
     this.descricao = descricao;
     this.concluida = false;
 }

 @Override
 public void atribuirTarefa(String membroEquipe) {
     this.engenheiroTeste = membroEquipe;
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

