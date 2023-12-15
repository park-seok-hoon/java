package day06;

public class ArrayExpand {

		//배열이 꽉 찼을 때 배열을 확장하는 예제
	public static void main(String[] args) {
		
		int array[] = new int[5];
		
		array[0]=25;
		array[1]=26;
		array[2]=27;
		array[3]=28;
		array[4]=29;
		
		int count = 10;
		
		for(int i=0; i<count; i++)
		{
			
			if(i+1 > array.length)
			{
				int tmp[] = new int[array.length+5];
				System.arraycopy(array, 0, tmp, 0, array.length); //array의 0번지부터 tmp의 0번지부터 5번지까지
				array=tmp;
			}
			array[i]=i+1;
		}
		
		for(int tmp : array)
		{
			System.out.println(tmp);
			
		}
		
	

	}

}
