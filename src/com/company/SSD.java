package com.company;

public class SSD {

    private String memory;
    private int amountDisksDivided = 1;

    public SSD() {
    }

    public SSD(String memory, int amountDisksDivided) {
        this.memory = memory;
        this.amountDisksDivided = amountDisksDivided;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public int getAmountDisksDivided() {
        return amountDisksDivided;
    }

    public void setAmountDisksDivided(int amountDisksDivided) {
        this.amountDisksDivided = amountDisksDivided;
    }
}
