import java.util.ArrayList;
import java.util.List;

public class ListOfGoods {    //"SOLID-S
    // класс описывает только список товаров и работу с этим списком
    private static ListOfGoods listOfGoods;
    protected static List<Goods> list;

    private ListOfGoods() {

    }

    public static ListOfGoods getInstance() {
        if (listOfGoods == null) {
            listOfGoods = new ListOfGoods();
            list = new ArrayList<>();
        }
        return listOfGoods;
    }

    public ListOfGoods addGoods(Goods goods) {
        list.add(goods);
        return listOfGoods;
    }

    public static void printGoods() {
        System.out.println("Список товаров:");
        for (Goods goods : list) {
            System.out.println(goods);
        }
    }

    public static Goods getGoods(int id) {
        for (Goods goods : list) {
            if (goods.getId() == id) {
                return goods;
            }
        }
        return null;
    }
}
