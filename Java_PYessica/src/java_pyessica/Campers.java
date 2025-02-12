/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_pyessica;

/**
 *
 * @author Uniminuto Tibu
 */
public class Campers {
    int id;
    String fecha;
    String usuario;
    String contraseña;
    String nombre;
    String apellido;
    String direccion;
    String acudiente;
    int numero_celular;
    int numero_fijo;
    String estado;
    String riesgo;
    String grupo;
    
    public Campers(int id, String fecha, String usuario){
        this.id = id;
        this.fecha = fecha;
        this.usuario = usuario;
        this.contraseña = "alonsoN";
        this.nombre = "Alonso";
        this.apellido = "Navarro";
        this.direccion = "Calle 6 # 55C-42";
        this.acudiente = "Oscar Navarro";
        this.numero_celular = 134589125;
        this.numero_fijo = 265973017;
        this.estado = "Retirado";
        this.riesgo = "Bajo";
        this.grupo = "t3";
    }

    public Campers(int id, String fecha, String usuario, String contraseña, String nombre, String apellido, String direccion, String acudiente, int numero_celular, int numero_fijo, String estado, String riesgo, String grupo) {
        this.id = id;
        this.fecha = fecha;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.acudiente = acudiente;
        this.numero_celular = numero_celular;
        this.numero_fijo = numero_fijo;
        this.estado = estado;
        this.riesgo = riesgo;
        this.grupo = grupo;
    }
    
    
    
    public int getid(){
        return id;
    }
    public String getfe(){
        return fecha;
    }
    public String getusu(){
        return usuario;
    }
    public String getcon(){
        return contraseña;
    }
    public String getnom(String nombre){
        return nombre;
    }
    public String getape(String apellido){
        return apellido;
    }
    public String getdi(String direccion){
        return direccion;
    }
    public String getacu(String acudiente){
        return acudiente;
    }
    public int getnum1(){
        return numero_celular;
    }
    public int getnum2(){
        return numero_fijo;
    }
    public String getes(){
        return estado;
    }
    public String getri(){
        return riesgo;
    }
    public String getgru(){
        return grupo;
    }

    @Override
    public String toString() {
        return "Campers{" + "id=" + id + ", fecha=" + fecha + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", acudiente=" + acudiente + ", numero_celular=" + numero_celular + ", numero_fijo=" + numero_fijo + ", estado=" + estado + ", riesgo=" + riesgo + ", grupo=" + grupo + '}';
    }
}
