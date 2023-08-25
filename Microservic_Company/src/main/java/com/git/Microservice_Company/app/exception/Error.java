package com.git.Microservice_Company.app.exception;


import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class Error {

	private int statuscode;
	private String msg;
	private Date date;
	private HttpStatus statusmsg;
	private String urlpath;
}
