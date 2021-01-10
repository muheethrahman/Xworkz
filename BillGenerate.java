class BillGenerate{
	public static void main(String args[]){
		int amount=4500;
			if(amount> 5000){
				
				int result =amount*18/100;
				int results=amount+result;
				System.out.println("your bill is greater then 5000    "+amount);
				System.out.println("your GST is 18%        "+results);

			}
			else if(amount<5000){
				int result =amount*18/100;
				int results=amount+result;
				System.out.println("your bill is less then 5000    "+amount);
				System.out.println("your GST is 18%        "+results);
				}


	}
}