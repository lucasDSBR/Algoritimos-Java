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
public class Aluno {
    String nome;
    List<Curso> Cursos = new ArrayList<Curso>();

    Aluno(String nome)
    {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso)
    {
        this.Cursos.add(curso);
        curso.alunos.add(this);
    }
}
