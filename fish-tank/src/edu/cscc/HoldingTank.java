package edu.cscc;

public class HoldingTank {
    private Integer current;
    private Integer maxCapacity;

    public HoldingTank (Integer current, Integer maxCapacity) {
        this.current = current;
        this.maxCapacity = maxCapacity;
    }

    public Integer getCurrent() {
        if (current >= maxCapacity) {
            current = maxCapacity;
        }
        return this.current;
    }

    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    public void addVolume(int volume){
        this.current = this.getCurrent() + volume;

        if (current >= this.getMaxCapacity()) {
            current = this.getMaxCapacity();
        }
    }

    public void drainVolume(int volume){
        this.current = this.current - volume;

        if (this.current <= 0) {
            this.current = 0;
        }
    }

    public void printVolume(){
        System.out.println("The tank volume is: " + this.current);
    }
}
