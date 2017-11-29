package com.iba.project.load.data.file;

import com.iba.project.keeper.plans.PlansKeeper;
import com.iba.project.loggin.results.Info;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoaderFromFileToKeeperTest {
    private final String filename="data.txt";


    @Test
    public void loadData() {
        LoaderFromFileToKeeper.loadData(filename,";");
        Info.writeInfo(PlansKeeper.getInstance().toString());
    }

}