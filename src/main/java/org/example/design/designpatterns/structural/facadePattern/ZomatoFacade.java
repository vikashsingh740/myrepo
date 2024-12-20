package org.example.design.designpatterns.structural.facadePattern;

public class ZomatoFacade {

    Restaurant restaurant;
    DeliveryTeam deliveryTeam;
    DeliveryBoy deliveryBoy;

    public ZomatoFacade(Restaurant restaurant, DeliveryTeam deliveryTeam, DeliveryBoy deliveryBoy) {
        this.restaurant = restaurant;
        this.deliveryTeam = deliveryTeam;
        this.deliveryBoy = deliveryBoy;
    }

    public void placeOrder() {
        restaurant.prepareOrder();
        deliveryTeam.assignDeliveryBoy();
        deliveryBoy.pickOrder();
        deliveryBoy.deliverOrder();
    }
}
