package ca.upei.softwaredesign.p2;

public class Pepperoni extends Topping {
    public Pepperoni(BasicPizza pizza){
        this.ingredients = pizza;
        this.description = ConstantList.PEPPERONI_TITLE;
    }
    @Override
    public String getDescription(){
        return ingredients.getDescription() + ", " + ConstantList.PEPPERONI_TITLE;
    }
    @Override
    public double cost() {
        return ingredients.cost() + ConstantList.PEPPERONI_COST;
    }
}
