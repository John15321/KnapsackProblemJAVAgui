package com.company;
// AVE CESAR - FOR THE EMPEROR

import java.util.ArrayList;
import java.util.List;

public class Bnapsack {

    int capacitanus;
    int amountus;
    int backpackusWeightus = 0;
    int backpackusValues = 0;
    List<Integer> valuesListus = new ArrayList<Integer>();
    List<Integer> weightusListus = new ArrayList<Integer>();

    public Bnapsack(int amountus, int capacitanusMaximus) {
        this.capacitanus = capacitanusMaximus;
        this.amountus = amountus;
        solveTheProblemo();
    }

    public void solveTheProblemo() {
        RandomNumberGenerator numberusRandomus = new RandomNumberGenerator(21);

        for (int i = 0; i < amountus; i++) {
            valuesListus.add(numberusRandomus.nextInt(1, 29));
            weightusListus.add(numberusRandomus.nextInt(1, 29));
        }
        for (int i = 0; i < amountus; i++) {
            if (backpackusWeightus + weightusListus.get(i) <= capacitanus && (valuesListus.get(i) > 0)) {
                backpackusWeightus += weightusListus.get(i);
                backpackusValues += valuesListus.get(i);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringReturn = new StringBuilder();
        for (int i = 0; i < amountus; i++) {
            stringReturn.append(i).append(".").append("\tWeight: ").append(weightusListus.get(i)).append("\tValue: ").append(valuesListus.get(i)).append("\n");
        }
        stringReturn.append("Knapsack value: ").append(backpackusValues).append("\n");
        stringReturn.append("Knapsack weight: ").append(backpackusWeightus).append("\n");
        return stringReturn.toString();
    }

}