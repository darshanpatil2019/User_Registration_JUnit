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
}
