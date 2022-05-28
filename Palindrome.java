class Palindrome{
	public static void main(String args[]) {
		String str="12321";
	    String str1="";
	    char ch;
	    for(int i=0;i<=str.length()-1;i++) {
	    	ch=str.charAt(i);
	    	str1=ch+str1;
	    }
	    System.out.println(str.equals(str1));
	}
}