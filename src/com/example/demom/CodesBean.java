package com.example.demom;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Id;
import com.lidroid.xutils.db.annotation.Table;

@Table(name="t_codes")
public class CodesBean {

	@Id(column="id")
	public String id;

	//(出/入库)单号
	@Column(column="match_order")
	public String match_order;

	//类型(出库2/入库1/退货3/入库罐码11/出库罐码21/退货罐码31)
	@Column(column="code_type")
	public String code_type;

	//物流码
	@Column(column="code")
	public String code;

	//状态
	@Column(column="code_state")
	public String code_state;
	
	//经销商名
	@Column(column="agency_name")
	public String agency_name;
		
		//门店
		@Column(column="shop_name")
		public String shop_name;
		
		//產品名
				@Column(column="product_name")
				public String product_name;

	public String getProduct_name() {
					return product_name;
				}


				public void setProduct_name(String product_name) {
					this.product_name = product_name;
				}


	public String getAgency_name() {
			return agency_name;
		}


		public void setAgency_name(String agency_name) {
			this.agency_name = agency_name;
		}


		public String getShop_name() {
			return shop_name;
		}


		public void setShop_name(String shop_name) {
			this.shop_name = shop_name;
		}


	public String getId() {
		return id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getMatch_order() {
		return match_order;
	}
	
	
	public void setMatch_order(String match_order) {
		this.match_order = match_order;
	}
	
	
	public String getCode_type() {
		return code_type;
	}
	
	
	public void setCode_type(String code_type) {
		this.code_type = code_type;
	}
	
	
	public String getCode() {
		return code;
	}
	
	
	public void setCode(String code) {
		this.code = code;
	}
	
	
	public String getCode_state() {
		return code_state;
	}
	
	
	public void setCode_state(String code_state) {
		this.code_state = code_state;
	}
	

	@Override
	public String toString() {
		return "CodesBean{id="+id+","+"match_order='"+match_order+"',"+"code_type='"+code_type+"',"
				+"code='"+code+"',"+"product_name='"+product_name+"',"+"agency_name='"+agency_name+"',"+"shop_name='"+shop_name+"',"+"code_state='"+code_state+"'}";
	}
	
}
