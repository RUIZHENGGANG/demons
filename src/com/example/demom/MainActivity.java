package com.example.demom;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import com.lidroid.xutils.DbUtils;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.exception.DbException;
import com.lidroid.xutils.http.client.multipart.content.StringBody;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	
	@ViewInject(R.id.www)
	private Button dssds;
	public String textName = "dcdata.txt";
	public String dbName = "wms.db";
	public String dbaName = "AgencyInfos.db";
	private String Path = "/data/data/com.example.demom/databases/";
	static SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
	public Context context;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context = MainActivity.this;
		ViewUtils.inject(this);
		
		boolean check = checkDb();
		if (check) {
		} else {
			// 不存在就把assets里的数据库写入手机
			try {
				copyDataBase();

			} catch (IOException e) {
				throw new Error("Error copying database");
			}
		}
		
	}
	@OnClick(R.id.www)
	public void OnClick(View v)
	{
		DbUtils dbutils = DbUtils.create(MainActivity.this, "wms.db");
//		ReadTxtFile(dbutils);
		
		ReadwmsTxtFile(dbutils);
		
//		for (int i = 0; i < 2300; i++) {
//			// 存入数据库中
//			ProductsDetailBean productsDetailBean = new ProductsDetailBean();
//			productsDetailBean.setId(UUID.randomUUID().toString());
//			productsDetailBean.setWare_num("TT201512160003");
//			productsDetailBean.setProduct_name("A2白金三段");
//			
//			productsDetailBean.setProduct_type("2");
//			productsDetailBean.setProduct_batch(" ");
//			productsDetailBean.setTray_num("0001");
//			productsDetailBean.setScan_time(format.format(new Date()));
//			try {
//				dbutils.save(productsDetailBean);
//			} catch (DbException e) {
//				e.printStackTrace();
//			}
//			
//		}
		
	}
	
	 public void  ReadwmsTxtFile(DbUtils dbutils)
     {
            //打开文件
//            File file = new File(path);
             //如果path是传递过来的参数，可以做一个非目录的判断
                 try {
                	 for (int i = 0; i < 1; i++) {
                		 ProductInfoBean info = new ProductInfoBean();
                		 info.setId(UUID.randomUUID().toString());
                		 info.setWare_num("TT201604080040");
                		 info.setProduct_batch("aa");
                		 info.setProduct_house("A2默认仓库");
                		 info.setProduct_name("A2白金三段");
                		 info.setProduct_num("1000");
                		 info.setScaned_num("1000");
                		 info.setType("2");
                		 info.setWare_id("2646");
                		 info.setWare_state("0");
                		 info.setDeliveryNote("A2默认仓库");
                		 info.setCostomer("adafa");
                		 dbutils.save(info);
					}
                	 InputStream instream = getAssets().open(textName);
                     if (instream != null) 
                     {
                         InputStreamReader inputreader = new InputStreamReader(instream);
                         BufferedReader buffreader = new BufferedReader(inputreader);
                         String line;
                        while (( line = buffreader.readLine()) != null) {
                        	try {
                        		ProductsDetailBean productsDetailBean = new ProductsDetailBean();
                    			productsDetailBean.setId(UUID.randomUUID().toString());
                    			productsDetailBean.setWare_num("TT201604080040");
                    			productsDetailBean.setProduct_name("A2白金三段");
                    			productsDetailBean.setProduct_type("2");
                    			productsDetailBean.setFlow_num(line);
                    			productsDetailBean.setProduct_batch("201604081");
                    			productsDetailBean.setTray_num("0001");
                    			productsDetailBean.setScan_time(format.format(new Date()));
                    				dbutils.save(productsDetailBean);
                			} catch (DbException e) {
                				Log.e("rzg", "error", e);
                			}
                			
                         }                
                         instream.close();
                     }
                 }
                 catch (Exception e) 
                 {
                 }
     }
	
	
	
	  public void  ReadTxtFile(DbUtils dbutils)
	     {
	            //打开文件
//	            File file = new File(path);
	             //如果path是传递过来的参数，可以做一个非目录的判断
	                 try {
	                	 for (int i = 0; i < 3; i++) {
	                		 OrderInfoBean info = new OrderInfoBean();
	 	         			info.setId(UUID.randomUUID().toString());
	 	         			info.setOrder_num("TT201601060999");
	 	         			info.setOrder_state("0");
	 	         			info.setOrganization("(DKSH)青岛宏瑞源商贸有限公司");
	 	         			info.setType("2");
	 	         			if(i==0)
	 	         			{
	 	         				info.setProduct_name("A2白金一段");
	 	         			}else if(i==1)
	 	         			{
	 	         				info.setProduct_name("A2白金二段");
	 	         			}else
	 	         			{
	 	         				info.setProduct_name("A2白金三段");
	 	         			}
	 	         			
	 	         			dbutils.save(info);
						}
	                	 
	                	 InputStream instream = getAssets().open(textName);
	                     if (instream != null) 
	                     {
	                         InputStreamReader inputreader = new InputStreamReader(instream);
	                         BufferedReader buffreader = new BufferedReader(inputreader);
	                         String line;
	                        while (( line = buffreader.readLine()) != null) {
	                        	try {
	                        	CodesBean productsDetailBean = new CodesBean();
	                			productsDetailBean.setId(UUID.randomUUID().toString());
	                			productsDetailBean.setAgency_name("dksh1");
	                			productsDetailBean.setCode(line);
	                			productsDetailBean.setCode_state("0");
	                			if(line.trim().length()==16)
	                			{
	                				productsDetailBean.setCode_type("21");
	                			}else
	                			{
	                				productsDetailBean.setCode_type("2");
	                			}
	                			
	                			productsDetailBean.setMatch_order("TT201601060999");
	                			String a  = line.substring(0, 3);
	                			if(a.equals("001"))
	                			{
	                				productsDetailBean.setProduct_name("A2白金一段");
	                			}else if(a.equals("002"))
	                			{
	                				productsDetailBean.setProduct_name("A2白金二段");
	                			}else
	                			{
	                				productsDetailBean.setProduct_name("A2白金三段");
	                			}
	                			
	                			productsDetailBean.setShop_name("(DKSH)青岛宏瑞源商贸有限公司");
	                			dbutils.save(productsDetailBean);
	                			} catch (DbException e) {
	                				Log.e("rzg", "error", e);
	                			}
	                         }                
	                         instream.close();
	                     }
	                 }
	                 catch (Exception e) 
	                 {
	                 }
	     }
	/**
	 * 复制数据库到手机指定文件夹下
	 * 
	 * @throws IOException
	 */
	public void copyDataBase() throws IOException {
		String databaseFilenames = Path + dbName;
		File dir = new File(Path);
		if (!dir.exists()) {// 判断文件夹是否存在，不存在就新建一个
			dir.mkdir();
		}
		FileOutputStream os = null;
		try {
			os = new FileOutputStream(databaseFilenames);// 得到数据库文件的写入流
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		InputStream is = MainActivity.this.getAssets().open(dbName);// 得到数据库文件的数据流
		byte[] buffer = new byte[8192];
		int count = 0;
		try {
			while ((count = is.read(buffer)) > 0) {
				os.write(buffer, 0, count);
				os.flush();
			}
		} catch (IOException e) {

		}
		try {
			is.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	private boolean checkDb() {

		SQLiteDatabase sqldb = null;

		File dir = new File(Path);
		if (!dir.exists())// 判断文件夹是否存在，不存在就新建一个
		{
			dir.mkdir();
		}
		try {

			String Dbpath = Path + dbName;
			sqldb = SQLiteDatabase.openDatabase(Dbpath, null,
					SQLiteDatabase.OPEN_READONLY);
		} catch (SQLiteException e) {

		}
		if (sqldb != null) {

			sqldb.close();
		}
		return sqldb != null ? true : false;

	}
	
}
