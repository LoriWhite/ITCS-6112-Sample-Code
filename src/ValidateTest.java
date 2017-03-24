import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateTest 
{
	@Test
	public void testValidateEmail() 
	{
		assertTrue(Validate.validateEmail("xyz123@uncc.edu"));
		assertFalse("has a non letter and non number in the email", Validate.validateEmail("xyz!123@uncc.edu"));
		assertFalse("doesn't contain @", Validate.validateEmail("xyz123uncc.edu"));
		assertFalse("doesn't contain @uncc.edu", Validate.validateEmail("xyz123@gmail.com"));
		assertFalse("is null", Validate.validateEmail(""));
		assertFalse("has a space", Validate.validateEmail("xyz123 @uncc.edu"));
	}
	@Test
	public void testValidatePassword()
	{
		assertTrue(Validate.validatePassword("root@123"));
		assertFalse("doesn't have at least one non letter characters except spaces",Validate.validatePassword("root123"));
		assertFalse("doesn't have at least one letter character", Validate.validatePassword("@1237853"));
		assertFalse("doesn't have at least one number", Validate.validatePassword("@lwhite"));
		assertFalse("has at least one space", Validate.validatePassword("root @123"));
		assertFalse("has less than seven characters", Validate.validatePassword("k@123"));
		assertFalse("has more than twelve characters", Validate.validatePassword("root@12378535"));
		assertFalse("is null", Validate.validatePassword(""));
	}
	@Test
	public void testValidateName()
	{
		assertTrue(Validate.validateName("Lori White"));
		assertFalse("the first letter in the first and last name is not capitalized", Validate.validateName("lori white"));
		assertFalse("there is not a space between the first and last name", Validate.validateName("LoriWhite"));
		assertFalse("there is a special character", Validate.validateName("L@ri White"));
		assertFalse("there is a number", Validate.validateName("Lori Whit3"));
		assertFalse("is null", Validate.validateName(""));
	}
	@Test
	public void testValidateBirthDate()
	{
		assertTrue(Validate.validateBirthDate("01/24/1995"));
		assertFalse("", Validate.validateBirthDate("64456165"));
		assertFalse("", Validate.validateBirthDate("555/25/1987"));
		assertFalse("", Validate.validateBirthDate("01/24/19999"));
		assertFalse("", Validate.validateBirthDate("15/24/1995"));
		assertFalse("", Validate.validateBirthDate("01/32/1995"));
		assertFalse("", Validate.validateBirthDate("01/24/1800"));
		assertFalse("", Validate.validateBirthDate(""));
	}
}
