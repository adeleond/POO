/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;


public class Estudiante {
    int ide;
    String nombre;
    ArrayList<Curso> cursos;

    public Estudiante(int ide) {
        this.ide = ide;
       cursos = new ArrayList();
       
    }

 
    
    public boolean agregarCurso(Curso curso){
        if (cursos.size() < 10){
            cursos.add(curso);
            return true;
        }
        return false;
    }

    

    
    
    
    
    
}
