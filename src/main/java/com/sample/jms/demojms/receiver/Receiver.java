package com.sample.jms.demojms.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.sample.jms.demojms.entity.Mail;

@Component
public class Receiver {
	
	@JmsListener(destination = "bandejaPrincipal", containerFactory = "miFabrica")
	public void bandeja(Mail mail) {
		System.out.println("Mensaje recibido <" + mail + ">");
	}
}
