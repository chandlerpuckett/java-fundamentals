package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

  public static void main(final String[] args){
    //

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");


    flipNHeads(3);
    flipNHeads(5);

    clock();

  }

  private static String pluralize (String word, int num){
    
    if (num > 1){
      return word + "s"; 
    }
    return word;
     
  }

  private static void flipNHeads (int n){

    int count = 0;
    int heads = 0;

    while (n > heads){

      double rando = Math.random();

      if (rando >= 0.5){
        System.out.println("heads");
        heads++; 
      } else {
        System.out.println("tails");
        heads = 0;
      }

      count++;

    }
    
    System.out.println("It took " + count + " flips to flip " + n + " heads in a row");
  }
  
  private static void clock (){

    String test = "";
    float count = 0;

    while (true){
      LocalDateTime now = LocalDateTime.now();
      
      DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
      String formatDateTime = now.format(format);

      if (!test.equals(formatDateTime)){
        String out = String.format("%.2fM", count/1_000_000);
        System.out.println(formatDateTime + " " + out + " Mhz");
        count = 0;
      }
      
      count++;
      test = formatDateTime;
      
    }

  }

}