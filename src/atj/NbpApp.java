package atj;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

// http://localhost:8080/NbpExchangeRates/nbp/avg/test?code=euro&days=30

@ApplicationPath("/nbp")
public class NbpApp extends ResourceConfig {
	public NbpApp() {
        this.packages("atj.ws");
    }
}


