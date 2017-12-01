package com.iba.project.load.data.file;

import com.iba.project.keeper.plans.PlansKeeper;
import com.iba.project.loggin.results.LoggerForInfo;
import org.junit.Test;

public class LoaderFromFileToKeeperTest {
    private final String filename="data.txt";


    @Test
    public void loadData() {
        LoaderFromFileToKeeper.loadData(filename,";");
        LoggerForInfo.writeInfo(PlansKeeper.getInstance().toString());
    }

}