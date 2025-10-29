import org.example.service.PasswordValidator;
import org.example.service.PasswordValidatorImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    private final PasswordValidator validator=new PasswordValidatorImpl();

    @Test
    public void validPasswordShouldPass(){
        Assertions.assertDoesNotThrow(()->validator.validate("Abcd12345"));
    }
    @Test
    public void shortPasswordShouldFail(){
        Exception e= Assertions.assertThrows(Exception.class,()->validator.validate("Ab1"));

    }
    @Test
    public void missingUppercaseShouldFail(){
        Exception e= Assertions.assertThrows(Exception.class,()->validator.validate("acbd12345"));
        Assertions.assertTrue(e.getMessage().contains("invalid"));
    }
    @Test
    public void missingNumberShouldFail(){
        Exception e=Assertions.assertThrows(Exception.class,() ->validator.validate("Abcdefghi"));
        Assertions.assertTrue(e.getMessage().contains("invalid"));
    }
}
