/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author ESTUDIANTE
 */
public class PersonaObservador extends Observador {
    
	private double saldo;
        private String nombre;
	
	public PersonaObservador(String nombre, double saldo){
            this.nombre=nombre;
            this.saldo=saldo;
            
        }
       
	
	@Override
	public void actualizar() {		
		System.out.println(nombre+" " + (sujeto.getEstado() * saldo));
	}

    @Override
    public void agregar(Subject sujeto) {
       this.sujeto=sujeto;
        this.sujeto.agregar(this);
    }

 

}
