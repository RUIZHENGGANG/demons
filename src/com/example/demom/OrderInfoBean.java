package com.example.demom;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Id;
import com.lidroid.xutils.db.annotation.Table;

@Table(name="t_inhouse_order")
public class OrderInfoBean {
	
	@Id(column="id")
	public String id;
	
	//入库/出库单号
	@Column(column="order_num")
	public String order_num;
	
	//单据状态(0表示未上传，1表示已上传)
	@Column(column="order_state")
	public String order_state;
	
	@Column(column="product_name")
	public String product_name;

	//单据类型(1入库、2出库、3退货)
	@Column(column="type")
	public String type;
	
	//机构
	@Column(column="organization")
	public String organization;
	

	
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

	public String getOrder_num() {
		return order_num;
	}



	public void setOrder_num(String order_num) {
		this.order_num = order_num;
	}



	public String getOrder_state() {
		return order_state;
	}



	public void setOrder_state(String order_state) {
		this.order_state = order_state;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getOrganization() {
		return organization;
	}



	public void setOrganization(String organization) {
		this.organization = organization;
	}



	@Override
	public String toString() {
		return "ProductInfoBean{id='"+id+"',"+"order_num='"+order_num+"',"+"product_name='"+product_name+"',"+"order_state='"+order_state+"',"+"type='"+type+"',"
	+"organization='"+organization+"'}";
	}

	
}
