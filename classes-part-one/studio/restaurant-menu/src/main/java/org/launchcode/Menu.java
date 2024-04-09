package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String restaurantName;
    private String restaurantDescription;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public Menu(String restaurantName, String restaurantDescription, ArrayList<MenuItem> menuItems, Date lastUpdated) {
        this.restaurantName = restaurantName;
        this.restaurantDescription = restaurantDescription;
        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;
    }

    public void addMenuItem(MenuItem newItem) {
        menuItems.add(newItem);
    }

    public void removeMenuItem(int indexOfMenuItem) {
        menuItems.remove(indexOfMenuItem);
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantDescription() {
        return restaurantDescription;
    }

    public void setRestaurantDescription(String restaurantDescription) {
        this.restaurantDescription = restaurantDescription;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
