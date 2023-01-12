package com.brunaluni.greenheart.GreenHeart.exception;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(Long id) {
        super("Could not found the user with id " + id);
    }
}
