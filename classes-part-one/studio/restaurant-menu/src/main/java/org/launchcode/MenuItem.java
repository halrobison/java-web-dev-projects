package org.launchcode;

import java.util.Date;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private Date dateAdded;

    public MenuItem(String name, double price, String description, String category, Date dateAdded) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;

        Date today = new Date();
//
//        if (dayDifferenceForTwoDates(today, dateAdded)) >= 30) {
//            this.isNew = true;
//        } else {
//            this.isNew = false;
//        }

    }
    private int dayDifferenceForTwoDates(Date d1, Date d2) {
        int dayDifference = (int)((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
        return dayDifference;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
