package task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.task2.Client;
import ucu.edu.ua.task2.Sex;

public class ClientTest {
    private Client client;

    @BeforeEach
    public void init() {
        client = new Client("Darion", 18, Sex.MALE, "asdasdasd123@gmail.com");
    }

    @Test
    public void testClient() {
        Assertions.assertEquals("Darion", client.getName());
        Assertions.assertEquals(18, client.getAge());
        Assertions.assertEquals(Sex.MALE, client.getSex());
        Assertions.assertEquals("asdasdasd123@gmail.com", client.getEmail());
        Assertions.assertEquals(1, client.getId());
    }
    
}
