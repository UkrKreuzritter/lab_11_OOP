package ucu.edu.ua.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class MailInfo  
{
    private Client client;
    private MailCode code;

    public String generateText() 
    {
        return code.generateText(client);
    }

    public String getSubject() 
    {
        return code.getSubject();
    }

}
