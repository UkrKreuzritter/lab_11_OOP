package task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.task1.User;

public class UserTest {
    private User user;

    @BeforeEach
    public void init() {
        user = User.builder()
                        .name("Vaso")
                        .age(32)
                        .gender("MALE")
                        .weight(75)
                        .height(175)
                        .build();
    }

    @Test
    public void testUser() {
        String expected = "User(name=Vaso, age=32, weight=75, height=175, gender=MALE)";
        Assertions.assertEquals(expected, user.toString());
    }
    
}
