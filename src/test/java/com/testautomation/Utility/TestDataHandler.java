package com.testautomation.Utility;

import java.util.HashMap;
import java.util.Map;

public class TestDataHandler 
{
	Map<String,Map> testDataInMap=new HashMap<String,Map>();

	public Map<String, Map> getTestDataInMap() {
		return testDataInMap;
	}

	public void setTestDataInMap(Map<String, Map> testDataInMap) {
		this.testDataInMap = testDataInMap;
	}

}
