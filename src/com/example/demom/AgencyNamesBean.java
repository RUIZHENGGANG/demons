package com.example.demom;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Id;
import com.lidroid.xutils.db.annotation.Table;

@Table(name = "t_agencynames")
public class AgencyNamesBean {

	@Id(column = "id")
	public String id;
	
	// 商店名称
	@Column(column = "shop_name")
	public String shop_name;
	
	// 商店id
	@Column(column = "shop_id")
	public String shop_id;
	


	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getShop_name() {
		return shop_name;
	}



	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}



	public String getShop_id() {
		return shop_id;
	}



	public void setShop_id(String shop_id) {
		this.shop_id = shop_id;
	}



	@Override
	public String toString() {

		return "BmCodesBean{id='" + id + "'," + "shop_name='"
				+ shop_name + "',"  +"shop_id='"
				+ shop_id +"'}";
	}
}
