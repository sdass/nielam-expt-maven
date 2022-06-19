package org.niel;

/* Assume It is a network or DB call */
public class RandomAdjuster {

    public int resultMultiplier(Integer mul){
        System.out.println("resultMultiplier() mul=" + mul);
        return mul;
    }

    public int resultSubstractor(int substractVal){
        System.out.println("resultSubstractor() substractVal=" + substractVal);
        return substractVal;
    }
}
