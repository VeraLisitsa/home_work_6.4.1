import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ShoppingBasket {   //"SOLID-S"
    private Map<Goods, Integer> shoppingBasket = new HashMap<>();

    public ShoppingBasket() {

    }

    public void addProduct(Goods goods, int amount) {
        shoppingBasket.put(goods, amount);
    }

    public void printBasket() {
        Set<Goods> productInBasket = shoppingBasket.keySet();
        Iterator<Goods> iterator = productInBasket.iterator();
        Goods goods;
        while (iterator.hasNext()) {
            goods = iterator.next();
            System.out.println(goods.getName() + " - " + shoppingBasket.get(goods) + "шт.");
        }
    }

    public double priceOfBasket() {
        Set<Goods> productInBasket = shoppingBasket.keySet();
        Iterator<Goods> iterator = productInBasket.iterator();
        Goods goods;
        double sum = 0;
        while (iterator.hasNext()) {
            goods = iterator.next();
            sum += goods.getPrice() * shoppingBasket.get(goods);
        }
        return sum;
    }
}
