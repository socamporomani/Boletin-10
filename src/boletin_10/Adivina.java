/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_10;
import javax.swing.JOptionPane;
/**
 *
 * @author socamporomani
 */
public class Adivina {
    private byte adivinarNumero;
    private byte numeroIntentos;

    public void getNumero() {
        do{
    adivinarNumero=Byte.parseByte(JOptionPane.showInputDialog("Introduce numero para adivinar entre el 1 y el 50","Jugador1"));
          }
        while(adivinarNumero<1 || adivinarNumero>50);
        intentos();
        
    }

    public void intentos() {
        do{
    numeroIntentos=Byte.parseByte(JOptionPane.showInputDialog("Introduce numero de intentos MAX.50","Jugador1"));
        }
while(numeroIntentos<1 || numeroIntentos>50);
        darConElNumero();
    }
    
    public void darConElNumero(){
        byte numero;
        byte intento =0;
        do{
            numero=Byte.parseByte(JOptionPane.showInputDialog("Introduce numero entre el 1 y el 50","Jugador2"));
            intento++;
            if(numero<adivinarNumero){
                System.out.println(intento);
              JOptionPane.showMessageDialog(null,"El número es más alto. Te quedan " + (numeroIntentos - intento) + " intentos");
            }
            else if(numero>adivinarNumero){
                System.out.println(intento);
              JOptionPane.showMessageDialog(null,"El número es más bajo. Te quedan " + (numeroIntentos - intento) + " intentos");

            }
            else{
               JOptionPane.showMessageDialog(null,"acertaste");
               break;
            }

            
} while(numero!=adivinarNumero && intento!=numeroIntentos);

//        for(numero=0;numero==adivinarNumero;intentos++){
 //        numero=Byte.parseByte(JOptionPane.showInputDialog("Introduce numero entre el 1 y el 50","Jugador2"));

    //    }
    }
    
    
   
}
