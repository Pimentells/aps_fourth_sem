package Bubbble;

public class TestaBubbble {

	public static void main(String[] args) {
		int arr[] = {15,72,38,57,64,23,46,948,172,346,872,18,764,968,7429,176,834,67,32,8,1,4,9,678,18};
		
		//Só tirar o comentário que aparecem as duas formas, pré e pós bubble
		/*System.out.println("Before Bubble Sort");
		for (int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();*/
		
		BubbbleSort.bubbleSort(arr);
		
		System.out.println("BubbleSort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			}
		}
	}