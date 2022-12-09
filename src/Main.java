import Model.Items;
import Model.Order;
import Model.Users;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //listing out the items available
        Items item1=new Items("t-shirt1","1111","brand1",250);
        Items item2=new Items("t-shirt2","1112","brand2",120);
        Items item3=new Items("t-shirt3","1113","brand1",121);
        Items item4=new Items("t-shirt4","1114","brand1",115);
        Items item5=new Items("t-shirt5","1115","brand2",150);

        //creating an arraylist to store the items ordered by the user.
        ArrayList<Items> items_u1=new ArrayList<>();

        items_u1.add(item1);
        items_u1.add(item2);

        //creating an arraylist to store the items ordered by the second user.

        ArrayList<Items> items_u2=new ArrayList<>();
        items_u2.add(item3);
        items_u2.add(item4);

        //creating an arraylist to store the number of orders of an user.
        ArrayList<Order> orders_u1=new ArrayList<>();
        Order u1_o1=new Order("u1",items_u1);
        Order u1_o2=new Order("u1",items_u1);

        orders_u1.add(u1_o1);
        orders_u1.add(u1_o2);

        //creating an arraylist to store the number of orders of second user.
        ArrayList<Order> orders_u2=new ArrayList<>();
        Order u2_o1=new Order("user2",items_u1);
        Order u2_o2=new Order("user2",items_u2);

        orders_u1.add(u2_o1);
        orders_u1.add(u2_o2);

        item1.display();

    }
}