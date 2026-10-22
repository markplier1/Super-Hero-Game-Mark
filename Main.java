public class Main {

  public static void main(String[] args) {
    /*
     * TODO: Make changes to the Superhero class (provided in a separate file) so
     * that the following code compiles and so that each superhero's details is printed out
     * nicely
     */
    Superhero placeholder = new Superhero();
    Superhero spiderMan1 = new Superhero("Spiderman", "Red suit", "Super Web", 5);
    System.out.println(spiderMan1);
    Superhero batman1 = new Superhero("Batman", "Batsuit", "Super Strength", 5);
    //spiderMan1.loseLife();
    superheroFight(spiderMan1, batman1);
    System.out.println(batman1);


    System.out.println("The Green Goblin shows up...");
    System.out.println("Spiderman is killed");
    System.out.println(spiderMan1);


    int batmanSpecial =batman1.specialAttack(4);
    int placeHolderSpecial = placeholder.specialAttack(9001);

    System.out.println(batman1.getName() + " uses his special attack and deals " + batmanSpecial + " damage.");
    System.out.println(placeholder.getName() + " uses his special attack and deals " + placeHolderSpecial + " damage.");

}
    public static void superheroFight(Superhero spiderMan1, Superhero batman1) {
      System.out.println("Fight");
      System.out.println(spiderMan1.getName() + spiderMan1.getWeapon() + "Strength " + spiderMan1.getWeaponStrength());
      System.out.println(batman1.getName() + batman1.getWeapon() + "Strength " + batman1.getWeaponStrength());

      if (spiderMan1.getWeaponStrength() > batman1.getWeaponStrength()) {
        System.out.println(spiderMan1.getName() + " wins with their " + batman1.getWeapon());
      }
      else if (batman1.getWeaponStrength() > spiderMan1.getWeaponStrength()) {
        System.out.println(batman1.getName() + " wins with their " + spiderMan1.getWeapon());
      }
      else {
        System.out.println("Spiderman wins with the help of Iron man");
      }
    }
  }