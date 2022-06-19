package org.niel;

public class Calculator {

    private RandomAdjuster randomAdjuster;

    public Calculator(){
        System.out.println("no args");
    }

    /*
    public Calculator(RandomAdjuster randomAdjuster){
        this();
        this.randomAdjuster = randomAdjuster;
    }
    */
    public void setRandomAdjuster(RandomAdjuster randomAdjuster) {
        this.randomAdjuster = randomAdjuster;
    }

    int add(int a, int b){
        System.out.println("inputs: a=" + a + " b=" + b);
        return a + b;
    }
    int addWithAdjust(int a, int b){
        System.out.println("addWithAdjust: a=" + a + " b=" + b);
        int sumActual =  a + b;
        int adjust = randomAdjuster.resultMultiplier(55); //hard coded to 55. To be a random value
        int valWithAdjustment = adjust * sumActual;
        return valWithAdjustment;
    }
}
