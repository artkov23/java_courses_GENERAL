public class Calculate
{
		
	public static void main(String[] agr)
	{
		System.out.println("Calculate ...");
		float first = Float.valueOf(agr[0]);
	    float second = Float.valueOf(agr[1]);
		float summ = first + second;
		System.out.println("Sum=" + summ);
		float difference = first - second;
		System.out.println("difference=" + difference);
		float product = first * second;
		System.out.println("product=" + product);
		float share = first + second;
		System.out.println("share=" + share);
	}

}