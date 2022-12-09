package Model;
import Model.Items;

import java.util.ArrayList;

public class Order {
    String user_name;
    ArrayList<Items> items;

    public Order(String user_name, ArrayList<Items> items) {
        this.user_name = user_name;
        this.items = items;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items= items;
    }
}