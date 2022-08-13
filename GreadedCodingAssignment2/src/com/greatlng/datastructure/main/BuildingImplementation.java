package com.greatlng.datastructure.main;

	import java.io.IOException;
	import java.util.PriorityQueue;
	import java.util.Scanner;

	import com.greatlng.datastructure.main.BuildingServices;

	public class BuildingImplementation {

		public static void main(String[] args) throws IOException {

			Scanner sc = new Scanner(System.in);

			System.out.println("enter the total no of floors in the building");
			
			int noOfFloor = sc.nextInt();

		    int[] floors = new int[noOfFloor];
			
		   
			for(int i=0; i<noOfFloor; i++)  
			{  
			System.out.println("enter the floor size given on day : "+(i+1));
			floors[i] = sc.nextInt(); 
			}  
			System.out.println();
			
			BuildingServices service = new BuildingServices();
			service.printConstructionTable(floors, noOfFloor);
		}
	}