package kz.springboot.springbootdemo.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Items> items = new ArrayList<>();

    static {

        items.add(new Items(1L, "IPhone 11Pro", 400000));
        items.add(new Items(2L, "XIAOMI Redmi Note 9 ", 120000));
        items.add(new Items(3L, "Samsung Galaxy Note 11", 320000));
        items.add(new Items(4L, "Nokia 3110", 15000));
    }

    private static Long id = 5L;

    public static ArrayList<Items> getItems() {
        return items;
    }

    public static void addItem(Items item){
        item.setId(id);
        items.add(item);
        id++;
    }

    public static Items getItem(Long id){
        for (Items it : items){
            if (it.getId()==id) return it;
        }
        return null;
    }
}
