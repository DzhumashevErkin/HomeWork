package com.company;

public class Keyboard {

    private String[] layoutArray;
    private boolean presenceOfBlacklight = false;
    private boolean presenceRightNumbers = false;

    public Keyboard(String[] layoutArray, boolean presenceOfBlacklight, boolean presenceRightNumbers) {
        this.layoutArray = layoutArray;
        this.presenceOfBlacklight = presenceOfBlacklight;
        this.presenceRightNumbers = presenceRightNumbers;
    }

    public Keyboard() {
    }

    public String[] getLayoutArray() {
        return layoutArray;
    }

    public void setLayoutArray(String[] layoutArray) {
        this.layoutArray = layoutArray;
    }

    public boolean isPresenceOfBlacklight() {
        return presenceOfBlacklight;
    }

    public void setPresenceOfBlacklight(boolean presenceOfBlacklight) {
        this.presenceOfBlacklight = presenceOfBlacklight;
    }

    public boolean isPresenceRightNumbers() {
        return presenceRightNumbers;
    }

    public void setPresenceRightNumbers(boolean presenceRightNumbers) {
        this.presenceRightNumbers = presenceRightNumbers;
    }
}
