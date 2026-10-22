public class Main {

  public static void main(String[] args) {
    /*
     * TODO: Make changes to the Superhero class (provided in a separate file) so
     * that the following code compiles and so that each superhero's details is printed out
     * nicely
     */
    Superhero spiderMan1 = new Superhero("Spiderman", "Red suit", "Super Web");
    System.out.println(spiderMan1);
    Superhero batman1 = new Superhero("Batman", "Batsuit", "Super Strength");
    //spiderMan1.loseLife();
    superheroFight(spiderMan1, batman1);
    System.out.println(batman1);
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
        System.out.println("It's a draw");
      }
    }
  }