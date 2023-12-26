package ucu.edu.ua.task3;

import lombok.Getter;

@Getter
public class ProxyImage  implements MyImage
{
    private String fileName;
    private MyImage realImage;

    public ProxyImage(String fileName) 
    {
        this.fileName = fileName;
    }

    @Override
    public void display() 
    {
        if (realImage == null)
            realImage = new RealImage(this.fileName);
        realImage.display();
    }
}
