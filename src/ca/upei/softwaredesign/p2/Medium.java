package ca.upei.softwaredesign.p2;

public class Medium extends BasicPizza {

    public Medium(){
        description = ConstantList.MEDIUM_PIZZA_TITLE;
    }

    @Override
    public double cost() {
        return ConstantList.MEDIUM_PIZZA_COST;
    }
}
