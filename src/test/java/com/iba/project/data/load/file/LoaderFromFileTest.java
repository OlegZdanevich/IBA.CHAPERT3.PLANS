package com.iba.project.data.load.file;

import com.iba.project.keeper.plans.PlansKeeper;
import com.iba.project.loggin.results.LoggerForInfo;
import org.junit.Test;

public class LoaderFromFileTest {
    private final String filename="data.txt";


    @Test
    public void loadData() {
        LoaderFromFile.loadData(filename,";");
        LoggerForInfo.writeInfo(PlansKeeper.getInstance().toString());
    }

}