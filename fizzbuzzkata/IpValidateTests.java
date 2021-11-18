package fizzbuzzkata;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IpValidateTests {
	@Test
	void ShouldReturnTrue_GivenEmptyStringParameter() {
		IpValidate validator = new IpValidate();
		assertFalse(validator.ValidateIpv4Address(""));
	}
}
