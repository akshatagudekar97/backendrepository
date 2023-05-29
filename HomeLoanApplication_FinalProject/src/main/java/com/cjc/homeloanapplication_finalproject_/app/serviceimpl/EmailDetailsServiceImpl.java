package com.cjc.homeloanapplication_finalproject_.app.serviceimpl;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.homeloanapplication_finalproject_.app.servicei.EmailDetailsServiceI;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmailDetailsServiceImpl implements EmailDetailsServiceI{

	@Autowired
	JavaMailSender sender;
	
	@Value("${spring.mail.username}")
	String mform;
	
	
	@Override
	public void rejectionMailSend(String to) {
		MimeMessage mimemessage=sender.createMimeMessage();
		
		try
		{
		MimeMessageHelper helper=new MimeMessageHelper(mimemessage,true);
		helper.setTo(to);
		helper.setFrom(mform);
		helper.setSubject("Home Loan Rejection");
		helper.setText("Dear Costumer,We regret to inform you that your application for the home loan to our (Bajaj finance) has been declined.");
		
		}
		catch(MessagingException e)
		{
		log.error("Error : "+e);
		}
		
		sender.send(mimemessage);
	}
	
	@Override
	public void loanappiareMailSend(String to) {
		
	MimeMessage mimemessage=sender.createMimeMessage();
		
		try
		{
		MimeMessageHelper helper=new MimeMessageHelper(mimemessage,true);
		helper.setTo(to);
		helper.setFrom(mform);
		helper.setSubject("Home Loan Appear");
		helper.setText("Dear Costumer,Your Cibil score is more than 750 that's why you are applicable for Home Loan.\n"
				+"Thanks & Regards. \n");
		
		}
		catch(MessagingException e)
		{
		log.error("Error : "+e);
		}
		
		sender.send(mimemessage);
	}

	
	@Override
	public void approvalMailSend(String to, MultipartFile sanctionLetter) {
		
		MimeMessage mimemessage=sender.createMimeMessage();
		
		try
		{
		MimeMessageHelper helper=new MimeMessageHelper(mimemessage,true);
		helper.setTo(to);
		helper.setFrom(mform);
		helper.setSubject("Home Loan Offer Letter");
		helper.setText("Dear Costumer,Please find attached offer sanction letter !!!");
		helper.addAttachment("sanctionlatter.pdf", sanctionLetter);
		}
		catch(MessagingException e)
		{
		log.error("Error : "+e);
		}
		
		sender.send(mimemessage);
	}

	@Override
	public void documentsMailSend(String to, MultipartFile sanctionLetter) {
		
		MimeMessage mimemessage=sender.createMimeMessage();
		
		try
		{
		MimeMessageHelper helper=new MimeMessageHelper(mimemessage,true);
		helper.setTo(to);
		helper.setFrom(mform);
		helper.setSubject("Regarding further loan process, we are in your service.");
		
		String message="You are eligible for further home loan which you have enquiry. Please carry the \n"
				+"Be prepared with the documents given below: \n"
				+"1. Address proof \n"
				+"2. Employee details \n"
				+"3. Educational proof (school/diploma/degree certification \n"
				+"4. Bank statements and details \n"
				+"5. Property details on which the loan is applied (if finalized) \n"
				+"6. Documents regarding papers to property (i.e. 7/12 & city survey papers) \n"
				+"7. Guarantor Documents : 2 photos,AdharCard,PanCard  \n "
				+"8. Bank Cancelled cheque";
		
		helper.setText(message);
		helper.addAttachment("sanctionlatter.pdf", sanctionLetter);
		}
		catch(MessagingException e)
		{
		log.error("Error : "+e);
		}
		
		sender.send(mimemessage);
		
	}

	@Override
	public void disburseMailSend(String to, MultipartFile sanctionLetter) {
		
MimeMessage mimemessage=sender.createMimeMessage();
		
		try
		{
		MimeMessageHelper helper=new MimeMessageHelper(mimemessage,true);
		helper.setTo(to);
		helper.setFrom(mform);
		helper.setSubject("Congratulations ! Your Home Loan has been Disbursed and Credited to your account.");
		helper.setText("\"UPDATE : Dear Customer , \"\r\n"
				+" +\"\\n\"+\"Your A/C :\"+Customer.getLoanDisbursement().getAccountNumber() \r\n" 
				+" \"A/C Linked Mobile Number xxxxxx9696. OTP for bank Transfer is 7878\"\r\n"
				+" \n\"Thanks & Regards\"\r\n"
				+" \n\"Account Head\"\r\n"
				+" \n\"Balaji Bank");
		helper.addAttachment("sanctionlatter.pdf", sanctionLetter);
		}
		catch(MessagingException e)
		{
		log.error("Error : "+e);
		}
		
		sender.send(mimemessage);
	}

	@Override
	public void defaulterMailSend(String to, MultipartFile sanctionLetter) {
	MimeMessage mimemessage=sender.createMimeMessage();
		
		try
		{
		MimeMessageHelper helper=new MimeMessageHelper(mimemessage,true);
		helper.setTo(to);
		helper.setFrom(mform);
		helper.setSubject("You are listed as a Defaulter");
		helper.setText("UPDATE : Dear Customer, You are listed as a defaulter in our records. Please pay the pending EMI.We are not forced to legal action if you thik this is an mistake, call as at 9876546378.\n"
				+"Thanks & Regards, \n"
				+"Caller Head, \n"
				+"Balaji Bank.");
		helper.addAttachment("sanctionlatter.pdf", sanctionLetter);
		}
		catch(MessagingException e)
		{
		log.error("Error : "+e);
		}
		
		sender.send(mimemessage);
		
	}

	@Override
	public void fullNillLoan(String to, MultipartFile sanctionLetter) {
		
	MimeMessage mimemessage=sender.createMimeMessage();
		
		try
		{
		MimeMessageHelper helper=new MimeMessageHelper(mimemessage,true);
		helper.setTo(to);
		helper.setFrom(mform);
		helper.setSubject("Your Loan is nil");
		helper.setText("UPDATE : Dear Customer, Congratulations on completely paying off your loan ! EMI has been fullfield successfully !!! \n"
				+"Thanks & Regards, \n"
				+"Account Head, \n"
				+"Balaji Bank.");
		helper.addAttachment("sanctionlatter.pdf", sanctionLetter);
		}
		catch(MessagingException e)
		{
		log.error("Error : "+e);
		}
		
		sender.send(mimemessage);
		
	}

	
	

}
