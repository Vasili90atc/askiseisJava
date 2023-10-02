	package askiseis_me_array;
	public class ArrayInit {
	public static void main(String[] args) {

	int[] array1 = {3, -5, 0, 8};

	System.out.println("array1:");
	for(int i = 0; i < array1.length; i++)
	System.out.print(array1[i] + " ");
	System.out.print("\n");

	int[] array2;
	array2 = new int[5];

	System.out.println("array2 after construction:");
	for(int i = 0; i < array2.length; i++)
	System.out.print(array2[i] + " ");
	System.out.print("\n");

	for(int i = 0; i < array2.length; i++)
	array2[i] = i * 2;

	}

}