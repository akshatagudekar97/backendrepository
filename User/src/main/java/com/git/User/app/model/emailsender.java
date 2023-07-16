package com.git.User.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class emailsender {

	private String to;
	private String from;
	private String subject;
	private String textbodymsg;
	
}
