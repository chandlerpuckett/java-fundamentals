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

  }

  private static String pluralize (String word, int num){
    
    if (num > 1){
      return word + "s"; 
    }
    return word;
     
  }

}