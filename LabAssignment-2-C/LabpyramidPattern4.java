class LabpyramidPattern4{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
			for (int s=9;s>i;s--){
			System.out.print(" ");}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
				for(int n=i-1;n>=1;n--)
				{
				System.out.print(n);}
		System.out.println(" ");
	}
	}
}