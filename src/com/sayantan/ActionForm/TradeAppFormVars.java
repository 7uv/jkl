package com.sayantan.ActionForm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

public class TradeAppFormVars 
{
	// Global variables
	private static String doneRFile = " ";
	private int iterate = 0;
	
	// Database connectivity
	static String m_DBDriver = "org.postgresql.Driver";  
	static String url = "jdbc:postgresql://192.168.83.43:5432/MarketData";  
	static String username = "postgres";
	static String password = "aqf@123";
	
	// Access Data Details
	private static HashMap<Integer, String> sectorList = new HashMap<Integer, String>(); 
	private static HashMap<Integer, String> subSectorList = new HashMap<Integer, String>(); 
	
	private String sector;
	private String subSector;
	private String marketcap1;
	private String marketcap2;
	private String fromDate;
	private String toDate;
	
	private boolean fno;
	private boolean nstocks;
	private boolean astocks;
	
	private boolean hv1;
	private boolean hv2;
	private boolean hv3;
	private boolean hv4;
	private boolean hv5;
	
	private boolean bd1;
	private boolean bd2;
	private boolean bd3;
	private boolean bd4;
	
	private boolean bdu1;
	private boolean bdu2;
	private boolean bdu3;
	
	private boolean bdd1;
	private boolean bdd2;
	private boolean bdd3;
	
	private boolean cor1;
	private boolean cor2;
	private boolean cor3;
	private boolean cor4;
	private boolean cor5;
	private boolean cor6;
	
	private boolean wb1;
	private boolean wb2;
	private boolean wb3;
	private boolean wb4;

	private boolean bwu1;
	private boolean bwu2;
	private boolean bwu3;
	
	private boolean bwd1;
	private boolean bwd2;
	private boolean bwd3;

	private boolean bm1;
	private boolean bm2;
	private boolean bm3;

	private boolean bmu1;
	private boolean bmu2;
	private boolean bmu3;

	private boolean bmd1;
	private boolean bmd2;
	private boolean bmd3;
	
	private static String sn;
	
	//create result lists
	private static HashMap<Integer, String> security = new HashMap<Integer, String>();
	private static HashMap<Integer, Double> lastClosePrice = new HashMap<Integer, Double>();
	private static HashMap<Integer, String> mc = new HashMap<Integer, String>();
	private static HashMap<Integer, String> hv1list = new HashMap<Integer, String>();
	private static HashMap<Integer, String> hv2list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> hv3list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> hv4list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> hv5list  = new HashMap<Integer, String>();
	
	private static HashMap<Integer, String> bd1list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> bd2list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> bd3list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> bd4list  = new HashMap<Integer, String>();

	private static HashMap<Integer, String> bdu1list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> bdu2list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> bdu3list  = new HashMap<Integer, String>();
	
	private static HashMap<Integer, String> bdd1list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> bdd2list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> bdd3list  = new HashMap<Integer, String>();
	
	private static HashMap<Integer, String> corr1list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> corr2list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> corr3list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> corr4list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> corr5list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> corr6list  = new HashMap<Integer, String>();
	
	private static HashMap<Integer, String> wb1list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> wb2list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> wb3list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> wb4list  = new HashMap<Integer, String>();
	
	private static HashMap<Integer, String> bwu1list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> bwu2list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> bwu3list  = new HashMap<Integer, String>();
	
	private static HashMap<Integer, String> bwd1list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> bwd2list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> bwd3list  = new HashMap<Integer, String>();

	private static HashMap<Integer, String> bm1list = new HashMap<Integer, String>();
	private static HashMap<Integer, String> bm2list = new HashMap<Integer, String>();
	private static HashMap<Integer, String> bm3list = new HashMap<Integer, String>();
	
	private static HashMap<Integer, String> bmu1list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> bmu2list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> bmu3list  = new HashMap<Integer, String>();
	
	private static HashMap<Integer, String> bmd1list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> bmd2list  = new HashMap<Integer, String>();
	private static HashMap<Integer, String> bmd3list  = new HashMap<Integer, String>();
	
	private ArrayList<String> security12 = new ArrayList<String>();
	private ArrayList<Double> lcp = new ArrayList<Double>();
	
	// Getters and Setters
	public static String getDoneRFile() {
		return doneRFile;
	}
	public boolean isAstocks() {
		return astocks;
	}
	public void setAstocks(boolean astocks) {
		this.astocks = astocks;
	}
	public ArrayList<String> getSecurity12() {
		return security12;
	}
	public void setSecurity12(ArrayList<String> security12) {
		this.security12 = security12;
	}
	public static void setDoneRFile(String doneRFile) {
		TradeAppFormVars.doneRFile = doneRFile;
	}
	public int getIterate() {
		return iterate;
	}
	public void setIterate(int iterate) {
		this.iterate = iterate;
	}
	public static String getM_DBDriver() {
		return m_DBDriver;
	}
	public static void setM_DBDriver(String m_DBDriver) {
		TradeAppFormVars.m_DBDriver = m_DBDriver;
	}
	public static String getUrl() {
		return url;
	}
	public static void setUrl(String url) {
		TradeAppFormVars.url = url;
	}
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		TradeAppFormVars.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		TradeAppFormVars.password = password;
	}
	public static HashMap<Integer, String> getSectorList() {
		return sectorList;
	}
	public static String getSn() {
		return sn;
	}
	public static void setSn(String sn) {
		TradeAppFormVars.sn = sn;
	}
	public static void setSectorList(HashMap<Integer, String> sectorList) {
		TradeAppFormVars.sectorList = sectorList;
	}
	public static HashMap<Integer, String> getSubSectorList() {
		return subSectorList;
	}
	public static void setSubSectorList(HashMap<Integer, String> subSectorList) {
		TradeAppFormVars.subSectorList = subSectorList;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getSubSector() {
		return subSector;
	}
	public void setSubSector(String subSector) {
		this.subSector = subSector;
	}
	public String getMarketcap1() {
		return marketcap1;
	}
	public void setMarketcap1(String marketcap1) {
		this.marketcap1 = marketcap1;
	}
	public String getMarketcap2() {
		return marketcap2;
	}
	public void setMarketcap2(String marketcap2) {
		this.marketcap2 = marketcap2;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public boolean isFno() {
		return fno;
	}
	public void setFno(boolean fno) {
		this.fno = fno;
	}
	public boolean isNstocks() {
		return nstocks;
	}
	public void setNstocks(boolean nstocks) {
		this.nstocks = nstocks;
	}
	public boolean isHv1() {
		return hv1;
	}
	public void setHv1(boolean hv1) {
		this.hv1 = hv1;
	}
	public boolean isHv2() {
		return hv2;
	}
	public void setHv2(boolean hv2) {
		this.hv2 = hv2;
	}
	public boolean isHv3() {
		return hv3;
	}
	public void setHv3(boolean hv3) {
		this.hv3 = hv3;
	}
	public boolean isHv4() {
		return hv4;
	}
	public void setHv4(boolean hv4) {
		this.hv4 = hv4;
	}
	public boolean isHv5() {
		return hv5;
	}
	public void setHv5(boolean hv5) {
		this.hv5 = hv5;
	}
	public boolean isBd1() {
		return bd1;
	}
	public void setBd1(boolean bd1) {
		this.bd1 = bd1;
	}
	public boolean isBd2() {
		return bd2;
	}
	public void setBd2(boolean bd2) {
		this.bd2 = bd2;
	}
	public boolean isBd3() {
		return bd3;
	}
	public void setBd3(boolean bd3) {
		this.bd3 = bd3;
	}
	public boolean isBd4() {
		return bd4;
	}
	public void setBd4(boolean bd4) {
		this.bd4 = bd4;
	}
	public boolean isBdu1() {
		return bdu1;
	}
	public void setBdu1(boolean bdu1) {
		this.bdu1 = bdu1;
	}
	public boolean isBdu2() {
		return bdu2;
	}
	public void setBdu2(boolean bdu2) {
		this.bdu2 = bdu2;
	}
	public boolean isBdu3() {
		return bdu3;
	}
	public void setBdu3(boolean bdu3) {
		this.bdu3 = bdu3;
	}
	public boolean isBdd1() {
		return bdd1;
	}
	public void setBdd1(boolean bdd1) {
		this.bdd1 = bdd1;
	}
	public boolean isBdd2() {
		return bdd2;
	}
	public void setBdd2(boolean bdd2) {
		this.bdd2 = bdd2;
	}
	public boolean isBdd3() {
		return bdd3;
	}
	public void setBdd3(boolean bdd3) {
		this.bdd3 = bdd3;
	}
	public boolean isCor1() {
		return cor1;
	}
	public void setCor1(boolean cor1) {
		this.cor1 = cor1;
	}
	public boolean isCor2() {
		return cor2;
	}
	public void setCor2(boolean cor2) {
		this.cor2 = cor2;
	}
	public boolean isCor3() {
		return cor3;
	}
	public void setCor3(boolean cor3) {
		this.cor3 = cor3;
	}
	public boolean isCor4() {
		return cor4;
	}
	public void setCor4(boolean cor4) {
		this.cor4 = cor4;
	}
	public boolean isCor5() {
		return cor5;
	}
	public void setCor5(boolean cor5) {
		this.cor5 = cor5;
	}
	public boolean isCor6() {
		return cor6;
	}
	public void setCor6(boolean cor6) {
		this.cor6 = cor6;
	}
	public boolean isWb1() {
		return wb1;
	}
	public void setWb1(boolean wb1) {
		this.wb1 = wb1;
	}
	public boolean isWb2() {
		return wb2;
	}
	public void setWb2(boolean wb2) {
		this.wb2 = wb2;
	}
	public boolean isWb3() {
		return wb3;
	}
	public void setWb3(boolean wb3) {
		this.wb3 = wb3;
	}
	public boolean isWb4() {
		return wb4;
	}
	public void setWb4(boolean wb4) {
		this.wb4 = wb4;
	}
	public boolean isBwu1() {
		return bwu1;
	}
	public void setBwu1(boolean bwu1) {
		this.bwu1 = bwu1;
	}
	public boolean isBwu2() {
		return bwu2;
	}
	public void setBwu2(boolean bwu2) {
		this.bwu2 = bwu2;
	}
	public boolean isBwu3() {
		return bwu3;
	}
	public void setBwu3(boolean bwu3) {
		this.bwu3 = bwu3;
	}
	public boolean isBwd1() {
		return bwd1;
	}
	public void setBwd1(boolean bwd1) {
		this.bwd1 = bwd1;
	}
	public boolean isBwd2() {
		return bwd2;
	}
	public void setBwd2(boolean bwd2) {
		this.bwd2 = bwd2;
	}
	public boolean isBwd3() {
		return bwd3;
	}
	public void setBwd3(boolean bwd3) {
		this.bwd3 = bwd3;
	}
	public boolean isBm1() {
		return bm1;
	}
	public void setBm1(boolean bm1) {
		this.bm1 = bm1;
	}
	public boolean isBm2() {
		return bm2;
	}
	public void setBm2(boolean bm2) {
		this.bm2 = bm2;
	}
	public boolean isBm3() {
		return bm3;
	}
	public void setBm3(boolean bm3) {
		this.bm3 = bm3;
	}
	public boolean isBmu1() {
		return bmu1;
	}
	public void setBmu1(boolean bmu1) {
		this.bmu1 = bmu1;
	}
	public boolean isBmu2() {
		return bmu2;
	}
	public void setBmu2(boolean bmu2) {
		this.bmu2 = bmu2;
	}
	public boolean isBmu3() {
		return bmu3;
	}
	public void setBmu3(boolean bmu3) {
		this.bmu3 = bmu3;
	}
	public boolean isBmd1() {
		return bmd1;
	}
	public void setBmd1(boolean bmd1) {
		this.bmd1 = bmd1;
	}
	public boolean isBmd2() {
		return bmd2;
	}
	public void setBmd2(boolean bmd2) {
		this.bmd2 = bmd2;
	}
	public boolean isBmd3() {
		return bmd3;
	}
	public void setBmd3(boolean bmd3) {
		this.bmd3 = bmd3;
	}
	public static HashMap<Integer, String> getSecurity() {
		return security;
	}
	public static void setSecurity(HashMap<Integer, String> security) {
		TradeAppFormVars.security = security;
	}
	public static HashMap<Integer, Double> getLastClosePrice() {
		return lastClosePrice;
	}
	public static void setLastClosePrice(HashMap<Integer, Double> lastClosePrice) {
		TradeAppFormVars.lastClosePrice = lastClosePrice;
	}
	public static HashMap<Integer, String> getMc() {
		return mc;
	}
	public static void setMc(HashMap<Integer, String> mc) {
		TradeAppFormVars.mc = mc;
	}
	public static HashMap<Integer, String> getHv1list() {
		return hv1list;
	}
	public static void setHv1list(HashMap<Integer, String> hv1list) {
		TradeAppFormVars.hv1list = hv1list;
	}
	public static HashMap<Integer, String> getHv2list() {
		return hv2list;
	}
	public static void setHv2list(HashMap<Integer, String> hv2list) {
		TradeAppFormVars.hv2list = hv2list;
	}
	public static HashMap<Integer, String> getHv3list() {
		return hv3list;
	}
	public static void setHv3list(HashMap<Integer, String> hv3list) {
		TradeAppFormVars.hv3list = hv3list;
	}
	public static HashMap<Integer, String> getHv4list() {
		return hv4list;
	}
	public static void setHv4list(HashMap<Integer, String> hv4list) {
		TradeAppFormVars.hv4list = hv4list;
	}
	public static HashMap<Integer, String> getHv5list() {
		return hv5list;
	}
	public static void setHv5list(HashMap<Integer, String> hv5list) {
		TradeAppFormVars.hv5list = hv5list;
	}
	public static HashMap<Integer, String> getBd1list() {
		return bd1list;
	}
	public static void setBd1list(HashMap<Integer, String> bd1list) {
		TradeAppFormVars.bd1list = bd1list;
	}
	public static HashMap<Integer, String> getBd2list() {
		return bd2list;
	}
	public static void setBd2list(HashMap<Integer, String> bd2list) {
		TradeAppFormVars.bd2list = bd2list;
	}
	public static HashMap<Integer, String> getBd3list() {
		return bd3list;
	}
	public static void setBd3list(HashMap<Integer, String> bd3list) {
		TradeAppFormVars.bd3list = bd3list;
	}
	public static HashMap<Integer, String> getBd4list() {
		return bd4list;
	}
	public static void setBd4list(HashMap<Integer, String> bd4list) {
		TradeAppFormVars.bd4list = bd4list;
	}
	public static HashMap<Integer, String> getBdu1list() {
		return bdu1list;
	}
	public static void setBdu1list(HashMap<Integer, String> bdu1list) {
		TradeAppFormVars.bdu1list = bdu1list;
	}
	public static HashMap<Integer, String> getBdu2list() {
		return bdu2list;
	}
	public static void setBdu2list(HashMap<Integer, String> bdu2list) {
		TradeAppFormVars.bdu2list = bdu2list;
	}
	public static HashMap<Integer, String> getBdu3list() {
		return bdu3list;
	}
	public static void setBdu3list(HashMap<Integer, String> bdu3list) {
		TradeAppFormVars.bdu3list = bdu3list;
	}
	public static HashMap<Integer, String> getBdd1list() {
		return bdd1list;
	}
	public static void setBdd1list(HashMap<Integer, String> bdd1list) {
		TradeAppFormVars.bdd1list = bdd1list;
	}
	public static HashMap<Integer, String> getBdd2list() {
		return bdd2list;
	}
	public static void setBdd2list(HashMap<Integer, String> bdd2list) {
		TradeAppFormVars.bdd2list = bdd2list;
	}
	public static HashMap<Integer, String> getBdd3list() {
		return bdd3list;
	}
	public static void setBdd3list(HashMap<Integer, String> bdd3list) {
		TradeAppFormVars.bdd3list = bdd3list;
	}
	public static HashMap<Integer, String> getCorr1list() {
		return corr1list;
	}
	public static void setCorr1list(HashMap<Integer, String> corr1list) {
		TradeAppFormVars.corr1list = corr1list;
	}
	public static HashMap<Integer, String> getCorr2list() {
		return corr2list;
	}
	public static void setCorr2list(HashMap<Integer, String> corr2list) {
		TradeAppFormVars.corr2list = corr2list;
	}
	public static HashMap<Integer, String> getCorr3list() {
		return corr3list;
	}
	public static void setCorr3list(HashMap<Integer, String> corr3list) {
		TradeAppFormVars.corr3list = corr3list;
	}
	public static HashMap<Integer, String> getCorr4list() {
		return corr4list;
	}
	public static void setCorr4list(HashMap<Integer, String> corr4list) {
		TradeAppFormVars.corr4list = corr4list;
	}
	public static HashMap<Integer, String> getCorr5list() {
		return corr5list;
	}
	public static void setCorr5list(HashMap<Integer, String> corr5list) {
		TradeAppFormVars.corr5list = corr5list;
	}
	public static HashMap<Integer, String> getCorr6list() {
		return corr6list;
	}
	public static void setCorr6list(HashMap<Integer, String> corr6list) {
		TradeAppFormVars.corr6list = corr6list;
	}
	public static HashMap<Integer, String> getWb1list() {
		return wb1list;
	}
	public static void setWb1list(HashMap<Integer, String> wb1list) {
		TradeAppFormVars.wb1list = wb1list;
	}
	public static HashMap<Integer, String> getWb2list() {
		return wb2list;
	}
	public static void setWb2list(HashMap<Integer, String> wb2list) {
		TradeAppFormVars.wb2list = wb2list;
	}
	public static HashMap<Integer, String> getWb3list() {
		return wb3list;
	}
	public static void setWb3list(HashMap<Integer, String> wb3list) {
		TradeAppFormVars.wb3list = wb3list;
	}
	public static HashMap<Integer, String> getWb4list() {
		return wb4list;
	}
	public static void setWb4list(HashMap<Integer, String> wb4list) {
		TradeAppFormVars.wb4list = wb4list;
	}
	public static HashMap<Integer, String> getBwu1list() {
		return bwu1list;
	}
	public static void setBwu1list(HashMap<Integer, String> bwu1list) {
		TradeAppFormVars.bwu1list = bwu1list;
	}
	public static HashMap<Integer, String> getBwu2list() {
		return bwu2list;
	}
	public static void setBwu2list(HashMap<Integer, String> bwu2list) {
		TradeAppFormVars.bwu2list = bwu2list;
	}
	public static HashMap<Integer, String> getBwu3list() {
		return bwu3list;
	}
	public static void setBwu3list(HashMap<Integer, String> bwu3list) {
		TradeAppFormVars.bwu3list = bwu3list;
	}
	public static HashMap<Integer, String> getBwd1list() {
		return bwd1list;
	}
	public static void setBwd1list(HashMap<Integer, String> bwd1list) {
		TradeAppFormVars.bwd1list = bwd1list;
	}
	public static HashMap<Integer, String> getBwd2list() {
		return bwd2list;
	}
	public static void setBwd2list(HashMap<Integer, String> bwd2list) {
		TradeAppFormVars.bwd2list = bwd2list;
	}
	public static HashMap<Integer, String> getBwd3list() {
		return bwd3list;
	}
	public static void setBwd3list(HashMap<Integer, String> bwd3list) {
		TradeAppFormVars.bwd3list = bwd3list;
	}
	public static HashMap<Integer, String> getBm1list() {
		return bm1list;
	}
	public static HashMap<Integer, String> getBm2list() {
		return bm2list;
	}
	public static void setBm2list(HashMap<Integer, String> bm2list) {
		TradeAppFormVars.bm2list = bm2list;
	}
	public static HashMap<Integer, String> getBm3list() {
		return bm3list;
	}
	public static void setBm3list(HashMap<Integer, String> bm3list) {
		TradeAppFormVars.bm3list = bm3list;
	}
	public static void setBm1list(HashMap<Integer, String> bm1list) {
		TradeAppFormVars.bm1list = bm1list;
	}
	public static HashMap<Integer, String> getBmu1list() {
		return bmu1list;
	}
	public static void setBmu1list(HashMap<Integer, String> bmu1list) {
		TradeAppFormVars.bmu1list = bmu1list;
	}
	public static HashMap<Integer, String> getBmu2list() {
		return bmu2list;
	}
	public static void setBmu2list(HashMap<Integer, String> bmu2list) {
		TradeAppFormVars.bmu2list = bmu2list;
	}
	public static HashMap<Integer, String> getBmu3list() {
		return bmu3list;
	}
	public static void setBmu3list(HashMap<Integer, String> bmu3list) {
		TradeAppFormVars.bmu3list = bmu3list;
	}
	public static HashMap<Integer, String> getBmd1list() {
		return bmd1list;
	}
	public static void setBmd1list(HashMap<Integer, String> bmd1list) {
		TradeAppFormVars.bmd1list = bmd1list;
	}
	public static HashMap<Integer, String> getBmd2list() {
		return bmd2list;
	}
	public static void setBmd2list(HashMap<Integer, String> bmd2list) {
		TradeAppFormVars.bmd2list = bmd2list;
	}
	public static HashMap<Integer, String> getBmd3list() {
		return bmd3list;
	}
	public static void setBmd3list(HashMap<Integer, String> bmd3list) {
		TradeAppFormVars.bmd3list = bmd3list;
	}
	public ArrayList<Double> getLcp() {
		return lcp;
	}
	public void setLcp(ArrayList<Double> lcp) {
		this.lcp = lcp;
	}
}
