package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    public static Date dateUpdated;

    public Menu(Date dateUpdated){
        this.dateUpdated = new Date();
    }

    public static ArrayList<MenuItem> allItems = new ArrayList();

    public static ArrayList<MenuItem> addMenuItem (MenuItem newItem){
        allItems.add(newItem);
        dateUpdated = new Date();
        return allItems;
    }

    public ArrayList<MenuItem> removeMenuItem (MenuItem removeItem){
        for(MenuItem item : allItems){
            String name = item.getName();
            if(name.equals(removeItem)) {
                allItems.remove(item);
                break;
            }
        }
        return allItems;
    }

    public static void printMenu(ArrayList<MenuItem> listAll){
        System.out.println("Menu last updated: " + getDateUpdated() + "\n");
        for(MenuItem item : listAll){
            if(item.getDateCreated().after(getDateUpdated())){
                System.out.println("**New Item**");
            }
            System.out.println("Menu Item: " + item.getName() +
                    "\nPrice: $" + item.getPrice() +
                    "\nDescription: " + item.getDescription() +
                    "\nCategory: " + item.getCategory());
                    //"\nDate Created: " + item.getDateCreated());
        }
    }

    public static Date getDateUpdated(){
        return dateUpdated;
    }

    private void setDateUpdated(Date aDateUpdated){
        dateUpdated = aDateUpdated;
    }
}
