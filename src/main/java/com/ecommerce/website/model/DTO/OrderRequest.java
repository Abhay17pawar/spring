package com.ecommerce.website.model.DTO;

import java.util.List;

public record OrderRequest (
        String customerName,
        String email,
        List<OrderItemRequest> items
) {}
