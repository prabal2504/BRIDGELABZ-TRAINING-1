package com.gla.Type_Inheritance;

class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(
                101,
                "18-March-2026",
                "TRK123456",
                "20-March-2026"
        );

        System.out.println("Order ID: " + order.orderId);
        System.out.println("Order Date: " + order.orderDate);
        System.out.println("Tracking Number: " + order.trackingNumber);
        System.out.println("Delivery Date: " + order.deliveryDate);
        System.out.println("Order Status: " + order.getOrderStatus());
    }
}
