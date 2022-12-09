package Model;
import java.util.ArrayList;

public class Users {
    String user_name;
    ArrayList <Order> orders;

    public Users(String user_name, ArrayList<Order>orders) {
        this.user_name = user_name;
        this.orders = orders;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
}