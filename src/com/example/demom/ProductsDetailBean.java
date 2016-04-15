package com.example.demom;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Id;
import com.lidroid.xutils.db.annotation.Table;

@Table(name="t_product_detail")
public class ProductsDetailBean {

	@Id(column="id")
	public String id;

	//(出/入库)单号
	@Column(column="ware_num")
	public String ware_num;

	//产品名称
	@Column(column="product_name")
	public String product_name;

	//物流码
	@Column(column="flow_num")
	public String flow_num;

	//类型(出库2(罐码:20)/入库1(罐码:10))
	@Column(column="product_type")
	public String product_type;

	//扫描时间
	@Column(column="scan_time")
	public String scan_time;

	//托盘号
	@Column(column="tray_num")
	public String tray_num;
	
	//托盘号
		@Column(column="product_batch")
		public String product_batch;
		
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWare_num() {
		return ware_num;
	}

	public void setWare_num(String ware_num) {
		this.ware_num = ware_num;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getFlow_num() {
		return flow_num;
	}

	public void setFlow_num(String flow_num) {
		this.flow_num = flow_num;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	
	public String getScan_time() {
		return scan_time;
	}

	public void setScan_time(String scan_time) {
		this.scan_time = scan_time;
	}
	public String getTray_num() {
		return tray_num;
	}

	public void setTray_num(String tray_num) {
		this.tray_num = tray_num;
	}
	
	public String getProduct_batch() {
		return product_batch;
	}

	public void setProduct_batch(String product_batch) {
		this.product_batch = product_batch;
	}
	@Override
	public String toString() {
		return "ProductsDetailBean{id="+id+","+"ware_num='"+ware_num+"',"+"product_name='"+product_name+"',"
				+"flow_num='"+flow_num+"',"+"product_type='"+product_type+"',"+"scan_time='"+scan_time+"',"+"product_batch='"+product_batch+"',"+"tray_num='"+tray_num+"'}";
	}
	
}
