package ca.upei.softwaredesign.p2;

public class BlackOlives extends Topping {
    public BlackOlives(BasicPizza pizza){
        this.ingredients = pizza;
        this.description = ConstantList.BLACK_OLIVE_TITLE;
    }
    @Override
    public String getDescription(){
        return ingredients.getDescription() + ", " + ConstantList.BLACK_OLIVE_TITLE;
    }
    @Override
    public double cost() {
        return ingredients.cost() + ConstantList.BLACK_OLIVE_COST;
    }
}
