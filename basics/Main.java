package basics;

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

}