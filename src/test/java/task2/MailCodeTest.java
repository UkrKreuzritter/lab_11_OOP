package task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.task2.BirthdayMailcode;
import ucu.edu.ua.task2.Client;
import ucu.edu.ua.task2.DiscountMailCode;
import ucu.edu.ua.task2.InvitationMailCode;
import ucu.edu.ua.task2.MailCode;
import ucu.edu.ua.task2.MailInfo;
import ucu.edu.ua.task2.Sex;

public class MailCodeTest {
    private Client client;
    
    private MailCode birthdayMailcode;
    private MailCode discountMailCode;
    private MailCode invitationMailCode;

    private MailInfo mailInfoBirthday;
    private MailInfo mailInfoDiscount;
    private MailInfo mailInfoInvitation;


    @BeforeEach
    public void init() {
        client = new Client("Vaso", 18, Sex.MALE, "WRITE HERE CLIENT'S EMAIL");

        birthdayMailcode = new BirthdayMailcode();
        discountMailCode = new DiscountMailCode();
        invitationMailCode = new InvitationMailCode();

        mailInfoBirthday = new MailInfo(client, birthdayMailcode);
        mailInfoDiscount = new MailInfo(client, discountMailCode);
        mailInfoInvitation = new MailInfo(client, invitationMailCode);
        
    }
    
    @Test
    public void testMailCode() {
        Assertions.assertEquals("Happy Birthday, Vaso! Now you are 18 years old!", mailInfoBirthday.generateText());
        Assertions.assertEquals("BIRTHDAY", mailInfoBirthday.getSubject());

        Assertions.assertEquals("Hello! Vaso, You have a discount id № 1. Congratulations!", mailInfoDiscount.generateText());
        Assertions.assertEquals("NEW DISCOUNT", mailInfoDiscount.getSubject());

        Assertions.assertEquals("Hello Vaso! You are invited to a festival! Good luck!", mailInfoInvitation.generateText());
        Assertions.assertEquals("NEW INVITATION", mailInfoInvitation.getSubject());

    }
}
