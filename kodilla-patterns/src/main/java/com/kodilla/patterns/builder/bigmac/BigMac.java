package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private String bun;
    private int burgers;
    private String sauce;
    List<String> Ingredients;

    public static class BigMacBuilder{
        private String bun;
        private int burgers;
        private String sauce;
        List<String> Ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun){
            this.bun = bun;
            return this;
        }

    }

}
