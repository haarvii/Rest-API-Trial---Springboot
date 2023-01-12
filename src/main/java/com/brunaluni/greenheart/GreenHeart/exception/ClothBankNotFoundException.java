package com.brunaluni.greenheart.GreenHeart.exception;

public class ClothBankNotFoundException extends RuntimeException {

    public ClothBankNotFoundException(Long id) {
        super("Could not found the category with id " + id);
    }

}
