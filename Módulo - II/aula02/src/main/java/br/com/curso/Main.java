package br.com.curso;

import br.com.curso.alunos.Aluno;
import br.com.curso.alunos.ValidationException;
import br.com.curso.disciplinas.Disciplina;
import br.com.curso.disciplinas.LimiteAlunosAlcancadoException;
import br.com.curso.lancadornotas.LancadorNotas;
import br.com.curso.professor.Professor;
import br.com.curso.usuario.UsuarioAutorizavel;
import br.com.curso.usuario.UsuarioAutorizavelAbstract;
import br.com.curso.usuario.repositorio.RepositorioUsuario;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) throws ValidationException {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("curso");



        factory.close();




        /*
        // Aluno aluno1 = new Aluno("Teste Login", "042.449.931-23", "Teste Sousa");
        Aluno aluno1 = null;
        try {
            aluno1 = new Aluno("", "042.449.931-23", "Teste Sousa");
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
            // imprimindo pilha de execucao
            // e.printStackTrace();
        }

         * System.out.println(aluno1); aluno1 = null; if (aluno1 != null){
         * aluno1.setNome("Willian"); }
        RepositorioUsuario repositorioUsuario = new RepositorioUsuario();

        try {
            Professor professor = new Professor("professor", "04244993123", "Professor Solva");
            Disciplina disciplina = new Disciplina("Matematica", professor);
            // tentando matricular 15 alunos

             * for (int i = 1; i <= 15; i++){ disciplina.matricular(new Aluno("aluno",
             * "04235632147", "Aluno" + i)); }

            Aluno aluno = new Aluno("aluno", "04235632147", "Aluno Silva");
            disciplina.matricular(aluno);
            // disciplina.mostrarAlunos();

            repositorioUsuario.add(professor);
            repositorioUsuario.add(aluno);

            repositorioUsuario.findAll().stream().forEach(System.out::println);

        } catch (ValidationException | LimiteAlunosAlcancadoException e) {
            System.out.println(e.getMessage());
        }

        UsuarioAutorizavelAbstract usuario = new Professor("1234", "04244931256", "Feijão");
        new LancadorNotas().login(usuario);*/

    }

}
