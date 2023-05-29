package com.cjc.homeloanapplication_finalproject_.app.controller;



import javax.mail.Multipart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.homeloanapplication_finalproject_.app.model.EmailDetails;
import com.cjc.homeloanapplication_finalproject_.app.servicei.EmailDetailsServiceI;



@CrossOrigin("*")
@RestController
public class EmailDetailsController {

	@Autowired
	EmailDetailsServiceI edsi;
	
	@PostMapping(value = "/rejectionSendmail",consumes =MediaType.MULTIPART_FORM_DATA_VALUE)
	public String emailSend(@RequestPart("to") String to)
	{
		try
		{
			System.out.println(to);
		edsi.rejectionMailSend(to);
		return "Send Email Successfully";
		}
		catch (Exception e) {
			return "Error";
		}
	}
	
	@PostMapping(value = "/loanappiarSendmail",consumes =MediaType.MULTIPART_FORM_DATA_VALUE)
	public String loanappiareemailSend(@RequestPart("to") String to)
	{
		try
		{
			System.out.println(to);
		edsi.loanappiareMailSend(to);
		return "Send Email Successfully";
		}
		catch (Exception e) {
			return "Error";
		}
	}
	
	
	@PostMapping(value = "/approvalsanctionletterSendmail",consumes =MediaType.MULTIPART_FORM_DATA_VALUE)
	public String emailSend(@RequestPart("to") String to, @RequestPart("sanctionLetter") MultipartFile sanctionLetter)
	{
		try
		{
			System.out.println(to);
		edsi.approvalMailSend(to,sanctionLetter);
		return "Send Email Successfully";
		}
		catch (Exception e) {
			return "Error";
		}
	}
	
	@PostMapping(value = "/documentSendmail",consumes =MediaType.MULTIPART_FORM_DATA_VALUE)
	public String documentemailSend(@RequestPart("to") String to, @RequestPart("sanctionLetter") MultipartFile sanctionLetter)
	{
		try
		{
			System.out.println(to);
		edsi.documentsMailSend(to,sanctionLetter);
		return "Send Email Successfully";
		}
		catch (Exception e) {
			return "Error";
		}
	}
	
	@PostMapping(value = "/disburseSendmail",consumes =MediaType.MULTIPART_FORM_DATA_VALUE)
	public String disburseemailSend(@RequestPart("to") String to, @RequestPart("sanctionLetter") MultipartFile sanctionLetter)
	{
		try
		{
			System.out.println(to);
		edsi.disburseMailSend(to,sanctionLetter);
		return "Send Email Successfully";
		}
		catch (Exception e) {
			return "Error";
		}
	}
	
	@PostMapping(value = "/defaulterSendmail",consumes =MediaType.MULTIPART_FORM_DATA_VALUE)
	public String defaulteremailSend(@RequestPart("to") String to, @RequestPart("sanctionLetter") MultipartFile sanctionLetter)
	{
		try
		{
			System.out.println(to);
		edsi.defaulterMailSend(to,sanctionLetter);
		return "Send Email Successfully";
		}
		catch (Exception e) {
			return "Error";
		}
	}
	

	@PostMapping(value = "/fullNillLoanmailsend",consumes =MediaType.MULTIPART_FORM_DATA_VALUE)
	public String fullNillLoan(@RequestPart("to") String to, @RequestPart("sanctionLetter") MultipartFile sanctionLetter)
	{
		try
		{
			System.out.println(to);
		edsi.fullNillLoan(to,sanctionLetter);
		return "Send Email Successfully";
		}
		catch (Exception e) {
			return "Error";
		}
	}
}
