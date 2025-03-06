/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2.EJ2;

/**
 *
 * @author Uniminuto Tibu
 */
public class AuditTransfMonet {
    private Notificador notificador; // método para un atributo existente.

    public AuditTransfMonet(Notificador notificador) {
        this.notificador = notificador;
    }
    public void transferenciaRealizada(Transferencia transferencia){
        if (esTransferenciaImportante(transferencia)){
            notificador.enviarNotificacion(transferencia);
        }
    }  
    private boolean esTransferenciaImportante(Transferencia transferencia) {
       return transferencia.importe()>50000;
    }
}
