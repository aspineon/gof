package guru.springframework.gof.abstractFactory;

import guru.springframework.gof.abstractFactory.product.Pizza;
import org.junit.Test;

/**
 * Created by Admin on 4/5/2015.
 */
public class SicilianPizzaFactoryTest {

    @Test
    public void testCreatePizza() throws Exception {
        BasePizzaFactory pizzaFactory=new SicilianPizzaFactory();
        Pizza cheesePizza=pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza =pizzaFactory.createPizza("pepperoni");
    }
}