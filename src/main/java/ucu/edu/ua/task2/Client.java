package ucu.edu.ua.task2;

import lombok.Getter;

@Getter
public class Client 
{
    private static int clientCounter = 0;
    private int id;
    private String name;
    private int age;
    private Sex sex;
    private String email;

    public Client(String name, int age, Sex sex, String email) 
    {
        this.id = ++clientCounter;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
    
    }

}
