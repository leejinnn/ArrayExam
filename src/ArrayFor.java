//배열값의 합 구하는 코드
public class ArrayFor {
	public static void main(String[] arags) {
		int[] iarray=new int[100];
		iarray[0]=1;
		iarray[1]=2;
		
		for(int i=0;i<iarray.length;i++) {
			iarray[i]=i=1;
		}
		int sum=0;
		for(int i=0;i<iarray.length;i++) {
			sum=sum+iarray[i];
		}
		System.out.println(sum);
		
	}

}
