/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantproject;

import java.io.IOException;
import java.util.Scanner;


public class RestaurantProject {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Restaurant MuerteLenta = new Restaurant();
		Waiter waiter = new Waiter();
		
		System.out.print("¿Para cuantas personas es el pedido?");
		int n= in.nextInt();

		int[] order = new int[n];
		int p=0;
		for(int i = 0; i< n ; i++) {
                    int per=i+1;
			System.out.println("Pedido de la persona:" + per
					+ "\nTenemos en nuestro menú lo siguiente (ingrese el numero de su preferencia):"
					+ "\n1.Hamburguesa, por un valor de 10.000"
					+ "\n2.Perro, por un valor de 8.000"
					+ "\n3.Salchipapa, por un valor de 6.000"
					+ "\n4.Chorizo, por un valor de 7.000");
			p = in.nextInt();
			order[i] = p;
			
		}
		
		double totalPrice = waiter.getOrder(order);
		
		if(totalPrice>20000) {
			totalPrice = MuerteLenta.getDiscount(totalPrice);
			System.out.println("Se aplicó un descuento de 10% a su factura por consumo mayor a 20.000 ");
		}
		
		System.out.println("¿Desea incluir el servicio en la cuenta? \n1.Si \n2.No");
		n=in.nextInt();
		if(n==1) {
			totalPrice = MuerteLenta.applyService(totalPrice);
			System.out.println("El total de su factura con servicio incluido es: " + totalPrice);
		}
		else {
			System.out.println("El total de su factura sin servicio incluido es: " + totalPrice);
		}
    }
    
}
