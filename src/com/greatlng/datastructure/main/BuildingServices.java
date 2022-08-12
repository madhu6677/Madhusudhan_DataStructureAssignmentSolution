package com.greatlng.datastructure.main;

public class BuildingServices {
		
			public void displayPricesAscendingOrder(double[] array) {
				System.out.println("the order of construction is as follows :");
				for(int i=0;i<array.length;i++)
					System.out.print(array[i] + " ");
				System.out.println();
			}
			public void displayPricesDescendingOrder(double[] array) {
				System.out.println("floors days assending order in  are :");
				for(int i=array.length-1;i>=0;i--)
					System.out.print(array[i] + " ");
				System.out.println();
			}

			
		}



