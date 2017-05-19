package com.parcours.online.workshop.web.order;

import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.Datasource;
import com.parcours.online.workshop.entity.Order;
import com.parcours.online.workshop.entity.OrderStatus;

import javax.inject.Inject;
import java.util.UUID;

public class OrderBrowse extends AbstractLookup {

    @Inject
    private CollectionDatasource<Order, UUID> ordersDs;

    //private static final String ORDERS_DS = "ordersDs";

    public void onBtnNewStatusClick(Component source) {
       // Datasource orderDatasource = super.getDsContext().get(ORDERS_DS);
        Order selectedItem =  ordersDs.getItem();
        if (selectedItem != null) {
            selectedItem.setStatus(OrderStatus.NEW);
            ordersDs.commit();
        }
    }

    public void onBtnNewStatus1Click(Component source) {
        // Datasource orderDatasource = super.getDsContext().get(ORDERS_DS);
        Order selectedItem =  ordersDs.getItem();
        if (selectedItem != null) {
            selectedItem.setStatus(OrderStatus.IN_PROGRESS);
            ordersDs.commit();
        }
    }

    public void onBtnNewStatus2Click(Component source) {
        // Datasource orderDatasource = super.getDsContext().get(ORDERS_DS);
        Order selectedItem =  ordersDs.getItem();
        if (selectedItem != null) {
            selectedItem.setStatus(OrderStatus.READY);
            ordersDs.commit();
        }
    }


}

/*
public class OrderBrowse extends AbstractLookup {

    private static final String ORDERS_DS = "ordersDs";

    public void onBtnNewStatusClick(Component component) {
        Datasource orderDatasource = super.getDsContext().get(ORDERS_DS);
        Order selectedItem =  orderDatasource != null ? (Order)orderDatasource.getItem() : null;
        if (selectedItem != null) {
            selectedItem.setStatus(OrderStatus.NEW);
            orderDatasource.commit();
        }
    }
}*/