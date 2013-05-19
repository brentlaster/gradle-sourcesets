package org.gradle.basics;

public class greetings implements GetGreetings {
	
	public greetings() {
	}
	
	public String retrieveMsg() {
		final String message = "Hello Gradle Class!";
		return message;
	}
}