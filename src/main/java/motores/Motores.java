/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motores;

/**
 *
 * @author Robinson Concha
 */
public class Motores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Motores miPrincipal = new Motores();
        System.out.println("\n****************Motor gasolina******");
        miPrincipal.usarMotorGasolina();
        System.out.println("****************************\n");
        System.out.println("*********** Motor diesel********");
        miPrincipal.usarMotorDiesel();
        System.out.println("****************************\n");
        System.out.println("*********** Motor Electrico********");
        miPrincipal.usarMotorElectrico();
        System.out.println("****************************\n");
 
    }
    private void usarMotorGasolina(){
    Motor motor = new MotorGasolina();
    motor.encender();
    motor.acelerar();
    motor.apagar();
    }

    private void usarMotorElectrico(){
    Motor motor = new MotorElectricoAdapter();
    motor.encender();
    motor.acelerar();
    motor.apagar();
    
}
    private void usarMotorDiesel(){
    Motor motor = new MotorDiesel();
    motor.encender();
    motor.acelerar();
    motor.apagar();
    
    }
    
}
