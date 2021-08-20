package week2.Day2;

public class RemoveDuplicate1 {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String Arr[] = text.split(" ");
		int count = 0;
		for (int i = 0; i < Arr.length; i++) {
			for (int j = i +1; j < Arr.length; j++) {
				if (Arr[i] .equals( Arr[j])) {
					count=count+1;
				}
				if (count>= 1) {
					Arr[j]=Arr[j].replace(Arr[i], "");				
				}
			}
			System.out.print(" "+Arr[i]+"");
		}


	}

}
