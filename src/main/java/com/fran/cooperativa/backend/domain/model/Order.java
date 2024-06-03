package com.fran.cooperativa.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data //nos hace los getter y setter
@AllArgsConstructor //hace constructor
public class Order {
    private Integer id;
    private LocalDateTime dateCreated;
    private List<OrderProduct> orderProducts;
    private OrderState orderState;
    private Integer userId;

    public Order() {
        orderProducts = new ArrayList<>();
    }
    public BigDecimal getTotalOrderPrice(){
        return this.orderProducts.stream().map( ordenProduct -> ordenProduct.getTotalItem() ).reduce(BigDecimal.ZERO,BigDecimal::add);
    }
}
