package com.devcarlosvieira.course.services.exceprions;

public class ResouceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ResouceNotFoundException(Object id) {
		super("Resource not found. Id " + id + " do not exist.");
	}
}
