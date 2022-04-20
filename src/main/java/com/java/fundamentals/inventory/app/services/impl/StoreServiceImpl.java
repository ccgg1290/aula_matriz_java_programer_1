package com.java.fundamentals.inventory.app.services.impl;

import com.java.fundamentals.inventory.app.entities.Store;
import com.java.fundamentals.inventory.app.repositories.StoreRepositoryI;
import com.java.fundamentals.inventory.app.repositories.impl.StoreRepositoryImpl;
import com.java.fundamentals.inventory.app.services.StoreServiceI;

/**
 *
 * @author capri
 */
public class StoreServiceImpl implements StoreServiceI {

    private StoreRepositoryI storeRepository;
    private short storeToUpdate;

    public StoreServiceImpl(StoreRepositoryI storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    public Store[] findAll() {
        return storeRepository.findAll();
    }

    @Override
    public Store findById(short storeId) {
        return storeRepository.findById(storeId);
    }

    @Override
    public Store update(Store storeToUpdate) {
        return storeRepository.update(storeToUpdate);
    }
    
    public Store deleteId(Store storeToUpdate) {
        return storeRepository.update(storeToUpdate);
    }

    @Override
    public void deleteId(short storeId) {
        storeRepository.deleteId(storeToUpdate);
    }

}
