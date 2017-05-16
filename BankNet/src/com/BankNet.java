package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BankNet {

    private double[][] credits;
    private double safeLevel;
    private Function<Integer, String> mapToName;

    public double getSafeLevel() {
        return safeLevel;
    }

    public void setSafeLevel(double safeLevel) {
        if (safeLevel == 0) {
            this.safeLevel = 300;
        } else {
            this.safeLevel = safeLevel;
        }
    }

//  TODO: Set and Get for mapToName - Lambda that return "Bank" for every passed integer
//    public Function<Integer, String> getMapToName() {
//        return bankNumber -> "Bank";
//    }
    public Function<Integer, String> getMapToName() {
        return mapToName;
    }

    public void setMapToName(Function<Integer, String> mapToName) {
        this.mapToName = mapToName;
    }

//    private String bankNames[];
//    private Function<Integer, String> mapToName = new Function<Integer, String>() {
//        public String apply(Integer bankNumber) {
//            String bankName = bankNames[bankNumber];
//            return bankName;
//        }
//    };
//  =============================================
//  Lambda version
//    private Function<Integer, String> mapToName = (Integer bankNumber) -> {
//        return bankNames[bankNumber];
//    };
    public BankNet(int bankCount, double safeLevel, Function<Integer, String> mapToName) {
        credits = new double[bankCount][bankCount];
        setSafeLevel(safeLevel);
        setMapToName(mapToName);
    }

    public boolean hasGivenCredit(int i, int j) {
        return credits[i][j] != 0;
    }

    public void setCredit(int i, int j, double credit) {
        credits[i][j] = credit;
    }

    public double getCredit(int i, int j) {
        return credits[i][j];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Entered banks\nSafe Level: %.2f\n", getSafeLevel()));
        for (int i = 0; i < credits.length; i++) {
            for (int j = 0; j < credits.length; j++) {
                if (getCredit(i, j) != 0) {
                    result.append(String.format("[%s<-%.2f->%s]", mapToName.apply(i), getCredit(i, j), mapToName.apply(j)));
                    // TODO: Two credits per row
                    if (j % 2 != 0) {
                        result.append("\n");
                    }
                }
            }
        }
        return result.toString();
    }

    public boolean isSafeBank(int i) {
        double capital = 0;
        double creds = 0;
        for (int j = 0; j < credits.length; j++) {
            capital += credits[i][j];
            if (j != i) {
                creds += credits[j][i];
            }
        }
        return capital - creds >= getSafeLevel() && creds / capital < 0.8;
    }

    public void invalidateCredits(int i, double[][] transactions) {
        for (int j = 0; j < credits.length; j++) {
            credits[j][i] = 0;
        }
    }

    public List<String> findUnsafebanks() {
        List<Integer> checkBanks = new ArrayList<>();
        for (int i = 0; i < credits.length; i++) {
            if (!isSafeBank(i)) {
                checkBanks.add(i);
            }
        }
        List<String> unsafeBanks = checkBanks
                .stream()
//              .map(i -> mapToName.apply(i))
                .map(mapToName::apply) // Method reference
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
        return unsafeBanks;
    }
}
