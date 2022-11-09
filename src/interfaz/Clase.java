/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author hola
 */
public class Clase implements Interfaz1, Interfaz2, Interfaz3{

    @Override
    public void metodo1(int a) {
        System.out.println(a);
    }

    @Override
    public int metodo2() {
        System.out.println("método 2");
        return 0;
    }

    @Override
    public void metodo3() {
        System.out.println("método 3");
    }

    @Override
    public void metodo4() {
        System.out.println("método 4");
    }
    
}
