package task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.task3.ProxyImage;


public class ProxyImageTest {
    private ProxyImage proxyImage;

    @BeforeEach
    public void init() {
        proxyImage = new ProxyImage("pivo.jpg");

    }

    @Test
    public void testProxyImage() {
        Assertions.assertNull(proxyImage.getRealImage());
        Assertions.assertEquals("pivo.jpg", proxyImage.getFileName());
    }
    
}
