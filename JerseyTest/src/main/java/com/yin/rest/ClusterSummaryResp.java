package com.yin.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ClusterSummaryResp {
	 public String stormVersion;
	 public int nimbusUptime;
	 public int supervisors;
	 public int slotsTotal;
	 public int slotsUsed;
	 public int slotsFree;
	 public int executorsTotal;
	 public int tasksTotal;
	 
	 public ClusterSummaryResp() {		
		 
	 }
}
