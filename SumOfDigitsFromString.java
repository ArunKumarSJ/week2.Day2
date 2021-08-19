package week2.Day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum=0;
		String ReplacedText1 = text.replaceAll("\\D", "");
		System.out.println(ReplacedText1);
		char[] CA = ReplacedText1.toCharArray();
		for(int i=0;i<CA.length;i++) {
			int num = Character.getNumericValue(CA[i]);
			sum=sum+num;
		}
		System.out.println(sum);

	}

}
