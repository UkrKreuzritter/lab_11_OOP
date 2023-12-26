package ucu.edu.ua.task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private MailSender mailSender;
    private List<MailInfo> infos;
    
    public MailBox() 
    {
        this.infos = new ArrayList<>();
    }

    public void addMailInfo(MailInfo mailInfo) 
    {
        infos.add(mailInfo);
    }

    public void sendAll() 
    {
        mailSender = MailSender.getInstance();
        for (MailInfo mailInfo : infos)
        {
            mailSender.setClientsEmail(mailInfo.getClient().getEmail());
            mailSender.sendMail(mailInfo);
        }
    }
}
