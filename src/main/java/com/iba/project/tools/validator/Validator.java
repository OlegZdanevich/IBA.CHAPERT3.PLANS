package com.iba.project.tools.validator;

import com.iba.project.loggin.exceptions.Exceptions;

public class Validator
{
    public static boolean isDataValidForPlan(String[] data) {
        try {
            if (data.length != 6) throw new IllegalArgumentException("Invalid length of data ");

            Double.parseDouble(data[2]);
            Double.parseDouble(data[3]);
            Double.parseDouble(data[4]);
        } catch (NumberFormatException exception) {
            Exceptions.notNumberException(exception);
            return false;
        } catch (IllegalArgumentException exception) {
            Exceptions.notCorrectNumbersException(exception);
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
            Exceptions.notNumberException(exception);
            return false;
        }
        catch (IllegalArgumentException exception)
        {
            Exceptions.notCorrectNumbersException(exception);
            return false;
        }
        return true;

    }
    }

