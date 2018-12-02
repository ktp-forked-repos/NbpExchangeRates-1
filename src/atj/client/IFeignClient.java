package atj.client;

public interface IFeignClient {
	
	public void create(String url);
	
	public String getXMLResponse(String path);

}
