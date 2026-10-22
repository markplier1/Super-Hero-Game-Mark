public class Superhero {
  private String name;
  private String costume;
  private String weapon;
  private boolean life;
  private int weaponStrength;

  // TODO #1: Add missing constructors. Note that the life attribute should default to true and the weaponStrength attribute should default to 0.
  public Superhero(String name, String costume, String weapon, int weaponStrength) {
    this.name = name;
    this.weapon = weapon;
    this.costume = costume;
    this.life=true;
    this.weaponStrength = weaponStrength;
  }
  public Superhero() {
    this.name = "No name";
    this.costume = "a t-shirt";
    this.weapon = "fist";
    this.life = true;
    this.weaponStrength = 0;
  }

  public String getWeapon() {
    return weapon;
  }

  public int getWeaponStrength() {
    return weaponStrength;
  }

  public String getName() {
    return name;
  }

  public int specialAttack(int number) {
    return weaponStrength + number;
  }


  // TODO #2: Add missing methods.
  
  // TODO #3: Including a toString() method (see topic 1.15 Strings in the CSAwesome2 textbook) to help with printing out the Superhero details.
  public String toString(){
  // all your code below to create a string with details
    String superHeroDetails = "";
    return superHeroDetails;
  }
}
