package com.java.fundamentals.inventory.app;

import com.java.fundamentals.inventory.app.entities.Store;
import com.java.fundamentals.inventory.app.repositories.StoreRepositoryI;
import com.java.fundamentals.inventory.app.repositories.impl.StoreRepositoryImpl;
import com.java.fundamentals.inventory.app.services.StoreServiceI;
import com.java.fundamentals.inventory.app.services.impl.StoreServiceImpl;
import java.util.Arrays;

/**
 *
 * @author capri
 */
public class InventoryApp extends Object {

    private StoreServiceI storeServiceI;

    public InventoryApp(StoreServiceI storeServiceI) {
        this.storeServiceI = storeServiceI;

    }

    public static void main(String[] args) {

        String name = "Bob";
        String msg;
        int num = 3;

        //msg = name + " wrote " + num " Java programs.";
        msg = name + " wrote " + 3 + " Java programs.";
        //msg = name + " wrote " + (2 + 1) + " Java programs.";
        //msg = name + " wrote " + 2 + 1 + " Java programs.";
        
        System.out.println(msg);

        StoreRepositoryI storeRepository = new StoreRepositoryImpl();
        StoreServiceI storeService = new StoreServiceImpl(storeRepository);

        InventoryApp inventoryApp = new InventoryApp(storeService);

        if ("findAllStores".equals(args[0])) {//PENDIENTE POR ANALIZAR
            inventoryApp.findAllStores();
        } else if ("findStoreById".equals(args[0])) {//PENDIENTE POR ANALIZAR
            inventoryApp.findStoreById();
        } else if ("updateStore".equals(args[0])) {
            inventoryApp.updateStore();
        } else if ("deleteStore".equals(args[0])) {
            inventoryApp.deleteStore();
        } else {
            System.out.println("No se reconoció ninguna operación!!");
        }

    }

    public void findAllStores() {
        Store[] foundStores = this.storeServiceI.findAll();

        for (Store foundStore : foundStores) {
            System.out.println("La tienda encontrada es: " + foundStore);
        }

    }

    public void findStoreById() {
        Store foundStore = this.storeServiceI.findById((short) 2);
        System.out.println("La información de la tienda es: " + foundStore.toString());

    }

    public void updateStore() {

        Store storeToUpdate = new Store((short) 4,"Tienda 1modificada","claae1");
        
        Store updatedStore = this.storeServiceI.update(storeToUpdate);
        System.out.println("la tienda modificada es :" + updatedStore);

    }

    public void deleteStore() {
        this.storeServiceI.deleteId((short) 1);
        System.out.println("La Tienda fue eliminada: ");
    }

}
