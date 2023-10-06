/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TT2;

/**
 *
 * @author ferna
 */
public class Profesores {
    
    String nombre;
    String turno;
    
    
    public Profesores() {
        
    }
    public Profesores(String nombre,String turno) {
        this.nombre = nombre;
        this.turno=turno;
        
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    String getTexto(){
  
      return "Profesor: "+this.nombre+"  |  Turno: "+this.getTurno();
    }
    
}
