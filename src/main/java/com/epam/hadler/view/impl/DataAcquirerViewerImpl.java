package com.epam.hadler.view.impl;

import com.epam.hadler.view.DataAcquirerViewer;

public class DataAcquirerViewerImpl implements DataAcquirerViewer {

    @Override
    public void printInputFilePath() {
        System.out.println("Enter the path to the file");
    }
}
