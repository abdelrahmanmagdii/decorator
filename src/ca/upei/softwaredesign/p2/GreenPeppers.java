package ca.upei.softwaredesign.p2;

public class GreenPeppers extends Topping {
    public GreenPeppers(BasicPizza pizza){
        this.ingredients = pizza;
        this.description = ConstantList.GREEN_PEPPER_TITLE;
    }
    @Override
    public String getDescription(){
        return ingredients.getDescription() + ", " + ConstantList.GREEN_PEPPER_TITLE;
    }


    @Override
    public double cost() {
        return ingredients.cost() + ConstantList.GREEN_PEPPER_COST;
    }


}
