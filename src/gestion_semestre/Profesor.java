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
public class Profesor {
    String nombre;
    ArrayList <Curso> cursosQueImparte;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Curso> getCursosQueImparte() {
        return cursosQueImparte;
    }

    public void addCurso(Curso curso) {
        this.cursosQueImparte.add(curso);
    }
    
    
}
