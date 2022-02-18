package ca.upei.softwaredesign.p2;

public class Small extends BasicPizza {

    public Small(){
        description = ConstantList.SMALL_PIZZA_TITLE;
    }

    @Override
    public double cost() {
        return ConstantList.SMALL_PIZZA_COST;
    }
}
