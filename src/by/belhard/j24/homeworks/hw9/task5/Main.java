package by.belhard.j24.homeworks.hw9.task5;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        CheckList vasily = new CheckList();

        vasily.addOrder("Olga", "milk", "milk", "bread");
        vasily.addOrder("Igor", "beer", "beer", "beer");
        vasily.addOrder("Vasily", "pelmeni");
        vasily.addOrder("Mahmud", "bread", "beer", "mazik");
        vasily.addOrder("Mahmud", "bread", "beer");

        Map<String, Integer> goodsMap = vasily.calculateGoodsQuantity();

        goodsMap.forEach((k, v) -> System.out.printf("%s : %d\n", k, v));
    }
}
