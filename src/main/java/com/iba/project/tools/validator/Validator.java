package com.iba.project.tools.validator;

import com.iba.project.loggin.exceptions.Exceptions;

public class Validator
{
    public static boolean isDataValidForPlan(String[] data) {
        try {
            if (data.length != 6) throw new IllegalArgumentException("Invalid length of data ");

            Integer.parseInt(data[2]);
            Integer.parseInt(data[3]);
            Integer.parseInt(data[4]);
        } catch (NumberFormatException exception) {
            Exceptions.notNumberException(exception);
            return false;
        } catch (IllegalArgumentException exception) {
            Exceptions.notCorrectNumbersException(exception);
            return false;
        }
        return true;
    }
    }

