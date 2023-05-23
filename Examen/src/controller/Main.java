/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import views.Menu;

/**
 *
 * @author Gerardo Herrera
 */
public class Main {
    
    static Menu menu = new Menu();

    public static void author68612(){
        System.out.println("Nombre: Gerardo Isidro Herrera Pacheco");
        System.out.println("Carrera: Ingenieria en sistemas computacionales Grupo: 4B");
        System.out.println("Matricula: 68612");
        System.out.println("Correo: al68612@uacam.com");
    }   
       
    
    
    public static void main(String[] args) {
        author68612();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);

    }       
    
}
