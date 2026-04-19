public abstract class CaffeineBeverage {
  public final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  public void boilWater() {
    System.out.println("Boiling water");
  }

  abstract void brew();

  private void pourInCup() {
    System.out.println("Pouring in cup...");
  }

  abstract void addCondiments();
}
