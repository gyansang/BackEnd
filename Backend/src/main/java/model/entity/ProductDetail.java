package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_Detail")
public class ProductDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Product_Id")
	private int pId;
	@Column(name="Product_Name")
	private String pName;
	@Column(name="Product_Cost")
	private int pCost;
	
	public ProductDetail()
	{
		
	}

	public ProductDetail(String pName, int pCost) {
		this.pName = pName;
		this.pCost = pCost;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpCost() {
		return pCost;
	}

	public void setpCost(int pCost) {
		this.pCost = pCost;
	}
	
}
