package com.kodilla.stream.beutifier;

public class PoemBeutifier {
   public void beutify(String text, PoemDecorator poemDecorator){
       String result = poemDecorator.decorate( text);
       System.out.println(result);
   }
}
