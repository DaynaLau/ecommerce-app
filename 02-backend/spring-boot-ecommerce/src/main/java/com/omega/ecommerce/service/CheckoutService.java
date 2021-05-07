package com.omega.ecommerce.service;

import com.omega.ecommerce.dto.Purchase;
import com.omega.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

}
