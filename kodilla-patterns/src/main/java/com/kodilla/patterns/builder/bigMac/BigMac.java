package com.kodilla.patterns.builder.bigMac;

import java.util.*;

public class BigMac {
    public static final String BUN_STANDARD = "Standard";
    public static final String BUN_SEZAM = "Sezam";
    public static final String SAUCE_STANDARD = "Standard";
    public static final String SAUCE_1000_ISLANDS = "1000 wysp";
    public static final String SAUCE_BARBACUE = "Barbacue";

    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigMacBuilder{
            private  String bun;
            private  int burgers;
            private  String sauce;
            private  List<String> ingredients = new ArrayList<>();

            public BigMacBuilder bun(String bun){
                this.bun = bun;
                return this;
            }
            public BigMacBuilder burgers(int burgers){
                this.burgers = burgers;
                return this;
            }

            public BigMacBuilder sauce (String sauce){
                this.sauce = sauce;
                return this;
            }

            public BigMacBuilder ingredient(String ingredient){
                this.ingredients.add(ingredient);
                return this;
            }

            public BigMac build(){

                if(!(bun.equals(BUN_SEZAM) || bun.equals(BUN_STANDARD))){
                    throw new IllegalStateException("There is no such bun specified!");}
                if(burgers<1){
                    throw new IllegalStateException("Without burger it is not Big Mac");}
                if(burgers>5){
                    throw new IllegalStateException("This is too many burgers");}
                if(!(sauce.equals(SAUCE_STANDARD) || sauce.equals(SAUCE_1000_ISLANDS) || sauce.equals(SAUCE_BARBACUE))){
                    throw new IllegalStateException("There is no such sauce specified!");}

                // Tutaj powinno być sprawzdzenie czy lista ingredientów nie zawiera czegoś spoza listy.
                // Teoretycznie można to sprawdzić pętlą dla każdego ingredientu czy jest na liście ale z drugiej strony można zostawić listę otwartą.

                return new BigMac(bun,burgers,sauce,ingredients);
            }

        }
    private BigMac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
