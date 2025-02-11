/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_t2_perezandrea;

/**
 *
 * @author Uniminuto Tibu
 */
// Primera parte de una clase: Nombre
public class Carro {
    // Atributos ("Características")
    String marca;
    String modelo;
    int ano;
    String tipoCombustible;
    int caballosFuerzas;
    int puertas;
    int asientos;
    int motor;
    String color;
    int cantLlantas;
    
    // Constructor. -- La manera en como una clase se vaya a construir al momento de instanciarlo.
    public Carro(){}
    public Carro (String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.caballosFuerzas = 140;
        this.puertas = 5;
        this.asientos = 5;
        this.motor = 2800;
        this.color = "Negro";
        this.cantLlantas = 4;
    }
    
    public Carro(String marca, String modelo, int ano, String tipoCombustible, int caballosFuerzas, int puertas, int asientos, int motor, String color, int cantLlantas){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipoCombustible = tipoCombustible;
        this.caballosFuerzas = caballosFuerzas;
        this.puertas = puertas;
        this.asientos = asientos;
        this.motor = motor;
        this.color = color;
        this.cantLlantas = cantLlantas;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", tipoCombustible=" + tipoCombustible + ", caballosFuerzas=" + caballosFuerzas + ", puertas=" + puertas + ", asientos=" + asientos + ", motor=" + motor + ", cilindraje=" +  ", color=" + color + ", cantLlantas=" + cantLlantas + '}';
    }
    
}
