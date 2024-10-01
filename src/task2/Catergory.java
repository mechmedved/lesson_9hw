package task2;

import java.util.Arrays;

public class Catergory {
    private String name;
    private Product[] goods;

    public Catergory(String name, Product[] goods) {
        this.name = name;
        this.goods = goods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getGoods() {
        return goods;
    }

    public void setGoods(Product[] goods) {
        this.goods = goods;
    }
}
