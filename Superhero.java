public class Superhero {
  private String name;
  private String costume;
  private String weapon;
  private boolean life;
  private int weaponStrength;

  // TODO #1: Add missing constructors. Note that the life attribute should default to true and the weaponStrength attribute should default to 0.
  public Superhero(String name,String costume, String weapon) {
    this.name = name;
    this.weapon = weapon;
    this.weaponStrength = (int) (Math.random() * 10) + 1; // Random integer from 1 to 10
  }

  /*public SuperheroSelf(String name, String weapon, int weaponStrength) {
    this.name = name;
    this.weapon = weapon;
    this.weaponStrength = weaponStrength;
  }*/

  public String getWeapon() {
    return weapon;
  }

  public int getWeaponStrength() {
    return weaponStrength;
  }

  public String getName() {
    return name;
  }
  // TODO #2: Add missing methods.
  
  // TODO #3: Including a toString() method (see topic 1.15 Strings in the CSAwesome2 textbook) to help with printing out the Superhero details.
  public String toString(){
  // all your code below to create a string with details
    String superHeroDetails = "";
    return superHeroDetails;
  }
}
