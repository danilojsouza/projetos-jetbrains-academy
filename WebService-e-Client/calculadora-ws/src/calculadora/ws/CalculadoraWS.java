package calculadora.ws;

import javax.jws.WebService;

@WebService(targetNamespace = "http://ws.calculadora/", endpointInterface = "calculadora.ws.CalculadoraWSEndpoint", portName = "CalculadoraWSPort", serviceName = "CalculadoraWSService")
public class CalculadoraWS implements CalculadoraWSEndpoint{

	public int somar(int num1, int num2) {
		return num1 + num2;
	}
}
