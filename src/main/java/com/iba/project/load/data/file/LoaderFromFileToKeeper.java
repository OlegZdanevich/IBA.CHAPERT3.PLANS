package com.iba.project.load.data.file;

import com.iba.project.loggin.exceptions.Exceptions;
import com.iba.project.tools.creator.PlanReader;

import java.io.*;

public class LoaderFromFileToKeeper {
    public static void loadData(String filename, String delimetr) {
        File file=null;
        FileReader fileReader = null;
        try {
            file = new File("data/" + filename);

            fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();


            while (line != null) {
                String[] parsedLine = parseString(line, delimetr);

                PlanReader.createPlan(parsedLine);

                line = reader.readLine();
            }

        } catch (FileNotFoundException exception)

        {
            Exceptions.fileNotFoundException(exception);
        } catch (IOException exception)

        {
            Exceptions.ReadFileException(exception);
        }
        finally {
            try{

                if(fileReader!=null)
                    fileReader.close();
            }
            catch(IOException exception){

                Exceptions.ReadFileException(exception);
            }

        }

    }

    private static String[] parseString(String data, String delimetr) {
        String[] result = data.split(delimetr);
        return result;

    }
}