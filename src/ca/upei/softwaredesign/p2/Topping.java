package ca.upei.softwaredesign.p2;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Set;

public abstract class Topping extends BasicPizza {
    BasicPizza ingredients;
    public abstract String getDescription();
    private static String getCountName(int x)
    {
        switch(x)
        {
            case 0:
                return "No";
            case 1:
                return "Single";
            case 2:
                return "Double";
            case 3:
                return "Triple";
            default:
                return "Too much";
        }
    }

    public String prettyPrint() {
        BasicPizza current = this;
        BasicPizza root = null;
        //HashMap<BasicPizza, Integer> count = new HashMap<>();
        HashMap<BasicPizza, Integer> count = new HashMap<>();
        while (root != current) {
            if (current instanceof Topping) {
                count.merge(current, 1, Integer::sum);
                current = ((Topping) current).ingredients;
            } else {
                root = current;
            }
        }
        StringBuffer result = new StringBuffer();
        result.append(root.getDescription());
        Set<BasicPizza> keyList = count.keySet();
        for (BasicPizza key : keyList){
            int amount = count.get(key);
            result.append(", ").append(getCountName(amount)).append(" ").append(key.description);
        }
        DecimalFormat formatter = new DecimalFormat("#.##");
        result.append(" $ ").append(formatter.format(this.cost()));
        return result.toString();
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof  Topping))
            return false;
        Topping otherTopping = (Topping) other;
        return this.description.equals((otherTopping.description));
    }

    @Override
    public int hashCode() {
        return this.description.hashCode();
    }

}
