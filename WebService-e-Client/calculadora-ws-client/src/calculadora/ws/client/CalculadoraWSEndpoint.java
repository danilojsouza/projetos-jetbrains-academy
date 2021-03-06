package calculadora.ws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-04-28T18:32:18.068-03:00
 * Generated source version: 3.3.6
 *
 */
@WebService(targetNamespace = "http://ws.calculadora/", name = "CalculadoraWSEndpoint")
@XmlSeeAlso({ObjectFactory.class})
public interface CalculadoraWSEndpoint {

    @WebMethod(action = "urn:Somar")
    @RequestWrapper(localName = "somar", targetNamespace = "http://ws.calculadora/", className = "calculadora.ws.client.Somar")
    @ResponseWrapper(localName = "somarResponse", targetNamespace = "http://ws.calculadora/", className = "calculadora.ws.client.SomarResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int somar(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );
}
