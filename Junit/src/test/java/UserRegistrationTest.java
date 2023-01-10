import org.example.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean firstName = user.validateFirstName("Darshan");
        Assert.assertTrue("Darshan", firstName);
    }

    @Test
    public void givenLastName_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean lastName = user.validateLastName("Patil");
        Assert.assertTrue("Patil", lastName);
    }

    @Test
    public void givenEmailID_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean emailID = user.validateEmailID("abc@gmail.com");
        Assert.assertTrue("abc@gmail.com", emailID);
    }

    @Test
    public void givenMobileNumber_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean mobileNumber = user.validateMobileNumber("919876543210");
        Assert.assertTrue("919876543210", mobileNumber);
    }

    @Test
    public void givenPassword_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean password = user.validatePassword("aZx@1234");
        Assert.assertTrue("aZx@1234", password);
    }
}
