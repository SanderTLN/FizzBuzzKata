package fizzbuzzkata;

import java.util.Arrays;

public class IpValidate {
	public boolean ValidateIpv4Address(String ipString) {
		if(hasThreeDots(ipString))
		{
			return true;
		}
		return true;
	}
	
	private boolean hasThreeDots(String ipString) {
		return ipString.chars().filter(c->c=='.').count()==3;
	}
	
	public int[] getNumbers(String string) {
		return Arrays.stream( string.split("\\.")).mapToInt(Integer::parseInt).toArray();
	}
}
