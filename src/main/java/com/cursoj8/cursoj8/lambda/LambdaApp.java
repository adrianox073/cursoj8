package com.cursoj8.cursoj8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaApp {
	
	public void ordenar() {
		List<String> lista = new ArrayList<>();
		
		lista.add("3Java8");
		lista.add("2Java8");
		lista.add("1Java8");
//		
//		Collections.sort(lista, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2);
//			}
//			
//		});
		
		
		Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
		
		for (String elemento: lista) {
			System.out.println(elemento);
		}
		
	}
	
	public static void main(String[] args) {
		LambdaApp app = new LambdaApp();
		
		app.ordenar();
	}

}
