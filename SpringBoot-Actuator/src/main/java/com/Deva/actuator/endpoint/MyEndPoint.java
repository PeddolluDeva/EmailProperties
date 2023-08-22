package com.Deva.actuator.endpoint;
	import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
	import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;
   @Component
	@Endpoint(id="devanjineyulu",enableByDefault=true)
	public class MyEndPoint {
		@ReadOperation
		public MyEndPointResponse features() {
			return new MyEndPointResponse(832000, "Deva", "Live", 23);
		//return new MyEndPointResponse(8032000,"Devanjineyulu","Active",507362);
		}  }
	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	class MyEndPointResponse{	
		public MyEndPointResponse(int i, String string, String string2, int j) {
		}
		private int id;
		private String name;
		private String statues;
		private  String  Age;
	
	}


