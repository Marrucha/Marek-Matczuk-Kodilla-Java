package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public final class Library {
    private final List<String> books = new ArrayList<>();

    @Autowired
    LibraryDbController libraryDbController;


/*    @Autowired
    public void setLibraryDbController(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }*/

    public Library() {
        // do nothing
    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}