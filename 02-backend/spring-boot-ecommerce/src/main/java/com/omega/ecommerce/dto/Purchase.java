package com.omega.ecommerce.dto;

import com.omega.ecommerce.entity.Address;
import com.omega.ecommerce.entity.Customer;
import com.omega.ecommerce.entity.Order;
import com.omega.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;
}
