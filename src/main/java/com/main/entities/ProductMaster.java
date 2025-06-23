package com.main.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer productId;
	String productCategoryId;
	String ProductName;
	String productDescription;
	String ProductImage;
	Double productPrice;
	Double productDiscount;
	Double productDiscountedPriceDouble;
	Double productWeightDouble;
	
}
