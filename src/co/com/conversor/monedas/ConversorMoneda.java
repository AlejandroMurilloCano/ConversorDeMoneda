package co.com.conversor.monedas;

import javax.swing.JOptionPane;

public class ConversorMoneda {
	
	private String datoIngresado="";
	private Double valorAConvertir;

	public void ejecutar() {
		Object [] opciones ={"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano",
					"De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"};
		
		datoIngresado = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:");
		//System.out.println(datoIngresado);
		//System.out.println("Es Numero: " + esNumero(datoIngresado));
		if (esNumero(datoIngresado)) {
			
			valorAConvertir = Double.parseDouble(datoIngresado);
			
			System.out.println("Convertir: " + valorAConvertir);//Comentar
			
			Object opcion = (JOptionPane.showInputDialog(null, 
	    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
	    			JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]));
			if(opcion != null)
			{
				System.out.println(opcion.toString());//Comentar
				
				String convertido = convertir(valorAConvertir,opcion.toString());
				
				JOptionPane.showMessageDialog(null, "Tienes $ " + convertido);
		        
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "Valor no válido");
		}
		
	}
	
	private String convertir(Double valorAConvertir, String opcion) {
		double valorConvertido=0;
		String moneda="";
		
		switch(opcion) {
			case "De Pesos a Dólar":
				valorConvertido = valorAConvertir / 3739.00;						
		        moneda = "Dolares";
		        break;
			
			case "De Pesos a Euro":
				valorConvertido = valorAConvertir / 4050.48;
				moneda = "Euros";
				break;
				
			case "De Pesos a Libras":
				valorConvertido = valorAConvertir / 4890.52;
		        moneda = "Libras Esterlinas";
		        break;
		        
			case "De Pesos a Yen":
				valorConvertido = valorAConvertir / 29.68;
		        moneda = "Yuanes";
		        break;
		        
			case "De Pesos a Won Coreano":
				valorConvertido = valorAConvertir / 3.04;
		        moneda = "Wons";
		        break;
		        
			case "De Dólar a Pesos":
				valorConvertido = valorAConvertir * 3739.00;
		        moneda = "Pesos Colombianos";
		        break;
		        
			case "De Euro a Pesos":
				valorConvertido = valorAConvertir * 4050.48;
				moneda = "Pesos Colombianos";
				break;
				
			case "De Libras a Pesos":
				valorConvertido = valorAConvertir * 4890.52;
		        moneda = "Pesos Colombianos";
		        break;
		        
			case "De Yen a Pesos":
				valorConvertido = valorAConvertir * 29.68;
		        moneda = "Pesos Colombianos";
		        break;
		        
			case "De Won Coreano a Pesos":
				valorConvertido = valorAConvertir * 3.04;
		        moneda = "Pesos Colombianos";
			
		}
		valorConvertido = (double) Math.round(valorConvertido *100d)/100;
		return valorConvertido + " " + moneda;
		
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
