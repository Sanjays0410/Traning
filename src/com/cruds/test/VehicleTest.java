package com.cruds.test;

//import com.cruds.demo.ivechile;

import com.cruds.demo.Ivechile2;
import com.cruds.demo.Vechileprovider;;
public class VehicleTest  
{

	public static void main(String[] args) {
		/*ivechile v =Vechileprovider.getVechile(ivechile.TYPE_LOADSS);
   
				v.start();
				v.stop();	*/
		Ivechile2 vv=Vechileprovider.getVechile(Ivechile2.TYPE_PASSENGER);
	            vv.start();
	            vv.stop();
	            vv.brake();
	}
}
  