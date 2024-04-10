package java_basic.trainning1;

public class FindMaxMin {
	public static void main(String[] args) {
		int[] arr = {4, 5, 1, 10, 3};
		int max = arr[0];
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("最大値:" + max);
		System.out.println("最小値：" + min);
	}
}
