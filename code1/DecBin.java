class DecBin{
	public static void main (String a[]){
	
		int n;
		String bin; String hex;
		for (n = 0; n <= 255; n ++){
				 bin = Integer.toBinaryString(n);
				 if(bin.length() == 5);{
					 bin = "000"+bin;
				 }
				 hex = Integer.toHexString(n);
				 System.out.print(bin+" ");
				 //System.out.println(bin.length());

				 //System.out.println(n+" "+hex+" "+bin);
			 }
			 
	}
}
