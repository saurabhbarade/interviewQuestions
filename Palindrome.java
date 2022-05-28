class Palindrome{
	public static void main(String args[]) {
		String str="12321";
	    String str1="";
	    char ch;
	    for(int i=0;i<=str.length()-1;i++) {
	    	ch=str.charAt(i);
	    	str1=ch+str1;
	    }
	   if(str.equals(str1))
		System.out.println("Its a palindrome");
	   else
	   System.out.println("Its not a palindrome");
	    
	}
}