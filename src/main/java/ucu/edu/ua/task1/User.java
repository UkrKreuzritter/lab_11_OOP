package ucu.edu.ua.task1;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder @ToString
public class User 
{
    private String name;
    private int age;
    private int weight;
    private int height;
    private String gender;

}