package com.company;

import java.util.Arrays;

public class TechnicalLibraryDepartment extends LibraryDepartment {
    private boolean hasComputer;

    @Override
    public String toString() {
        String hasComputer = "";
        if (!this.hasComputer) hasComputer = "не ";
        return "Технический отдел библиотеки " +
                hasComputer + "имеет комьютер\n" +
                "Книги в данном отделе: " + Arrays.toString(this.getBooks());
    }

    public TechnicalLibraryDepartment() {
    }


    public TechnicalLibraryDepartment(boolean hasComputer) {
        this.hasComputer = hasComputer;
    }

    public boolean isHasComputer() {
        return hasComputer;
    }

    public void setHasComputer(boolean hasComputer) {
        this.hasComputer = hasComputer;
    }
}
