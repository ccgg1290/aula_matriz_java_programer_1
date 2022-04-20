package com.java.fundamentals.inventory.app.services;

import com.java.fundamentals.inventory.app.entities.Store;

/**
 *
 * @author capri
 */
public interface StoreServiceI {

    Store[] findAll();

    Store findById(short storeId);

    public Store update(Store storeToUpdate);

    public void deleteId(short storeId);

}
