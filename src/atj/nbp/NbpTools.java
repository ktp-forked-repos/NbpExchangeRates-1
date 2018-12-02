package atj.nbp;

import java.util.Optional;

import atj.nbp.types.NbpExchangeRatesSeries;
import atj.nbp.types.NbpRate;

public class NbpTools {	
	public static Double calculateAverage(NbpExchangeRatesSeries series) {		
		return Optional.ofNullable(series).map(
				    s -> { return 1.0*
				    		s.getRates().stream().map(NbpRate::getMid).mapToDouble(Double::valueOf).reduce(Double::sum).getAsDouble() 
				    		      /
				    				Math.max(s.getRates().size(),1); }
				        ).orElse( Double.valueOf(0));
	}
}
