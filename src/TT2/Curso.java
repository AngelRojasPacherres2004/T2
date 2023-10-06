/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TT2;

/**
 *
 * @author ferna
 */
public class Curso {
    String codigo;
    String creditos;
    String nombre;
     String turno;

   

    public Curso() {
        
      }
    
    public Curso(String codigo, String creditos, String nombre,String turno) {
        this.codigo = codigo;
        this.creditos = creditos;
        this.nombre = nombre;
        this.turno = turno;
        
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    String getTexto(){
  
    return "   | Nombre: " +this.nombre +"   | Turno: " +this.turno+ "   | Codigo: " +this.codigo + "   | Creditos: "+this.creditos;
    }
}
