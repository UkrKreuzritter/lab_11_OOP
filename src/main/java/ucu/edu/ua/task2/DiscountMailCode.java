package ucu.edu.ua.task2;

public class DiscountMailCode implements MailCode {

    @Override
    public String generateText(Client client) 
    {
        return "Congratulations! "
        + client.getName()
        + ", You`ve got a discount ID № "
        + client.getId();
    }

    @Override
    public String getSubject() 
    {
        return "NEW DISCOUNT";
    }
    
}
