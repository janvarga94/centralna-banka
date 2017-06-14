package hello;


import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.server.endpoint.annotation.SoapAction;

import io.spring.guides.gs_producing_web_service.GetM102Request;
import io.spring.guides.gs_producing_web_service.GetM102Response;
import io.spring.guides.gs_producing_web_service.GetMOneZeroThreeRequest;
import io.spring.guides.gs_producing_web_service.GetMOneZeroThreeResponse;

@Endpoint
public class M103And103Endpoint {
private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private static int idPoruke;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMOneZeroThreeRequest")
	//@SoapAction(value = NAMESPACE_URI)
	@ResponsePayload
	public GetMOneZeroThreeResponse getM103(@RequestPayload GetMOneZeroThreeRequest request) {
		
		
		System.out.println("here");
	//	int id = request.getId();
		GetMOneZeroThreeResponse respone = new GetMOneZeroThreeResponse();
		respone.setId(543);
		return respone;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getM102Request")
	//@SoapAction(value = NAMESPACE_URI)
	@ResponsePayload
	public GetM102Response getM102(@RequestPayload GetM102Request request) {
		
		
		System.out.println("here2");
	//	int id = request.getId();
		GetM102Response response = new GetM102Response();
			response.setId(12312);
		return response;
	}
	
}
