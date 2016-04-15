package com.example.demom;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Id;
import com.lidroid.xutils.db.annotation.Table;

@Table(name = "t_products")
public class ProductDataBean {

	@Id(column = "id")
	public String id;

	// 产品名称
	@Column(column = "product_name")
	public String product_name;

	// 产品编号
	@Column(column = "product_code")
	public String product_code;

	// 产品规格
	@Column(column = "specMode")
	public String specMode;

	// 产品单位s
	@Column(column = "count_unit")
	public String count_unit;

	// 三位产品编号
	@Column(column = "lcode")
	public String lcode;

	// 产品比例
	@Column(column = "product_ratio")
	public String product_ratio;
	
	//商品码
	@Column(column = "goods_code")
	public String goods_code;
	

	public String getGoods_code() {
		return goods_code;
	}

	public void setGoods_code(String goods_code) {
		this.goods_code = goods_code;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getLcode() {
		return lcode;
	}

	public void setLcode(String lcode) {
		this.lcode = lcode;
	}

	public String getProduct_ratio() {
		return product_ratio;
	}
	public String getProduct_code() {
		return product_code;
	}
	
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	
	public String getSpecMode() {
		return specMode;
	}
	
	public void setSpecMode(String specMode) {
		this.specMode = specMode;
	}
	
	public String getCount_unit() {
		return count_unit;
	}
	
	public void setCount_unit(String count_unit) {
		this.count_unit = count_unit;
	}

	public void setProduct_ratio(String product_ratio) {
		this.product_ratio = product_ratio;
	}

	@Override
	public String toString() {
		return "ProductDataBean{id='" + id + "'," + "product_name='"
				+ product_name + "'," +"product_code='"
				+ product_code + "'," +"specMode='"
				+ specMode + "',"+ "count_unit='"
				+ count_unit + "'," + "lcode='" + lcode + "',"
				 + "goods_code='" + goods_code + "',"
				+ "product_ratio='" + product_ratio + "'}";
	}
}
