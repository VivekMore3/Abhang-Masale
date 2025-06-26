package com.main.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	Integer productId;
	@Column
	String productCategoryId;
	@Column
	String ProductName;
	@Column
	String productDescription;
	@Column
	String ProductImage;
	@Column
	Double productPrice;
	@Column
	Double productDiscount;
	@Column
	Double productDiscountedPriceDouble;
	@Column
	Double productWeightDouble;
	public ProductMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductMaster(Integer productId, String productCategoryId, String productName, String productDescription,
			String productImage, Double productPrice, Double productDiscount, Double productDiscountedPriceDouble,
			Double productWeightDouble) {
		super();
		this.productId = productId;
		this.productCategoryId = productCategoryId;
		ProductName = productName;
		this.productDescription = productDescription;
		ProductImage = productImage;
		this.productPrice = productPrice;
		this.productDiscount = productDiscount;
		this.productDiscountedPriceDouble = productDiscountedPriceDouble;
		this.productWeightDouble = productWeightDouble;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(String productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductImage() {
		return ProductImage;
	}
	public void setProductImage(String productImage) {
		ProductImage = productImage;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public Double getProductDiscount() {
		return productDiscount;
	}
	public void setProductDiscount(Double productDiscount) {
		this.productDiscount = productDiscount;
	}
	public Double getProductDiscountedPriceDouble() {
		return productDiscountedPriceDouble;
	}
	public void setProductDiscountedPriceDouble(Double productDiscountedPriceDouble) {
		this.productDiscountedPriceDouble = productDiscountedPriceDouble;
	}
	public Double getProductWeightDouble() {
		return productWeightDouble;
	}
	public void setProductWeightDouble(Double productWeightDouble) {
		this.productWeightDouble = productWeightDouble;
	}
	@Override
	public String toString() {
		return "ProductMaster [productId=" + productId + ", productCategoryId=" + productCategoryId + ", ProductName="
				+ ProductName + ", productDescription=" + productDescription + ", ProductImage=" + ProductImage
				+ ", productPrice=" + productPrice + ", productDiscount=" + productDiscount
				+ ", productDiscountedPriceDouble=" + productDiscountedPriceDouble + ", productWeightDouble="
				+ productWeightDouble + "]";
	}
	
	
	
}
