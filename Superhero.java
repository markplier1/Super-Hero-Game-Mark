
public class Superhero {
  private String name;
  private String costume;
  private String weapon;
  private boolean life;
  private int weaponStrength;

  // TODO #1: Add missing constructors. Note that the life attribute should default to true and the weaponStrength attribute should default to 0.
  /*public Superhero(String name, String costume, String weapon) {
    this.name = name;
    this.costume = costume;
    this.weapon = weapon;
    life = true;
    weaponStrength = (int) (Math.random() * 10+1); 
  }*/
  // TODO #2: Add missing methods.
  public Superhero(String name, String costume, String weapon, int weaponStrength) {
    this.name = name;
    this.costume = costume;
    this.weapon = weapon;
    this.life = true;
    this.weaponStrength = weaponStrength;
  }
  
  // TODO #3: Including a toString() method (see topic 1.15 Strings in the CSAwesome2 textbook) to help with printing out the Superhero details.
  public String toString(){
  // all your code below to create a string with details
    String superHeroDetails = "Name: " + name + ", Costume: " + costume + ", Weapon: " + weapon + ", Life: " + life + ", Weapon Strength: " + weaponStrength;
    return superHeroDetails;
  }
}
