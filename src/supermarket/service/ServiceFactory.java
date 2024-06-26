/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.service;

import supermarket.service.custom.Impl.CategoryServiceImpl;
import supermarket.service.custom.Impl.CustomerServiceImpl;
import supermarket.service.custom.Impl.ItemServiceImpl;
import supermarket.service.custom.Impl.OrderDetailsServiceImpl;
import supermarket.service.custom.Impl.OrderServiceImpl;

/**
 *
 * @author Sanjaya Prasad
 */
public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }

    public SuperService getService(ServiceType serviceType) {
        switch (serviceType) {
            case CUSTOMER:
                return new CustomerServiceImpl();
            case ITEM_CATEGORY:
                return new CategoryServiceImpl();
            case ITEM:
                return new ItemServiceImpl();
            case ORDERS:
                return new OrderServiceImpl();
            case ORDER_DETAIL:
                return new OrderDetailsServiceImpl();
            default:
                return null;
        }
    }

    public enum ServiceType {
        CUSTOMER, ITEM_CATEGORY, ITEM, ORDERS, ORDER_DETAIL
    }
}
