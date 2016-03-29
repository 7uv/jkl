package com.sayantan.Action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.sayantan.ActionForm.TradeAppFormVars;
import com.sayantan.DAO.ConnectionManager;

public class AccessSectorDetails extends ActionSupport implements
		ModelDriven<Object>, Preparable {
	private static final long serialVersionUID = -7012445214549281834L;
	private TradeAppFormVars appFormVars;
	private static final Logger logger = Logger
			.getLogger(AccessDataDetails.class);
	Connection conn1 = null;
	Statement stmt1 = null;
	ResultSet rsSectorDataSet = null;

	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		appFormVars = new TradeAppFormVars();
	}

	public Object getModel() {
		// TODO Auto-generated method stub
		return appFormVars;
	}
	
	@Override
	public String execute() throws Exception {
		// Set seed
		logger.info("RUNNING AccessSectorDetails");
		TradeAppFormVars
				.setDoneRFile(String.valueOf(System.currentTimeMillis()));
		logger.info("seed value: " + TradeAppFormVars.getDoneRFile());
		Map<String, Object> session = ActionContext.getContext().getSession();
		HashMap<Integer, String> a = new HashMap<Integer, String>();
		
		// queries
		String subSectorQuery = "select distinct sub_sector from security_master where sector = '" + TradeAppFormVars.getSectorList().get(
				Integer.parseInt(appFormVars.getSector())) + "' order by sub_sector";

		// Retrieve the result set
		conn1 = ConnectionManager.getConnection();
		stmt1 = conn1.createStatement();
		
		rsSectorDataSet = stmt1.executeQuery(subSectorQuery);

		// create result lists
		int i = 1;
		a.put(0, "All");

		while(rsSectorDataSet.next())
		{
			a.put(i, rsSectorDataSet.getString(1));
			i++;
		}

		TradeAppFormVars.setSubSectorList(a);
		TradeAppFormVars.setSn(appFormVars.getSector());
		
		session.put("sectorNo", appFormVars.getSector());
		session.put("userSeed", TradeAppFormVars.getDoneRFile());	
		return SUCCESS;
	}
}
