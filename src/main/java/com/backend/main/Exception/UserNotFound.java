package com.backend.main.Exception;

public class UserNotFound extends RuntimeException{

	public UserNotFound(String message) {
		super(message);
	}
}
