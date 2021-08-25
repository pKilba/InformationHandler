package view.impl;

import view.MainViewer;

public class MainViewerImpl implements MainViewer {
    @Override
    public String showMenu() {
        return "Выберите действие: \n"+
                "...";
    }
}
