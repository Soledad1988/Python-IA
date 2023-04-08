package com.utn.Integrador.validador_correlativas;

import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;


public class App 
{
    public static void main( String[] args )
    {
        //crear materias
    	Materia materia1 = new Materia("Matematicas");
    	Materia materia2 = new Materia("Fisica");
    	Materia materia3 = new Materia("Biologia");
    	
    	//agregando correlativas
    	materia2.agregarCorrelativa(materia1);
    	materia3.agregarCorrelativa(materia1);
    	materia3.agregarCorrelativa(materia2);
    	
    	//crear Alumnos
    	Alumno alumno1 = new Alumno("Juan","92458");
    	Alumno alumno2 = new Alumno("Brenda","47895");
    	Alumno alumno3 = new Alumno("Sofia","15215");
    	
    	alumno2.agregarMateriaAprobada(materia1);
    	alumno3.agregarMateriaAprobada(materia1);
    	alumno3.agregarMateriaAprobada(materia2);
    	
    	//registrar inscripcion
    	Inscripcion inscripcion1 = new Inscripcion(alumno1,materia2);
    	Inscripcion inscripcion2 = new Inscripcion(alumno2,materia3);
    	Inscripcion inscripcion3 = new Inscripcion(alumno3,materia3);
    	
    	//probamos
    	System.out.println("Inscripcion 1");
    	System.out.println(alumno1.getLegajo()+" "+alumno1.getNombre()+" "+alumno1.getMateriasAprobadas());
    	System.out.println(inscripcion1.aprobada());
    	
    	System.out.println("Inscripcion 2");
    	System.out.println(alumno2.getLegajo()+" "+alumno2.getNombre()+" "+alumno2.getMateriasAprobadas());
    	System.out.println(inscripcion2.aprobada());
    	
    }
}
