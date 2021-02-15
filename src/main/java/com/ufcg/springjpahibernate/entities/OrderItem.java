package com.ufcg.springjpahibernate.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ufcg.springjpahibernate.entities.pk.OrderItemPk;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private OrderItemPk id = new OrderItemPk();
	private Integer quantity;
	private Double price; 
	
	public OrderItem() {}
	
	public OrderItem(Order order, Product product, Integer quantity, Double price) {
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}
	
	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		this.id.setOrder(order);
	}
	
	public Product getProduct() {
		return id.getProduct();
	}
	
	public void setOrder(Product product) {
		this.id.setProduct(product);
	}
	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getSubTotal() {
		return this.quantity * this.price;
	}
}
