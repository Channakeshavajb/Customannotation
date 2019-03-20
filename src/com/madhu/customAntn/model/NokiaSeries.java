package com.madhu.customAntn.model;

import com.madhu.customAntn.annotation.SmartPhone;

@SmartPhone(os="Android",version=6)
public class NokiaSeries {

	
	public static  String model="nothing";
	int size;
	
	public NokiaSeries(String model, int size) {
		super();
		this.model = model;
		this.size = size;
	}
	
}


//its example to show @inherited Attributes....helps inherites the class
class SamSung extends NokiaSeries{

	public SamSung(String model, int size) {
		super(model, size);
		// TODO Auto-generated constructor stub
	}
	
}