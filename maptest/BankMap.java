package maptest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BankMap {

	//String bankName;
	//first has bankName,location
	Map<String, Bank> first;
	
	//Map<String,Integer> bankBranchMap;
	//Map<String,ArrayList<String>> bankATMList;
	
	Bank bankObj;
	BankMap()
	{
		first=new HashMap<String,Bank>();
		//bankBranchMap=new HashMap<>();
		//bankATMList=new HashMap<>();
		//bankObj=new Bank(bankBranchMap,bankATMList);
	}
	
	void setValue(String bankName,String location,String branch,ArrayList<String> listOfAtms,Integer flag)
	{
		Map<String,Map<String,Integer>> bankBranchMap=new HashMap<>();
		Map<String,ArrayList<String>> bankATMList=new HashMap<>();
		Map<String,Integer> val1=new HashMap<>();
		val1.put(branch, flag);
		
		
		bankBranchMap.put(location,val1);
		bankATMList.put(location, listOfAtms);
		
		Bank obj=new Bank(bankBranchMap,bankATMList);
		first.put(bankName,obj);
		
	}
	
	
	boolean search(String bankName,String location)
	{
		
		if(first.containsKey(bankName))
		{
			Bank ob=first.get(bankName);
			
			if(ob.bankBranchMap.containsKey(location))
			{
				Map<String,Integer> map1=ob.bankBranchMap.get(location);
				Set<String> keys=map1.keySet();
				
				for(String key:keys)
				{
					System.out.println(key+" "+map1.get(key));
				}
				
				
				ArrayList<String> atms= ob.bankATMList.get(location);
				
				//ArrayList<String> atms=map2.get(location);
				
				for(int i=0;i<atms.size();i++)
				{
					System.out.print(atms.get(i)+" ");
				}
				
				return true;
				
			}
			else
			{
				System.out.println("No such location");
				return false;
			}
			
			
		}
		
		System.out.println("No such bankname");
		return false;
		
	}
	
	public static void main(String[] args) 
	{
	    String bankName1="ICICI";
	    String bankName2="BOB";
	    
	    String location1="San Diego";
	    String location2="San Hose";
	    String location3="Houston";
	    
	    String branch1="b1";
	    String branch2="b2";
	    String branch3="b3";
	    
	    ArrayList<String> arraylist1 =new ArrayList<>();
	    arraylist1.add("a1");
	    arraylist1.add("a2");
	    arraylist1.add("a3");
	    
	    BankMap banking_sys=new BankMap();
	    
	    banking_sys.setValue(bankName1, location1,branch1,arraylist1 ,1);
	    
	    
	   
	    if(banking_sys.search(bankName1, location1))
	    {
	      System.out.println("Exists");	
	    }
	    else
	    {
	    	System.out.println("doesn't");
	    }
	    
	    if(banking_sys.search(bankName2, location2))
	    {
	    	System.out.println("Exists");
	    }
	    else
	    {
	    	System.out.println("doesn't");
	    }
	    
	    
	}

}
