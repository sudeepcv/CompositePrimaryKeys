package com.sudeepcv.CompositePrimaryKeys.repository;

import com.sudeepcv.CompositePrimaryKeys.entity.OrderDetailsEmbedded;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsEmbeddedRepository extends JpaRepository<OrderDetailsEmbedded, OrderDetailsEmbedded.OrderDetailsId> {
}
