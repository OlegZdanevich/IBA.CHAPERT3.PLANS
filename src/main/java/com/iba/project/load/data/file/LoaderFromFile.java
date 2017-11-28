package com.iba.project.load.data.file;

import com.iba.project.loggin.exceptions.Exceptions;

import java.io.*;

public class LoaderFromFile {
    public static void loadData(String filename, String delimetr) {
        try {
            File data = new File("data/" + filename);

            FileReader fr = new FileReader(data);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            while (line != null) {
                String[] parsedLine = parseString(line, delimetr);

                //if(Validator.isDataValid(parsedLine))
                //{
                //  Plan plan=
                //PlansKeeper plans=PlansKeeper.getInstance();


                //}
                line = reader.readLine();
            }

        } catch (FileNotFoundException exception)

        {
            Exceptions.fileNotFoundException(exception);
        } catch (IOException exception)

        {
            Exceptions.ReadFileException(exception);
        }

    }

    private static String[] parseString(String data, String delimetr) {
        String[] result = data.split(delimetr);
        return result;

    }
}
