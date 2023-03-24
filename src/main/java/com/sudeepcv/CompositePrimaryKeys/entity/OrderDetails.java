package com.sudeepcv.CompositePrimaryKeys.entity;

import jakarta.persistence.*;

@Entity
@IdClass(OrderDetailsId.class)
@Table(name = "order_details")
public class OrderDetails {

    @Id
    @Column(name = "order_id")
    private Long orderId;
    @Id
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "quantity")
    private Integer quantity;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                '}';
    }
}
