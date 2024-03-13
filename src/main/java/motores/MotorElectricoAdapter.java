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
public class MotorElectricoAdapter extends Motor{
   private MotorElectrico motorElectrico;
   
   public MotorElectricoAdapter(){
   super();
   this.motorElectrico = new MotorElectrico();
   System.out.println("Creando motor electrico adapter");
   
}
@Override
public void encender(){
System.out.println("encendiendo motor electrico adapter");
this.motorElectrico.conectar();
this.motorElectrico.activar();
}
@Override
public void acelerar(){
System.out.println("Acelerando Motor electrico...");
this.motorElectrico.moverMasRapido();
}
@Override
public void apagar(){
System.out.println("Apagando el motor electrico");
this.motorElectrico.detener();
this.motorElectrico.desconectar();

}

}
