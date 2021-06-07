/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fracciones;

/**
 *
 * @author AlumnoDAW
 */
public interface Relaciones {
    
    //verdadero si es mayor que b
    public abstract boolean esMayor(Object b);
    //verdadero si es menor que b
    public abstract boolean esMenor(Object b);
    //verdadero si es igual que b
    public abstract boolean esIgual(Object b);
    
}
