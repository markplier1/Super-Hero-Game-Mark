
    import java.util.Scanner;
public class Superhero {
  private String name;
  private String costume;
  private String weapon;
  private boolean life;
  private int weaponStrength;

  // TODO #1: Add missing constructors. Note that the life attribute should default to true and the weaponStrength attribute should default to 0.
  public void SuperHero(boolean life, double weaponStrength) {
    life = true;
    weaponStrength = Math.random()*10+1;
  }
  // TODO #2: Add missing methods.
  public void selfSuperHero(boolean life, double weaponStrength){
    life = true;
    Scanner scan = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter weapon strength");
    weaponStrength = scan.nextDouble();
    System.out.println(weaponStrength);
    scan.close();  // Output user input
  }
  
  // TODO #3: Including a toString() method (see topic 1.15 Strings in the CSAwesome2 textbook) to help with printing out the Superhero details.
  public String toString(){
  // all your code below to create a string with details
    String superHeroDetails = "";
    return superHeroDetails;
  }
}
