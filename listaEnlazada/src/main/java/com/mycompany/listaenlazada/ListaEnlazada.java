/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaenlazada;

/**
 *
 * @author 1103858627
 */
public class ListaEnlazada {
    private Nodo cabeza;
    
    public ListaEnlazada(){
    cabeza = null;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    
    public Nodo ultimo(){
    
        Nodo temp = cabeza;
        while(temp != null){
        
            if (temp.getSiguiente() == null) {
                
                break;
                
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public int contarNodos(){
    
        int contador = 0;
        Nodo temp = cabeza;
        while (temp != null) {            
            
            contador ++;
            temp = temp.getSiguiente();
        }
        return contador;
    }
    
    public void agregar(Nodo nuevo){
    
        if (cabeza == null) {
            
            setCabeza(nuevo);
            
        } else {
            
            ultimo().setSiguiente(nuevo);
        }
    }
    
    Nodo buscar(int cod){
    
        Nodo temp = cabeza;
        while (temp != null) {            
            
            if (temp.getCodigo() == cod) {
                break;
                
            } else {
                
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public void eliminar(Nodo nd){
    
        Nodo anterior;
        if (nd == cabeza) {
            
            cabeza = cabeza.getSiguiente();  
        }else{
        
            anterior = cabeza;
            while (anterior.getSiguiente() != nd) {                
                
                anterior = anterior.getSiguiente();
            }
            
            anterior.setSiguiente(nd.getSiguiente());
        }
        
        nd.setSiguiente(null);
    }
    
    public float promedioGeneral(){
    
        int cantidad = 0;
        double suma = 0;
        Nodo temp = cabeza;
        while (temp != null) {            
            
            cantidad ++;
            suma = suma + temp.definitiva();
            temp = temp.getSiguiente();
        }
        
        if (cantidad > 0) {
            
            double prom = suma/cantidad;
            
            return (float) prom;
        }
        else{
            return 0;
            
        }
    }
    
    public double maximaDefinitiva(){
    
        double maxima = 0;
        Nodo temp = cabeza;
        
        while (temp != null) {            
            if (temp.definitiva() > maxima) {
                maxima = temp.definitiva();
            }
            temp = temp.getSiguiente();
        }
        return maxima;
        
        
    }
    public void limpiar(){
    
        cabeza = null;
    }
}
