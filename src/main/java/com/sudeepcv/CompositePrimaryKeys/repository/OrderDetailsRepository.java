package com.sudeepcv.CompositePrimaryKeys.repository;

import com.sudeepcv.CompositePrimaryKeys.entity.OrderDetails;
import com.sudeepcv.CompositePrimaryKeys.entity.OrderDetailsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, OrderDetailsId> {

    // additional methods can be defined here

}