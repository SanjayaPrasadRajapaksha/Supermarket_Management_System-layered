/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.dao;

import supermarket.dao.custom.impl.CategoryDaoImpl;
import supermarket.dao.custom.impl.CustomerDaoImpl;
import supermarket.dao.custom.impl.ItemDaoImpl;
import supermarket.dao.custom.impl.OrderDaoImpl;
import supermarket.dao.custom.impl.OrderDetailsDaoImpl;

/**
 *
 * @author Sanjaya Prasad
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    public DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoType daoType) {
        switch (daoType) {

            case CUSTOMER:
                return new CustomerDaoImpl();
            case ITEM_CATEGORY:
                return new CategoryDaoImpl();
            case ITEM:
                return new ItemDaoImpl();
            case ORDERS:
                return new OrderDaoImpl();
            case ORDER_DETAIL:
                return new OrderDetailsDaoImpl();
            default:
                return null;
        }
    }

    public enum DaoType {
        CUSTOMER, ITEM_CATEGORY, ITEM, ORDERS, ORDER_DETAIL;
    }
}
