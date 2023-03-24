package com.sudeepcv.CompositePrimaryKeys.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "order_details")
public class OrderDetailsEmbedded {

    @EmbeddedId
    private OrderDetailsId id;
    @Column(name = "quantity")
    private Integer quantity;

    public OrderDetailsId getId() {
        return id;
    }

    public void setId(OrderDetailsId id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetailsEmbedded{" +
                "id=" + id +
                ", quantity=" + quantity +
                '}';
    }

    @Embeddable
    public static class OrderDetailsId implements Serializable {

        @Column(name = "order_id")
        private Long orderId;
        @Column(name = "product_id")
        private Long productId;

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


        @Override
        public String toString() {
            return "OrderDetailsId{" +
                    "orderId=" + orderId +
                    ", productId=" + productId +
                    '}';
        }
    }
}
