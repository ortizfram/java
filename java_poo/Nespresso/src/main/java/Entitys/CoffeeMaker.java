package Entitys;

public class CoffeeMaker {

    float maximunCap ;
    float actualCap;

    public CoffeeMaker() {
    }

    public CoffeeMaker(float maximunCap, float actualCap) {
        this.maximunCap = maximunCap;
        this.actualCap = actualCap;
    }

    public float getMaximunCap() {
        return maximunCap;
    }

    public void setMaximunCap(float maximunCap) {
        this.maximunCap = maximunCap;
    }

    public float getActualCap() {
        return actualCap;
    }

    public void setActualCap(float actualCap) {
        this.actualCap = actualCap;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" + "maximunCap=" + maximunCap + ", actualCap=" + actualCap + '}';
    }

    
}
