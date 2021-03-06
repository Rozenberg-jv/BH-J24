package by.belhard.j24.homeworks.hw9.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckList {

    private final List<Order> rawOrdersList = new ArrayList<>();
    private Map<String, Integer> goodsMap = new HashMap<>();

    public void addOrder(String nameOfFriend, String good, String... goods) {

        rawOrdersList.add(new Order(nameOfFriend, good, goods));
    }

    public Map<String, Integer> calculateGoodsQuantity() {

        for (Order order : rawOrdersList) {
            for (String good : order.getGoods()) {
                if (goodsMap.containsKey(good))
                    goodsMap.put(good, goodsMap.get(good) + 1);
                else
                    goodsMap.put(good, 1);
            }
        }

        return goodsMap;
    }

    public List<Order> getRawOrdersList() {
        return rawOrdersList;
    }

    public Map<String, Integer> getGoodsMap() {
        return goodsMap;
    }
}
