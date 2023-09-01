package com.git.StreamApi.app.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apierror {

	private int statuscode;
	private Date date;
	private String msg;
	private HttpStatus statusmsg;
	private String urlpath;
	
	
	
}
