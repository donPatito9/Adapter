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
public class MotorDiesel extends Motor {
     public MotorDiesel(){
     super();
     
     System.out.println("Creando el Motor Diesel");
   } 
   @Override
   public void encender(){
       System.out.println("encendiendo el motor diesel");
   }
   @Override
   public void acelerar(){
   System.out.println("acelerando el motor diesel");
   }
   @Override
   public void apagar() {
   System.out.println("apagando el motor diesel");
   }
}
