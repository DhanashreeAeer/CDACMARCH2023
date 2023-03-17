class LabhallowpyramidPattern6{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for (int s=i;s<=6;s++){
			System.out.print(" ");}
			for(int j=1;j<=6;j++)
			{
				if(j==1||j==1||j==i||i==6){
				System.out.print(" *");}
				else{
					System.out.print("  ");}
					
			}
				
		System.out.println(" ");
	}
	}
}