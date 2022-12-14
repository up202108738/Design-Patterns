package b;

public class StringBar extends Bar {
    public StringBar() {
        super();
    }
    public boolean isHappyHour() {
        return this.happyHour;
    }
    public void startHappyHour() {
        this.happyHour = true;
        this.notifyObservers();
    }
    public void endHappyHour() {
        this.happyHour = false;
        this.notifyObservers();
    }
    public void order( StringDrink drink, StringRecipe recipe){
        recipe.mix(drink);
    }

}
