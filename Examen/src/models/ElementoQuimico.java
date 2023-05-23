/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author Gerardo Herrera
 */
public class ElementoQuimico {
    
    private String id;
    private String nombre;
    private String masaAtomica;
    private String numeroAtomico;
    private String simbolo;
    private String color;
    
    public static ArrayList<ElementoQuimico> elementosQuimicos = new ArrayList<>();


    public ElementoQuimico(String id,String nombre, String masaAtomica, String numeroAtomico, String simboloQuimico, String color) {
        this.id = id;
        this.nombre = nombre;
        this.masaAtomica = masaAtomica;
        this.numeroAtomico = numeroAtomico;
        this.simbolo = simboloQuimico;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMasaAtomica() {
        return masaAtomica;
    }

    public void setMasaAtomica(String masaAtomica) {
        this.masaAtomica = masaAtomica;
    }

    public String getNumeroAtomico() {
        return numeroAtomico;
    }

    public void setNumeroAtomico(String numeroAtomico) {
        this.numeroAtomico = numeroAtomico;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simboloQuimico) {
        this.simbolo = simboloQuimico;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    public static void llenarElementos(){
        elementosQuimicos.add(new ElementoQuimico("1","Helio","4.00","2","He","Rojo"));
        elementosQuimicos.add(new ElementoQuimico("2","Magnesio","24.31","12","Mg","Crema"));
        elementosQuimicos.add(new ElementoQuimico("3","Titanio","47.87","22","Ti","Crema"));
        elementosQuimicos.add(new ElementoQuimico("4","Germanio","72.64","32","Ge","Morado"));
        elementosQuimicos.add(new ElementoQuimico("5","Molibdeno","95.94","42","Mo","Crema"));

    }
    
    public static void listaElementosForE(){
        System.out.println("For each");
        for (ElementoQuimico elementoQuimico : elementosQuimicos) {
            System.out.println(elementoQuimico);
        }
    }
    
    
    public static void eliminarElementos(int id){
        elementosQuimicos.remove(id);
    }
        
    public static void añadirElementos(String id, String nombre, String masaAtomica, String numeroAtomico, String simbolo, String color){
        elementosQuimicos.add(new ElementoQuimico(id,nombre,masaAtomica,numeroAtomico,simbolo,color));
    }
    
    public static void actualizarElemento(int recNo,String id,String nombre, String masaAtomica, String numeroAtomico, String simbolo, String color){
        
        elementosQuimicos.get(recNo).setId(id);       
        elementosQuimicos.get(recNo).setNombre(nombre);
        elementosQuimicos.get(recNo).setMasaAtomica(masaAtomica);
        elementosQuimicos.get(recNo).setNumeroAtomico(numeroAtomico);
        elementosQuimicos.get(recNo).setSimbolo(simbolo);
        elementosQuimicos.get(recNo).setColor(color);
    }
    
    @Override
    public String toString() {

        return "Elemento quimico{" + " nombre= " + nombre +" id = " + id + ", masa atomica= "+ 
                masaAtomica + ", numero atomico = "                + numeroAtomico+ ", simbolo = "+ simbolo + ", color = " + color + '}';
    }


}

    
    
    
    

