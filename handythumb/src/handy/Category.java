package handy;

import java.io.Serializable;

public class Category implements Serializable{
	private static final long serialVersionUID =1L;
	private  int id;
	private String categoryName;
	private String categoryID;
	private String categoryInsertDate;
	private String categoryUpdatedDate;
	private String categoryPictureName;
	
	public Category() {}
	
	public Category(int id, String categoryName, String categoryID, String categoryInsertDate, String categoryUpdatedDate, String categoryPictureName) {
		this.id = id;
		this.categoryName = categoryName;
		this.categoryID = categoryID;
		this.categoryInsertDate = categoryInsertDate;
		this.categoryUpdatedDate = categoryUpdatedDate;
		this.categoryPictureName = categoryPictureName;
	}
	
	public int getID() {
		return id;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	
	public String getCategoryID() {
		return categoryID;
	}
	
	public String getCategoryInsertDate() {
		return categoryInsertDate;
	}
	
	public String getCategoryUpdatedDate() {
		return categoryUpdatedDate;
	}
	
	public String getCategoryPictureName() {
		return categoryPictureName;
	}
	
	
	
	public void setID(int id) {
		this.id = id;
	}
	
	public void setCategoryName(String CategoryName) {
		this.categoryName = CategoryName;
		
	}
	
	public void setCategoryID(String CategoryID) {
		this.categoryID = CategoryID;
	}
	
	public void setCategoryInsertDate(String CategoryInsertDate) {
		this.categoryInsertDate = CategoryInsertDate;
	}
	
	public void setCategoryUpdateDate(String CategoryUpdateDate) {
		this.categoryUpdatedDate = CategoryUpdateDate;
	}
	
	public void setCategoryPictureName(String CategoryPictureName) {
		this.categoryPictureName = CategoryPictureName;
	}

}
