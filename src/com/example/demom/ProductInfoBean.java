package com.example.demom;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Id;
import com.lidroid.xutils.db.annotation.Table;

@Table(name="t_products_info")
public class ProductInfoBean {
	
	@Id(column="id")
	public String id;
	
	//入库/出库单号
	@Column(column="ware_num")
	public String ware_num;
	
	//单据状态(0表示未上传，1表示已上传)
	@Column(column="ware_state")
	public String ware_state;
	
	//产品名称
	@Column(column="product_name")
	public String product_name;
	
	//批次
	@Column(column="product_batch")
	public String product_batch;
	
	//单据数量
	@Column(column="product_num")
	public String product_num;
	
	//已扫数量
	@Column(column="scaned_num")
	public String scaned_num;
	
	//仓库(出库/入库)
	@Column(column="product_house")
	public String product_house;
	
	//客户(出库/入库)
		@Column(column="costomer")
		public String costomer;
	

		//类型(出库(2)/入库(1))
		@Column(column="type")
		public String type;
		//提单号
		@Column(column="deliveryNote")
		public String deliveryNote;
		
	//产品id(出库/入库)
		@Column(column="ware_id")
		public String ware_id;
	
	public String getWare_id() {
			return ware_id;
		}

		public void setWare_id(String ware_id) {
			this.ware_id = ware_id;
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getCostomer() {
		return costomer;
	}

	public void setCostomer(String costomer) {
		this.costomer = costomer;
	}

	public String getWare_num() {
		return ware_num;
	}

	public void setWare_num(String ware_num) {
		this.ware_num = ware_num;
	}

	public String getWare_state() {
		return ware_state;
	}

	public void setWare_state(String ware_state) {
		this.ware_state = ware_state;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_batch() {
		return product_batch;
	}

	public void setProduct_batch(String product_batch) {
		this.product_batch = product_batch;
	}

	public String getProduct_num() {
		return product_num;
	}

	public void setProduct_num(String product_num) {
		this.product_num = product_num;
	}

	public String getScaned_num() {
		return scaned_num;
	}

	public void setScaned_num(String scaned_num) {
		this.scaned_num = scaned_num;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getProduct_house() {
		return product_house;
	}

	public void setProduct_house(String product_house) {
		this.product_house = product_house;
	}

	public String getDeliveryNote() {
		return deliveryNote;
	}
	
	public void setDeliveryNote(String deliveryNote) {
		this.deliveryNote = deliveryNote;
	}
	
	@Override
	public String toString() {
		return "ProductInfoBean{id='"+id+"',"+"ware_num='"+ware_num+"',"+"costomer='"+costomer+"',"+"ware_state='"+ware_state+"',"+"product_name='"+product_name+"',"
	+"product_batch='"+product_batch+"',"+"product_num='"+product_num+"',"
				+"scaned_num='"+scaned_num+"',"
				+"deliveryNote='"+deliveryNote+"',"+
	"type='"+type+"',"+"product_house='"+product_house+"',"+"ware_id='"+ware_id+"'}";
	}

	
}
