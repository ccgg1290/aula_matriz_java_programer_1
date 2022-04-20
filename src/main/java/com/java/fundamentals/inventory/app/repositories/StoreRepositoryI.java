package com.java.fundamentals.inventory.app.repositories;

import com.java.fundamentals.inventory.app.entities.Store;

/**
 *
 * @author capri
 */
public interface StoreRepositoryI {
    
    Store create(Store storeToCreate);
    public Store findById(short idStore);
    public Store[] findAll();
    public Store update(Store storeToUpdate);
    public void deleteId(short idStore);
    
}


