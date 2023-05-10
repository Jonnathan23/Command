/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author aplaza
 */
public class Inicio 
{
    
	public static void main(String[] args) {
		Subject subjectCasaeuro = new Subject();
           
                PersonaObservador pAndrea= new PersonaObservador("Andrea",110);
                PersonaObservador juan= new PersonaObservador("Juan",450);
                pAndrea.agregar(subjectCasaeuro);
                juan.agregar(subjectCasaeuro);
                Subject subjectCasapeso= new Subject();
                juan.agregar(subjectCasapeso);
         

		
                System.out.println("El peso cambio 1 dolar a 20.1 pesos mexicanos");
                subjectCasaeuro.setEstado(0.92);
                
                System.out.println("El peso cabio a 1 dolar a 20.01 pesos mexicanos ");
                subjectCasapeso.setEstado(20.01);
		
	}
}
