class LabfullpyramidPattern4{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for (int s=6-i;s>=1;s--){
			System.out.print(" ");}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
				
		System.out.println(" ");
	}
	}
}