package view.impl;

import view.DataAcquirerViewer;

public class DataAcquirerViewerImpl implements DataAcquirerViewer {

    @Override
    public void printInputFilePath() {
        System.out.println("Enter the path to the file");
    }
}
