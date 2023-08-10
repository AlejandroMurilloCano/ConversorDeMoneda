package co.com.conversor.main;

import javax.swing.JOptionPane;

import co.com.conversor.monedas.ConversorMoneda;
import co.com.conversor.temperatura.ConversorTemperatura;

public class Main {

	public static void main(String[] args) {
		
		ConversorMoneda conversorMoneda = new ConversorMoneda();
		ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
		
		Object [] opciones ={"Conversor de Moneda","Conversor de Temperatura"};
		Object opcion = null;
		int respuesta;
		boolean ejecutar = true;
		
		while(ejecutar) {
			opcion = JOptionPane.showInputDialog(null,
					"Seleccione una opción de conversión","Menu",
					JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);						
						
			//System.out.println(opcion);
			
			if(opcion == null) ejecutar=false;
			else {
				switch(opcion.toString()) {
				
					case "Conversor de Moneda":
						conversorMoneda.ejecutar();
						respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");						
						if (respuesta != JOptionPane.OK_OPTION) ejecutar=false;							
						break;
						
					case "Conversor de Temperatura":
						conversorTemperatura.ejecutar();
						respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");						
						if (respuesta != JOptionPane.OK_OPTION) ejecutar=false;
						break;					
				}
			}					
		}
				
		JOptionPane.showMessageDialog(null, "Programa terminado");
	}	

}
