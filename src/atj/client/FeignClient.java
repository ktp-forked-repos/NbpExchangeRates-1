package atj.client;

import java.net.URI;

import javax.inject.Named;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import atj.nbp.types.NbpExchangeRatesSeries;

@Named
public class FeignClient implements IFeignClient {
	
	private String url;
	private URI uri;
	private Client client;
	
	public FeignClient() {
	}
	
	@Override
	public void create(String url) {
		this.url = url;
		createUri();
		createClient();
	}
	
	private void createUri() {
		this.uri = URI.create(url);	
	}
	
	private void createClient() {
		this.client = ClientBuilder.newClient();
	}	
	
	@Override
	public String getXMLResponse(String path) {
		WebTarget target = client.target(uri);		
		String xmlResponse = target.path(path).request().accept(MediaType.APPLICATION_XML).get(String.class).toString();
		return xmlResponse;
	}
	
	
	

	

}
