package com.Siga.ecomerce_app.Entity;

import java.math.BigDecimal;
import java.sql.Date;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="product")
@Data
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	@Column(name ="id")
 private Long id;
	@ManyToOne
	@JoinColumn(name="category_id")
	private ProdcutCategory category;
	@Column(name="sku")
 private String sku;
	@Column(name= "name")
 private String name;
	@Column(name =" disciption")
 private String disciption;
	@Column(name="unit_price")
 private BigDecimal unitPrice;
	@Column(name ="img_url")
 private String imgUrl;
	@Column(name ="active")
 private Boolean active;
	@Column(name ="unit_stock")
 private int unitStock;
	@Column(name ="date_created")
 private Date dateCreated;
	@Column(name ="last_update")
@UpdateTimestamp
 private Date lastUpdate;

}
