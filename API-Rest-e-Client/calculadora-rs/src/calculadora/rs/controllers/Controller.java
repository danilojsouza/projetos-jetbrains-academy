package calculadora.rs.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import calculadora.rs.dtos.ResultadoDTO;

@Path("/calculadora")
public class Controller {

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("{num1}/{num2}")
	public Response somar (@PathParam("num1") int num1, @PathParam("num2") int num2) {
		ResultadoDTO dto = new ResultadoDTO();
		dto.setResultado(num1 + num2);
		GenericEntity<ResultadoDTO> res = new GenericEntity<ResultadoDTO>(dto, ResultadoDTO.class);
		return Response.status(200).entity(res).build();
	}
}
