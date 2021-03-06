package pl.ivan.creditcard;

import org.junit.jupiter.api.Test;

import pl.ivan.creditcard.Greeter;

import static org.junit.jupiter.api.Assertions.*;

public class GreeterTest {
    @Test
    public void itGreetsByName() {
        //Arrange / Given
        String name = "Ivan";
        Greeter greeter = new Greeter();
        //Act / When
        String greetingText = greeter.hello(name);
        //Assert / Then
        assertEquals("Hello Ivan", greetingText);
    }
}
