package com.kodilla.stream.beutifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeutifier poemBeutifier = new PoemBeutifier();
        poemBeutifier.beutify("Kodilla",(s)->s.toLowerCase());
        poemBeutifier.beutify("Kodilla", (s)->"zzz" + s + "aaaa");
        poemBeutifier.beutify("Kodilla", (s)->s + " " +s.getBytes());
        poemBeutifier.beutify("  Kodilla      ", (s)->s.trim());
    }
}
