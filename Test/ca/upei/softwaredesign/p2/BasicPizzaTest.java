package ca.upei.softwaredesign.p2;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasicPizzaTest {

    @Test
    public void test() {
        Topping pizza1 = new Mushroom(new Onions(new Large()));
        Topping pizza2 = new Bacon(new Mushroom(new Bacon(new Small())));
        Topping pizza3 = new BlackOlives(new Sausage(new Medium()));

//        System.out.println(pizza1.getDescription() + " $" + pizza1.cost());
        System.out.println(pizza1.prettyPrint());
//        System.out.println(pizza2.getDescription() + " $" + pizza2.cost());
        System.out.println(pizza2.prettyPrint());
//        System.out.println(pizza3.getDescription() + " $" + pizza3.cost());
        System.out.println(pizza3.prettyPrint());
        assertEquals(15.35,pizza1.cost(),0.01);
        assertEquals(13.40,pizza2.cost(),0.01);
        assertEquals(11.95,pizza3.cost(),0.01);

//        Topping pizza4 = new BlackOlives(new Sausage(new Sausage(new BlackOlives(new BlackOlives(  new Medium())))));
//        System.out.println(pizza4.prettyPrint());
    }
}
        /*o Large pizza with onion and mushrooms
o Small pizza with bacon, mushrooms and bacon
o Medium pizza with olives and sausage
Beverage beverage2 = new Whip(new Mocha(new Mocha(new DarkRoast())));*/