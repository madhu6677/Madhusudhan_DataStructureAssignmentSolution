
package com.greatlng.datastructure.main;

    import java.util.Scanner;

	import com.greatlng.datastructure.main.BuildingServices;
	import com.greatlng.datastructure.main.BuildingImplementation;
	import com.greatlng.datastructure.main.BuildingSearching;
	import com.greatlng.datastructure.main.BuildingSorting;

	public class Main {

		public static void main(String[] args) {

			int noOfCompanies;
			int option;
			System.out.println("enter the total no of  floors in the Building ");
			Scanner sc = new Scanner(System.in);
			noOfCompanies = sc.nextInt();
			double priceArray[] = new double[noOfCompanies];
			boolean profitArray[] = new boolean[noOfCompanies];

			for (int i = 0; i < noOfCompanies; i++) {
				System.out.println("Enter the floor size given on Day: " + (i + 1));
				priceArray[i] = sc.nextDouble();
				System.out.println("The order of construction is as follows:");
				profitArray[i] = sc.nextBoolean();
			}

			BuildingSorting mergeSortImplementation = new BuildingSorting();
			mergeSortImplementation.sort(priceArray, 0, priceArray.length - 1);

			BuildingServices additionalServices = new BuildingServices();
		BuildingSearching linearSearch = new BuildingSearching();

			BuildingSearching binearySearchImplementation = new BuildingSearching();

			do {

				System.out.println();
				System.out.println("-----------------------------------------------");
				System.out.println("the order of construction is as follows: ");
				System.out.println("day :1 ");
				System.out.println(" day :2 ");
				System.out.println("day :3 ");
				System.out.println(" day :4 ");
				System.out.println("day :5 ");
				System.out.println("day:6");
				System.out.println("-----------------------------------------------");
				option = sc.nextInt();
				switch (option) {

				case 0:
					option = 0;
					break;
				case 1: {
					additionalServices.displayPricesAscendingOrder(priceArray);

				}
					break;
				case 2: {
					additionalServices.displayPricesDescendingOrder(priceArray);

				}
					break;
				case 3: {
					System.out.println("The  no of floors on given on day  : "
							+ linearSearch.countCompaniesInProfit(profitArray));

				}
					break;
				case 4: {
					System.out.println("The  no of floors on given on day  : "
							+ (noOfCompanies - linearSearch.countCompaniesInProfit(profitArray)));

				}
					break;
				case 5: {
					double key;
					System.out.println("enter the key value");
					key = sc.nextDouble();
					mergeSortImplementation.BuildingSearching(priceArray, key);

				}

					break;
				default:
					System.out.println("enter valid option");
				}

			} while (option != 0);
			System.out.println("Exited successfully");
			sc.close();
		}
	}





