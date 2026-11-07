package com.whatsapp.message;

import java.io.IOException;

public class MessageDriver {

	public static void main(String[] args) throws IOException
	{
		SenderMessage sendMessage = new SenderMessage();
		Message message = new Message("Diwali ka plain kya hai?");
		sendMessage.serializableMessage(message);

	}

}
