package calculadora.ws.ui;

import java.net.MalformedURLException;
import java.net.URL;

import calculadora.ws.client.CalculadoraWSService;

public class Main {

	public static void main(String[] args) throws MalformedURLException {
		CalculadoraWSService srv = new CalculadoraWSService(new URL("http://localhost:8080/calculadora-ws/services/CalculadoraWSPort"));
		System.out.println("Resultado WebService: "+srv.getCalculadoraWSPort().somar(2, 3));;
	}

}
