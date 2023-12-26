package ucu.edu.ua.task2;

public class InvitationMailCode implements MailCode {

    @Override
    public String generateText(Client client) 
    {
        return "Hello, "
        + client.getName()
        + "!\nYou are invited to a festival!\nGood luck!";
    }

    @Override
    public String getSubject() 
    {
        return "NEW INVITATION";
    }

    
}