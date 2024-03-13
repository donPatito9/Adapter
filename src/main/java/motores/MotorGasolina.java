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
public class MotorGasolina extends Motor{
   public MotorGasolina(){
   super();
   System.out.println("Creando el Motor a Gasolina");
   } 
   @Override
   public void encender(){
       System.out.println("encendiendo el motor a gasolina");
   }
   @Override
   public void acelerar(){
   System.out.println("acelerando el motor a gasolina");
   }
   @Override
   public void apagar() {
   System.out.println("apagando el motor a gasolina");
   }
}
