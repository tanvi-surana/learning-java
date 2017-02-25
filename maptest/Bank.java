package maptest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bank {

	//String location;
	//String branch;
	
	//This uses the location,branch
	Map<String,Map<String,Integer>> bankBranchMap;
	
	//This uses the location,list of atms
	Map<String,ArrayList<String>> bankATMList;
	
	public Bank(Map<String,Map<String,Integer>> bankBranchMap,Map<String,ArrayList<String>> bankATMList) 
	{
		// TODO Auto-generated constructor stub
//		bankBranchMap=new HashMap<String,Map<String,Integer>>();
//		bankATMList=new HashMap<String,ArrayList<String>>();
		
		this.bankBranchMap=bankBranchMap;
		this.bankATMList=bankATMList;
	}

	 

}
