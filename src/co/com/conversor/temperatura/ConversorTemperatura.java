package co.com.conversor.temperatura;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	private String datoIngresado="";
	private Double valorAConvertir;
	
	public void ejecutar() {		
		Object [] opciones ={"Grados Celsius a Grados Fahrenheit",
					"Grados Celsius a Kelvin",
					"Grados Fahrenheit a Grados Celsius",
					"Kelvin a Grados Celsius",
					"Kelvin a Grados Fahrenheit"};
		
		datoIngresado = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir :");
		
		if (esNumero(datoIngresado)) {
			
			valorAConvertir = Double.parseDouble(datoIngresado);
			
			System.out.println("Convertir: " + valorAConvertir);//Comentar
			
			Object opcion = (JOptionPane.showInputDialog(null, 
	    			"Elije una opción para convertir ", "Temperatura", 
	    			JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]));
			if(opcion != null)
			{
				System.out.println(opcion.toString());//Comentar
				
				String convertido = convertir(valorAConvertir,opcion.toString());
				
				JOptionPane.showMessageDialog(null, convertido);
		        
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "Valor no válido");
		}

		
	}
	
	private String convertir(Double valorAConvertir, String opcion) {
		double valorConvertido=0;		
		String texto="";
		
		switch(opcion) {
			case "Grados Celsius a Grados Fahrenheit":
				valorConvertido = valorAConvertir * 1.8 + 32;
				valorConvertido = (double) Math.round(valorConvertido *100d)/100;
				texto=valorAConvertir + "°C (Grados Celsius) son " + valorConvertido + "°F (Grados Fahrenheit)";				
				break;
				
			case "Grados Celsius a Kelvin":
				valorConvertido = valorAConvertir + 273.15;
				valorConvertido = (double) Math.round(valorConvertido *100d)/100;
				texto=valorAConvertir + "°C (Grados Celsius) son " + valorConvertido + "K (Kelvin)";				
				break;
				
			case "Grados Fahrenheit a Grados Celsius":
				valorConvertido = (valorAConvertir - 32) / 1.8;
				valorConvertido = (double) Math.round(valorConvertido *100d)/100;
				texto=valorAConvertir + "°F (Grados Fahrenheit) son " + valorConvertido + "°C (Grados Celsius)";				
				break;
				
			case "Kelvin a Grados Celsius":
				valorConvertido = valorAConvertir - 273.15;
				valorConvertido = (double) Math.round(valorConvertido *100d)/100;
				texto=valorAConvertir + "K (Kelvin) son " + valorConvertido + "°C (Grados Celsius)";				
				break;
			
			case "Kelvin a Grados Fahrenheit":
				valorConvertido = (valorAConvertir - 273.15) * 1.8 + 32;
				valorConvertido = (double) Math.round(valorConvertido *100d)/100;
				texto=valorAConvertir + "K (Kelvin) son " + valorConvertido + "°F (Grados Fahrenheit)";				
				break;			
		
		}		
		
		return texto;		
		
	}

	private static boolean esNumero(String s)
    {
        try {
            Double.parseDouble(s);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

}
