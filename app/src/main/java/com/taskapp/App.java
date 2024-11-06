package com.taskapp;

import java.io.IOException;

import com.taskapp.exception.AppException;
import com.taskapp.ui.TaskUI;

public class App {

    public static void main(String[] args) throws IOException, AppException {
        TaskUI ui = new TaskUI();
        ui.displayMenu();
    }
}
