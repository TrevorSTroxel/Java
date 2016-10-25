class Asc{
	public static void main (String a[]){
		int i; 
		char c;
		System.out.println("interger	character");
		
		for (i = 1; i < 1000; i++){
			c = (char)i;
			System.out.print(i+"="+c+" ");
			if(i % 10 == 0){System.out.println();}
		}
	}
}
