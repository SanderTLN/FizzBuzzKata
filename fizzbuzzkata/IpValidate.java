package fizzbuzzkata;

import java.util.Arrays;

public class IpValidate {
	public boolean ValidateIpv4Address(String ipString) {
		if(hasThreeDots(ipString) && 
			hasFourNumbers(ipString)) {
			return true;
		}
		return false;
	}
	
	private boolean hasFourNumbers(String ipString) {
		return getNumbers(ipString).length == 4;
	}
	
	private boolean hasThreeDots(String ipString) {
		return ipString.chars().filter(c->c=='.').count()==3;
	}
	
	public int[] getNumbers(String string) {
		return Arrays.stream( string.split("\\.")).mapToInt(Integer::parseInt).toArray();
	}
}
