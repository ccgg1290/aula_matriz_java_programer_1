package com.java.fundamentals.inventory.app.repositories.impl;

import com.java.fundamentals.inventory.app.entities.Product;
import com.java.fundamentals.inventory.app.entities.Store;
import com.java.fundamentals.inventory.app.repositories.StoreRepositoryI;

/**
 *
 * @author capri
 */
public class StoreRepositoryImpl implements StoreRepositoryI {

    private Store[] stores = {new Store((short)1,"tienda1","calle1"),
                              new Store((short)2,"tienda2","calle2"),
                              new Store((short)3,"tienda3","calle3")};    
    @Override
    public Store findById(short idStore) {
        Store foundStore = null;

        for (Store storeToIterate : stores) {
            if (idStore == storeToIterate.getId()) {
                foundStore = storeToIterate;
                break;
            }
        }

        return foundStore;
    }

    @Override
    public Store[] findAll() {
        return stores;
    }

    @Override
    public Store update(Store storeToUpdate) {
        Store foundStore = findById(storeToUpdate.getId());

        foundStore.setName(storeToUpdate.getName());
        foundStore.setAddress(storeToUpdate.getAddress());
        foundStore.setCompany(storeToUpdate.getCompany());

        return foundStore;
    }

    @Override
    public void deleteId(short idStore) {
        for (int i=0;i<stores.length;i++) {
            if (idStore == stores[i].getId()) {
                stores[i] = null;
                break;
            }                     
        }       
    }

    @Override
    public Store create(Store storeToCreate) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
