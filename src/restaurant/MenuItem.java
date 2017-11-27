package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private Date dateCreated;

    public MenuItem(String name, double price, String description, String category){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateCreated = new Date();
    }

    public void printMenuItem(MenuItem item){
        System.out.println("Menu Item: " + item.getName() +
                "\nPrice: $" + item.getPrice() +
                "\nDescription: " + item.getDescription() +
                "\nCategory: " + item.getCategory() +
                "\nDate Created: " + item.getDateCreated());
    }

    public String getName(){
        return name;
    }

    private void setName(String aName){
        name = aName;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double aPrice){
        price = aPrice;
    }

    public String getDescription(){
        return description;
    }

    private void setDescription(String aDescription){
        description = aDescription;
    }

    public String getCategory(){
        return category;
    }

    private void setCategory(String aCategory){
        category = aCategory;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    private void setDateCreated(Date aDateCreated){
        dateCreated = aDateCreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem menuItem = (MenuItem) o;

        if (Double.compare(menuItem.price, price) != 0) return false;
        if (!name.equals(menuItem.name)) return false;
        if (!description.equals(menuItem.description)) return false;
        if (!category.equals(menuItem.category)) return false;
        return dateCreated.equals(menuItem.dateCreated);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + description.hashCode();
        result = 31 * result + category.hashCode();
        result = 31 * result + dateCreated.hashCode();
        return result;
    }
}
