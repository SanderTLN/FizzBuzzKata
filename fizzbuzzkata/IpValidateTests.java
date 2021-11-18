package fizzbuzzkata;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IpValidateTests {
	@Test
	void ShouldReturnTrue_GivenEmptyStringParameter() {
		IpValidate validator = new IpValidate();
		assertFalse(validator.ValidateIpv4Address(""));
	}
	
	@Test
	void ShouldBe_False_GivenStringWithThreeDots() {
		IpValidate validator = new IpValidate();
		assertTrue(validator.ValidateIpv4Address("1.2.3.1"));
	}
}
