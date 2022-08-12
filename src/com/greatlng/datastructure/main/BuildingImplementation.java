package com.greatlng.datastructure.main;

public class BuildingImplementation {
	
			public void searchValue(double priceArray[], double key) {
			int left = 0;
			int right = priceArray.length - 1;
			int mid = left + (right - left) / 2;

			while (left <= right) {

				if (key < priceArray[mid]) {
					
					right = mid - 1;
				} else if (key > priceArray[mid]) {
					
					left = mid + 1;

				} else {
					System.out.println("floors of value " + key + " is present ");
					break;
				}
				mid = left + (right - left) / 2;
			}

			if (left > right) {
				System.out.println("Value not found");
			}
		}

	}






