package calculadora.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "CalculadoraWSEndpoint", targetNamespace = "http://ws.calculadora/")
public interface CalculadoraWSEndpoint {

	@WebMethod(operationName = "somar", action = "urn:Somar")
	@WebResult(name = "return")
	int somar(@WebParam(name = "arg0") int num1, @WebParam(name = "arg1") int num2);

}