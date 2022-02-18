package ca.upei.softwaredesign.p2;

public class Sausage extends Topping {
    public Sausage(BasicPizza pizza){
        this.ingredients = pizza;
        this.description = ConstantList.SAUSAGE_TITLE;
    }
    @Override
    public String getDescription(){
        return ingredients.getDescription() + ", " + ConstantList.SAUSAGE_TITLE;
    }
    @Override
    public double cost() {
        return ingredients.cost() + ConstantList.SAUSAGE_COST;
    }
}
