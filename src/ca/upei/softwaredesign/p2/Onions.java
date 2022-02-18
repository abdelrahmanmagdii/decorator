package ca.upei.softwaredesign.p2;

public class Onions extends Topping {
    public Onions(BasicPizza pizza){
        this.ingredients = pizza;
        this.description = ConstantList.ONION_TITLE;
    }
    @Override
    public String getDescription(){
        return ingredients.getDescription() + ", " + ConstantList.ONION_TITLE;
    }
    @Override
    public double cost() {
        return ingredients.cost() + ConstantList.ONION_COST;
    }
}
