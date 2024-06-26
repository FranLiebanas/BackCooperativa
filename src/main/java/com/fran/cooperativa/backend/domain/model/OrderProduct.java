package com.fran.cooperativa.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data //nos hace los getter y setter
@AllArgsConstructor //hace constructor
@NoArgsConstructor //contructor vacio
public class OrderProduct {
    private Integer id;
    private BigDecimal quantity;
    private BigDecimal price;
    private Integer productId;

    public BigDecimal getTotalItem(){
        return this.price.multiply(quantity);
    }

}