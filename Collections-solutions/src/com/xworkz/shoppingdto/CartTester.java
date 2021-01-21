package com.xworkz.shoppingdto;

import java.util.ArrayList;
import java.util.Collection;

public class CartTester {
	
	public static void main(String[] args) {
		
		
		ShoppingCartDTO dto1 = new ShoppingCartDTO();
		dto1.setItemName("salwar");
		dto1.setPrice(2000);
		dto1.setQuantity(1);
		
		ShoppingCartDTO dto2 = new ShoppingCartDTO();
		dto2.setItemName("shoe");
		dto2.setPrice(1500);
		dto2.setQuantity(1);
		
		ShoppingCartDTO dto3 = new ShoppingCartDTO();
		dto2.setItemName("books");
		dto2.setPrice(1500);
		dto2.setQuantity(1);
		
		Collection<ShoppingCartDTO> cartDTO = new ArrayList();
		cartDTO.add(dto1);
		cartDTO.add(dto2);
		cartDTO.add(dto3);
		
		
		
		ShoppingCartDTO dto4 = new ShoppingCartDTO();
		dto3.setItemName("Shoe");
		dto3.setPrice(2000);
		dto3.setQuantity(2);
		
		
		boolean contains = cartDTO.contains(dto2);
		System.out.println(contains);
		
		if(contains){
			System.out.println("shoe is in cart");
		}else{
			System.out.println("shoe is added to cart");
			cartDTO.add(dto4);
		}
		
		System.out.println("after adding shoe :"+ cartDTO.size());
			//System.out.println("Contains"+contain);
			/*
			 * for (ShoppingCartDTO shoppingCartDTO : cartDTOs) {
			 * if(shoppingCartDTO.getItemName().equals("Shoe")) {
			 * System.out.println("shoe is in cart"); } else {
			 * System.out.println("shoe is not in cart, can add"); } }
			 */
		
			
//			Collection<String> countrys=new ArrayList<String>();
//			countrys.add("INDIA");
//			countrys.add("AUSTRALIA");
//			
//			countrys.contains("INDIA");
//			
			
			
			
			
			
			
			
			
		
	}

}
