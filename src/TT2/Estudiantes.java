/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TT2;

/**
 *
 * @author ferna
 */
public class Estudiantes {
    
    String codigo;
    String nombre;
    String turn;
    String asistencia;
    
    public Estudiantes() {
        
    }
    public Estudiantes(String codigo, String nombre, String turn) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.asistencia = asistencia;
        this.turn=turn;
        
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    String getTexto(){
  
        return this.nombre + "   |   Codigo: " +this.codigo+ "   |   Turno: " +this.turn+ "   |   Asistencia: " +this.asistencia;
    }
        
}  
