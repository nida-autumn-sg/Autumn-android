package com.testautomation.Utility;


import java.util.Map;

import java.util.TreeMap;



import com.codoid.products.exception.FilloException;

import com.codoid.products.fillo.Connection;

import com.codoid.products.fillo.Fillo;

import com.codoid.products.fillo.Recordset;



public class ExcelHandler 

{

	public static Map<String,Map> getTestDataInMap(String testDataFile,String sheetName,String testCaseId) throws Exception

	{
		Map<String, Map> RecordsMap = new TreeMap<String, Map>();
		String query=null;
		query=String.format("SELECT * FROM %s WHERE Run='Yes' and TestCaseId='%s'",
				sheetName,testCaseId);
		Fillo fillo=new Fillo();
		Connection conn=null;
		Recordset recordset=null;

		try
		{
			conn=fillo.getConnection(testDataFile);
			recordset=conn.executeQuery(query);
			System.out.println(recordset);
			//recordset=((com.codoid.products.fillo.Connection) conn).executeQuery(query);
			int i = 0;

			while(recordset.next())
			{
				Map<String,String> TestDataInMap=new TreeMap<String,String>();	

				for(String field:recordset.getFieldNames())
				{
					TestDataInMap.put(field, recordset.getField(field));
				}
				RecordsMap.put("row" + i, TestDataInMap);
				i++;
			}
		}

		catch(FilloException e)
		{

			e.printStackTrace();

			throw new Exception("Test data cannot find . . .");			

		}

		conn.close();

		return RecordsMap;		

	}

	

	public static void UpdateTestResultsToExcel(String testDataFilePath,String sheetName,String tcStatus,String testCaseId)

	{

		Connection conn=null;

		Fillo fillo =new Fillo();

		try{

			conn=fillo.getConnection(testDataFilePath);

			String query=String.format("UPDATE %s SET TestCaseStatus='%s' where TestCaseID='%s'", sheetName,tcStatus,testCaseId);

			conn.executeUpdate(query);

		} catch(FilloException e){

			e.printStackTrace();

		}		

	}



}