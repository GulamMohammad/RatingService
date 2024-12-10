package com.path.rating.service.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException() {
		super("Resource Not found in the Server");
	}
	public ResourceNotFoundException(String message) {
		super(message);
	}
	

}
