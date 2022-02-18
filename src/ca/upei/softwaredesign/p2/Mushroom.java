package ca.upei.softwaredesign.p2;

public class Mushroom extends Topping {
    public Mushroom(BasicPizza pizza){
        this.ingredients = pizza;
        this.description = ConstantList.MUSHROOM_TITLE;
    }
    @Override
    public String getDescription(){
        return ingredients.getDescription() + ", " + ConstantList.MUSHROOM_TITLE;
    }
    @Override
    public double cost() {
        return ingredients.cost() + ConstantList.MUSHROOM_COST;
    }
}
