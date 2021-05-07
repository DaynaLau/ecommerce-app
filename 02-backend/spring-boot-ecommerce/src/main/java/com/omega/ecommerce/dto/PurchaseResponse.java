package com.omega.ecommerce.dto;

import lombok.Data;

@Data
public class PurchaseResponse {

    // use this class to send back a Java object as JSON

    private final String orderTrackingNumber;

}
