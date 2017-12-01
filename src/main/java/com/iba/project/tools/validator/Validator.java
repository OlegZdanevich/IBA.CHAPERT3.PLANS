package com.iba.project.tools.validator;

import com.iba.project.loggin.exceptions.LoggerForExceptions;

import java.math.BigDecimal;

public class Validator
{
    public static boolean isDataValidForPlan(String[] data) {
        try {
            if (data.length != 6) throw new IllegalArgumentException("Invalid length of data ");

            new BigDecimal(data[2]);
            new BigDecimal(data[3]);
            new BigDecimal(data[4]);
        } catch (NumberFormatException exception) {
            LoggerForExceptions.notNumberException(exception);
            return false;
        } catch (IllegalArgumentException exception) {
            LoggerForExceptions.notCorrectNumbersException(exception);
            return false;
        }
        return true;
    }

    public static boolean isNumberOfUsersValid(String[] data){
        try {
            if (data.length != 6) throw new IllegalArgumentException("Invalid length of data ");

            Long.parseLong(data[5]);

        }
        catch (NumberFormatException exception)
        {
            LoggerForExceptions.notNumberException(exception);
            return false;
        }
        catch (IllegalArgumentException exception)
        {
            LoggerForExceptions.notCorrectNumbersException(exception);
            return false;
        }
        return true;

    }
    }

