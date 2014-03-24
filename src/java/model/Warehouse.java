/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author waisk
 */
public class Warehouse {
    public static final int MIN_THRESHOLD_TRIGGER = 20;
    public static final int DEFAULT_SHIP_QUANTITY = 10;
    private String name;
    private String zip;
    private Map<String, Integer> inventory;
    
    private static Warehouse instance;
    protected Warehouse() {}
    
    public static Warehouse getInstance(){
        if(instance == null)
        {
            Warehouse ins = new Warehouse();
			ins.name = "Losangeles Warehouse";
			ins.zip = "90001";
			ins.inventory = new HashMap<String, Integer>();
			ins.inventory.put("miphone", 0);
			ins.inventory.put("mipod", 0);
			ins.inventory.put("mibook", 0);
			ins.inventory.put("mibookpro", 0);
			ins.inventory.put("mibookair", 0);
			ins.inventory.put("mipad", 0);

			instance = ins;
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Map<String,Integer> getInventory() {
        return inventory;
    }

    public void setInventory(Map<String,Integer> inventory) {
        this.inventory = inventory;
    }
    
}
