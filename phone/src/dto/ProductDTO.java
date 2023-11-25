package dto;

import java.util.Objects;

public class ProductDTO {
	private int productId;
	private String productName;
	private String categoryName;
	private double purchasePrice;
	private double sellingPrice;
	private int quantity;
	private String imgURL;
	private String description;
	
	public ProductDTO() {
		super();
	}

	public ProductDTO(int productId, String productName, String categoryName, double purchasePrice,
			double sellingPrice, int quantity, String imgURL, String description) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.categoryName = categoryName;
		this.purchasePrice = purchasePrice;
		this.sellingPrice = sellingPrice;
		this.quantity = quantity;
		this.imgURL = imgURL;
		this.description = description;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", productName=" + productName + ", categoryName=" + categoryName
				+ ", purchasePrice=" + purchasePrice + ", sellingPrice=" + sellingPrice + ", quantity=" + quantity
				+ ", imgURL=" + imgURL + ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoryName, description, imgURL, productId, productName, purchasePrice, quantity,
				sellingPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		return Objects.equals(categoryName, other.categoryName) && Objects.equals(description, other.description)
				&& Objects.equals(imgURL, other.imgURL) && productId == other.productId
				&& Objects.equals(productName, other.productName) && Objects.equals(purchasePrice, other.purchasePrice)
				&& Objects.equals(quantity, other.quantity) && Objects.equals(sellingPrice, other.sellingPrice);
	}


	
	
	
}
