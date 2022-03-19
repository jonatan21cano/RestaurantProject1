/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantproject;


public class Waiter {
	
	public double getOrder(int[] order) {
		Restaurant r = new Restaurant();
		double price=0;
		
		for(int i=0; i<order.length; i++) {
			 
			switch (order[i]) {
			case 1:
				price+= r.burguer;
				break;

			case 2:
				price+= r.hotDog;
				break;
			case 3:
				price+= r.potato;
				break;

			case 4:
				price+= r.sausage;
				break;
			}
		}
		
		return price;
		
	}

}

