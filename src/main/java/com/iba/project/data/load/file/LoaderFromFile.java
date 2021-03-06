package com.iba.project.data.load.file;

import com.iba.project.loggin.exceptions.LoggerForExceptions;
import com.iba.project.tools.creator.PlanReader;

import java.io.*;
import java.util.Scanner;

public class LoaderFromFile {
    public static void loadData(String filename, String delimeter) {
        File file=null;
        FileReader fileReader = null;
        try {
            file = new File("data/" + filename);

            fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = reader.readLine();


            while (line != null) {

                String[] parsedLine = parseString(line, delimeter);

                PlanReader.createPlan(parsedLine);

                line = reader.readLine();
            }

        } catch (FileNotFoundException exception)

        {
            LoggerForExceptions.fileNotFoundException(exception);
        } catch (IOException exception)

        {
            LoggerForExceptions.ReadFileException(exception);
        }
        finally {
            try{

                if(fileReader!=null)
                    fileReader.close();
            }
            catch(IOException exception){

                LoggerForExceptions.ReadFileException(exception);
            }

        }

    }

    private static String[] parseString(String data, String delimetr) {
        String[] result = data.split(delimetr);
        return result;

    }
}
