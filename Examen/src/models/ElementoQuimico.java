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
    
    private String nombre;
    private String masaAtomica;
    private String numeroAtomico;
    private String simboloQuimico;
    private String color;
    
    public static ArrayList<ElementoQuimico> elementosQuimicos = new ArrayList<>();


    public ElementoQuimico(String nombre, String masaAtomica, String numeroAtomico, String simboloQuimico, String color) {
        this.nombre = nombre;
        this.masaAtomica = masaAtomica;
        this.numeroAtomico = numeroAtomico;
        this.simboloQuimico = simboloQuimico;
        this.color = color;
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

    public String getSimboloQuimico() {
        return simboloQuimico;
    }

    public void setSimboloQuimico(String simboloQuimico) {
        this.simboloQuimico = simboloQuimico;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    public static void llenarElementos(){
        elementosQuimicos.add(new ElementoQuimico("Helio","4.00","2","He","Rojo"));
        elementosQuimicos.add(new ElementoQuimico("Magnesio","24.31","12","Mg","Rosa"));
        elementosQuimicos.add(new ElementoQuimico("Titanio","47.87","22","Ti","Rosa"));
        elementosQuimicos.add(new ElementoQuimico("Germanio","72.64","32","Ge","Morado"));

    }
    
    
    public static void listaElementosForE(){
        System.out.println("For each");
        for (ElementoQuimico elementoQuimico : elementosQuimicos) {
            System.out.println(ElementoQuimico);
        }
    }
    
    
    public static void eliminarElementos(int id){
        estados.remove(id);
    }
        
    public static void añadirElementos(String id,String nombre, String municipio){
        estados.add(new Estado(id,nombre,municipio));
    }
    
    public static void actualizarElemento(int recNo, String id, String nombre, String municipio){
        estados.get(recNo).setId(id);
        estados.get(recNo).setNombre(nombre);
        estados.get(recNo).setMunicipio(municipio);

    }
    
    @Override
    public String toString() {

        return "Estado{" + "id=" + id + ", nombre=" + nombre +" municipio= "+ municipio + '}';
    }


}

    
    
    
    
}
