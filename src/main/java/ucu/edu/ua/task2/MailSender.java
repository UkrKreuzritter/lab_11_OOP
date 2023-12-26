package ucu.edu.ua.task2;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.transactional.SendContact;
import com.mailjet.client.transactional.SendEmailsRequest;
import com.mailjet.client.transactional.TrackOpens;
import com.mailjet.client.transactional.TransactionalEmail;

import lombok.SneakyThrows;

public class MailSender 
{
    private MailjetClient mailjetClient;
    private static MailSender instance;
    private String clientsEmail;
    
    private MailSender() 
    {  
        startClient();
    }

    public static MailSender getInstance() 
    {
        if (MailSender.instance == null)
            MailSender.instance = new MailSender();
        return MailSender.instance;
    }

    public void setClientsEmail (String clientsEmail) 
    {
        this.clientsEmail =  clientsEmail;
    }

    
    private void startClient() 
    {

        ClientOptions clientOptions = ClientOptions.builder()
                                      .apiKey("YOUR API KEY HERE")
                                      .apiSecretKey("YOUR SECRET HERE")
                                      .build();
        mailjetClient = new MailjetClient(clientOptions);
    }

    @SneakyThrows
    public void sendMail(MailInfo mailInfo) 
    {
        TransactionalEmail message = TransactionalEmail
                                    .builder()
                                    .to(new SendContact(clientsEmail))
                                    .from(new SendContact("WRITE HERE REGISTERED EMAIL ON MAILJET FROM WHICH EMAILS WILL BE SENT"))
                                    .htmlPart(mailInfo.generateText())
                                    .subject(mailInfo.getSubject())
                                    .trackOpens(TrackOpens.ENABLED)
                                    .build();
        SendEmailsRequest request = SendEmailsRequest
                                    .builder()
                                    .message(message)
                                    .build();

        request.sendWith(mailjetClient);
                       
    }
}
