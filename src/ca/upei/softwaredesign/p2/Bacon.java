package ca.upei.softwaredesign.p2;

public class Bacon extends Topping {
    public Bacon(BasicPizza pizza){
        this.ingredients = pizza;
        this.description = ConstantList.BACON_TITLE;
    }

    @Override
    public String getDescription(){
        return ingredients.getDescription() + ", " + ConstantList.BACON_TITLE;
    }

    @Override
    public double cost() {
        return ingredients.cost() + ConstantList.BACON_COST;
    }

}
