class ArrEqual{
	public static void main(String args[]){
		int arr1[]={1,2,3,4,5};
		int arr2[]={1,2,3,5,5};
		int count=0;
		for(int i=0; i<arr1.length; i++){
			if(arr1[i]==arr2[i])
				++count;
		}
		if(count==arr1.length)
			System.out.println("They are equal");
		else
			System.out.println("They are not equal");
	}
}
