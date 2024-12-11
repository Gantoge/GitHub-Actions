package test.java.com.example;

import main.java.com.example.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testGreet() {
        assertEquals("Hello, World!", App.greet("World"));
        assertEquals("Hello, Чел!", App.greet("Чел"));
    }
}