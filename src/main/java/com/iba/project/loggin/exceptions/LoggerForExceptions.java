package com.iba.project.loggin.exceptions;

import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LoggerForExceptions {
    private static final Logger log = Logger.getLogger(LoggerForExceptions.class);

    public static void fileNotFoundException(FileNotFoundException exception) {
        log.error("There is no file in this directory");
        log.trace(exception.getStackTrace());
    }

    public static void ReadFileException(IOException exception) {

        log.error("Failed to read file");
        log.trace(exception.getStackTrace());
    }


    public static void notNumberException(NumberFormatException exception) {
        log.error("You should enter integer number");
        log.trace(exception.getStackTrace());
    }

    public static void notCorrectNumbersException(IllegalArgumentException exception) {
        log.error(exception.getMessage());
        log.trace(exception.getStackTrace());

    }


}
