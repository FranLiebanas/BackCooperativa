package com.fran.cooperativa.backend.infrastructure.adapter;

import com.fran.cooperativa.backend.domain.model.Order;
import com.fran.cooperativa.backend.domain.model.OrderState;
import com.fran.cooperativa.backend.infrastructure.entity.OrderEntity;
import com.fran.cooperativa.backend.infrastructure.entity.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IOrderCrudRepository extends CrudRepository<OrderEntity, Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE OrderEntity o SET o.orderState = :state WHERE o.id = :id")
    void updateStateById(Integer id, OrderState state);

    Iterable<OrderEntity> findByUserEntity(UserEntity userEntity);
}
