package com.java.fundamentals.inventory.app.entities;

/**
 *
 * @author capri
 */

// lombot.jar 
public class Store {
    
    private short id;
    private String name;
    private String address;
    private Company company;

    
    public Store(short id, String name, String address, Company company) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.company = company;
    }
    
    

    public Store(short id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        
    }
    
    
    

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Store{" + "id=" + id + ", name=" + name + ", address=" + address + ", company=" + company + '}';
    }
    
}
