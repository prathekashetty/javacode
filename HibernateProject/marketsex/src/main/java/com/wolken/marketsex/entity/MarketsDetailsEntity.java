package com.wolken.marketsex.entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "markets_details")
public class MarketsDetailsEntity {
	    @Id
	    @Column
	    private int id;
	    @Column
	    private String mname;
	    @Column
	    private String location;
	    @Column
	    private String mtype;
	    @Column
	    private int noOfShop;
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getMname() {
			return mname;
		}
		public void setMname(String mname) {
			this.mname = mname;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getMtype() {
			return mtype;
		}
		public void setMtype(String mtype) {
			this.mtype = mtype;
		}
		public int getNoOfShop() {
			return noOfShop;
		}
		public void setNoOfShop(int noOfShop) {
			this.noOfShop = noOfShop;
		}
		@Override
		public String toString() {
			return "MarketsTest [id=" + id + ", mname=" + mname + ", location=" + location + ", mtype=" + mtype
					+ ", noOfShop=" + noOfShop + "]";
		}
	   





}

