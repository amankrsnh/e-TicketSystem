package com.aman.gui;
//import java.net.Authenticator;
import javax.mail.Authenticator;
//import java.net.PasswordAuthentication;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author vivek
 */
public class JavaMailUtil {

    /**
     * @param args the command line arguments
     */
    public static void sendMail(String recepient, String subject, String msg) throws MessagingException{
        System.out.println("Preparing...");
        Properties properties=new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        
        String myaccemail="amcoder12345";
        String password="Amcoder123@";
        
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myaccemail,password);
            }
        });
        Message message =prepareMessage(session, myaccemail, recepient, subject, msg);
        
        Transport.send(message);
        System.out.println("Message sent succesfully!");
    }
        private static Message prepareMessage(Session session, String myaccemail, String recepient, String subject, String msg){
        try{    Message message=new MimeMessage(session);
            message.setFrom(new InternetAddress(myaccemail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject(subject);
            message.setText(msg);
            System.out.println(message);
            return message;
        }catch(Exception ex){
            Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE, null,ex);
        }  
        return null;
        } 
    }