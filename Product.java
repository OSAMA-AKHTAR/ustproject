package com.ust.pms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
@ApiModel(description="We have used Product model class in our app")
public class Product {
	
	@ApiModelProperty(position=0, notes="product id is unique and pk")
	@Id	
	private @NonNull int productId;
	
	@ApiModelProperty(position=1, notes="product name is the name of the product", value="Lakme")
	private @NonNull String productName;
	
	@ApiModelProperty(position=2, notes="stock availability")
	private @NonNull int quantityOnHand;
	
	@ApiModelProperty(position=3, notes="cost of the product", value="100")
	private @NonNull int price;
	
}
