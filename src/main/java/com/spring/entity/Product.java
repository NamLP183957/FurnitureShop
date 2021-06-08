package com.spring.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private String type;
	private Long price;
	private Long numberInWare;
	private Long numberOfSell;
	@Column(name = "dateInWare", columnDefinition = "DATETIME")
	private Date dateInWare;
	private String style;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Image> images;
	public Product() {
		
	}

	public Product(String name, String description, String type, Long price, Long numberInWare, Long numberOfSell, String style,
			List<Image> images, Date dateInWare) {
		super();
		this.name = name;
		this.description = description;
		this.type = type;
		this.price = price;
		this.numberInWare = numberInWare;
		this.numberOfSell = numberOfSell;
		this.style = style;
		this.images = images;
		this.dateInWare = dateInWare;
	}

	public Product(String name, String description, String type, Long price, Long numberInWare, Long numberOfSell,
			String style, Date dateInWare) {
		super();
		this.name = name;
		this.description = description;
		this.type = type;
		this.price = price;
		this.numberInWare = numberInWare;
		this.numberOfSell = numberOfSell;
		this.style = style;
		this.dateInWare = dateInWare;
	}

	public int getId() {
		return id;
	}
	

	public Date getDateInWare() {
		return dateInWare;
	}

	public void setDateInWare(Date dateInWare) {
		this.dateInWare = dateInWare;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getNumberInWare() {
		return numberInWare;
	}

	public void setNumberInWare(Long numberInWare) {
		this.numberInWare = numberInWare;
	}

	public Long getNumberOfSell() {
		return numberOfSell;
	}

	public void setNumberOfSell(Long numberOfSell) {
		this.numberOfSell = numberOfSell;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	
	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addImage(Image image) {
		this.images.add(image);
		image.setProduct(this);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", type=" + type + ", price="
				+ price + ", numberInWare=" + numberInWare + ", numberOfSell=" + numberOfSell + ", style=" + style
				+ "]";
	}
	
}
