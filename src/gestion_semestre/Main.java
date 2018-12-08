/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_semestre;

import java.util.ArrayList;

/**
 *
 * @author FrancsicoGP
 */
public class Main {
    static ArrayList<Carrera> carreras;
    static ArrayList<Sala> salas;
    static ArrayList<Profesor> profesores;
    static ArrayList<Curso> cursos;
    static ArrayList<Horario> horarios;
    static Carrera carrera;
    static Curso curso;
    static Horario horario;
    static Profesor profesor;
    static Sala sala;
    
    public static void main(String[] args) {
      inicio();
        
    }
    public static void inicio(){
        addCarrera("Computación");
        addSala("26");
        addProfesor("Pepe");
        addCurso("Metodología");
        addHorario(12,00,13,00);
        addHorario(13,10,14,10);
    
    }
    // Sala  //
    public static void addSala(String numero){
        sala=new Sala();
        sala.setNumero(numero);
        salas.add(sala);
    }
    // PROFESOR //
     public static void addProfesor(String nombre){
        profesor=new Profesor();
        profesor.setNombre(nombre);
        profesores.add(profesor);
    }
    // CURSO //
     public static void addCurso(String nombre){
        curso=new Curso();
        curso.setNombre(nombre);
        cursos.add(curso);
    }
     // Carrera //
     public static void addCarrera(String nombre){
        carrera=new Carrera();
        carrera.setNombre(nombre);
        carreras.add(carrera);
    }
    // Horario //
    public static void addHorario(int h_inicio,int m_inicio, int h_termino, int m_termino){
        horario=new Horario();
        horario.setHoraInicio(h_inicio, m_inicio);
        horario.setHoraTermino(h_termino, m_termino);
        horarios.add(horario);
    }
    
}
