package ca.upei.softwaredesign.p2;

public class Large extends BasicPizza {

    public Large(){
        description = ConstantList.LARGE_PIZZA_TITLE;
    }

    @Override
    public double cost() {
        return ConstantList.LARGE_PIZZA_COST;
    }
}
