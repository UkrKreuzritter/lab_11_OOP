package ucu.edu.ua.task2;

public class BirthdayMailcode implements MailCode{

    @Override
    public String generateText(Client client) 
    {
        return "Happy Birthday, " + client.getName() + "!\nNow you are " + client.getAge()
        + " years old!\nLive long, King!";

    }

    public String getSubject() 
    {
        return "BIRTHDAY";
    }
}
