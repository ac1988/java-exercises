package restaurant;

import java.util.Date;

import static restaurant.Menu.allItems;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem newItem = new MenuItem("Chicken", 5, "crispy", "Main Course");
        Menu.addMenuItem(newItem);

        Menu.printMenu(allItems);

    }
}
