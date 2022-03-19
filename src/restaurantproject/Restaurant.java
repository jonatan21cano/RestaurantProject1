/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantproject;


public class Restaurant {

	double burguer = 10000;
	double hotDog = 8000;
	double potato = 6000;
	double sausage = 7000;
	
	public double getDiscount(double total) {
		return total-= total*0.1;
	}
	
	public double applyService(double total) {
		return total += total*0.1;
	}
	
	
}
