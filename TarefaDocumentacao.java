package Gerenciador_Tarefas;

//Classe concreta TarefaDocumentacao
public class TarefaDocumentacao implements Tarefa {
 private String documentador;
 private String descricao;
 private boolean concluida;

 public TarefaDocumentacao(String descricao) {
     this.descricao = descricao;
     this.concluida = false;
 }

 @Override
 public void atribuirTarefa(String membroEquipe) {
     this.documentador = membroEquipe;
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
