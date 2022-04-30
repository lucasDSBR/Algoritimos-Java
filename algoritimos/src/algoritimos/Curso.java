/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritimos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acerte
 */
public class Curso {
    final String nome;
    final List<Aluno> alunos = new ArrayList<Aluno>();

    Curso(String nome)
    {
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno)
    {
        this.alunos.add(aluno);
        aluno.Cursos.add(this);
    }
}
