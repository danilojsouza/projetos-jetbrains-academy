package calculadora.rs.ui;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import calculadora.rs.dtos.ResultadoDTO;

public class Main {
	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget target = 
				client.target("http://localhost:8080/calculadora-rs/rest/").path("/calculadora/5/5");
		Invocation.Builder invocador = target.request(MediaType.APPLICATION_JSON);
		ResultadoDTO resultado = invocador.get(ResultadoDTO.class);
		
		System.out.println("Resultado: "+resultado.getResultado());
	}
}