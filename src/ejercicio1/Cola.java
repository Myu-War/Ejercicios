/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author MRUIZGA
 */
public class Cola<T extends Comparable> {

    private T[] cola;
    private int primero;
    private int ultimo;
    private int cuantos;
    private int sig;
    
    public Cola() {
        cola=(T[])new Object[5];
        primero=0;
        ultimo=0;
        sig=0;
    }
    
    public void add(T elem){
        if(cuantos==cola.length-1){
            expandCapacitiy();
        }
        if(ultimo==cola.length-1 && cuantos!=cola.length-1){
            sig=0;
        }
        cola[sig]=elem;
        sig++;
        ultimo++;
    }
    
    private void expandCapacitiy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
