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
public class Fraccion implements Relaciones, Comparable<Fraccion>{
    
    //atributos
    private int numerador;
    private int denominador;
    
    //constructores
    //por defecto
    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }
    
    //un solo parámetro
    public Fraccion(int numerador){
        super();
        this.numerador = numerador;
    }
    
    //se le pasa los valores por parámetro
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    //getter y setter
    public int getNumerador() {
        return this.numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return this.denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    //métodos sumar, restar, multiplicar y dividir fracciones
    public Fraccion sumarFraccion(Fraccion f){
        int num = (this.numerador*f.getDenominador()) + (this.denominador*f.getNumerador());
        int den = this.denominador*f.getDenominador();
        return new Fraccion(num,den);
    }
    
    public Fraccion restarFraccion(Fraccion f){
        int num = (this.numerador*f.getDenominador()) - (this.denominador*f.getNumerador());
        int den = this.denominador*f.getDenominador();
        return new Fraccion(num,den);
    }
    
    public Fraccion multiplicarFraccion(Fraccion f){
        int num = this.numerador*f.getNumerador();
        int den = this.denominador*f.getDenominador();
        return new Fraccion(num,den);
    }
    
    public Fraccion dividirFraccion(Fraccion f){
        int num = this.numerador*f.getDenominador();
        int den = this.denominador*f.getNumerador();
        return new Fraccion(num,den);
    }
       
    //summar y restar varias fracciones
    public Fraccion sumarFraccion(Fraccion... fracciones){
        int num = 0;
        int den = 0;
        for(Fraccion f: fracciones){
            num = (this.numerador*f.getDenominador()) + (this.denominador*f.getNumerador());
            den = this.denominador*f.getDenominador();
        }
        return new Fraccion(num,den);
    }
    
    public Fraccion restarFraccion(Fraccion... fracciones){
        int num = 0;
        int den = 0;
        for(Fraccion f: fracciones){
            num = (this.numerador*f.getDenominador()) - (this.denominador*f.getNumerador());
            den = this.denominador*f.getDenominador();
        }
        return new Fraccion(num,den);
    }
    
    //método para invertir fracciones
    public Fraccion invertirFraccion(){
        int num = this.numerador;
        int den = this.denominador;
        this.numerador = den;
        this.denominador = num;
        return this;
    }
    
    //método toString()
    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
    
    //métodos implementados de la INTERFACE RELACIONES
    //he hecho casting con float para que salgan numeros decimales al hacer las 
    //divisiones a la hora de comparar las fracciones
    @Override
    public boolean esMayor(Object b) {
        Fraccion f = (Fraccion) b;
        if((float)(this.numerador/this.denominador) > (float)(f.getNumerador()/f.getDenominador())){
            return true;
        }else{ return false; }
    }

    @Override
    public boolean esMenor(Object b) {
        Fraccion f = (Fraccion) b;
        if((float)(this.numerador/this.denominador) < (float)(f.getNumerador()/f.getDenominador())){
            return true;
        }else{ return false; }
    }

    @Override
    public boolean esIgual(Object b) {
        Fraccion f = (Fraccion) b;
        if((float)(this.numerador/this.denominador) == (float)(f.getNumerador()/f.getDenominador())){
            return true;
        }else{ return false; }
    }
    
    //método implementado de la INTERFACE COMPARABLE
    @Override
    public int compareTo(Fraccion o) {
        if(this.esMenor(o)){
            return -1;
        }else if(this.esMayor(o)){
            return 1;
        }else{
            return 0;
        }
    }
    
}
