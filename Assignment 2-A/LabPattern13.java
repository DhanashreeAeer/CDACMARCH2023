class LabPattern13{
	public static void main(String args[])
	{
		for(int i=65;i<=69;i++)
		{
			for (int s=69-i;s>=1;s--){
			System.out.print(" ");}
			for(int j=65;j<=i;j++)
			{
			System.out.print(" "+(char) i+"");
			}
				
		System.out.println(" ");
	}
	}
}