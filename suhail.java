import java.util.Arrays;
import java.util.Scanner;

/**
 * suhail
 */
 class suhail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the nuber of test cases");
int t=sc.nextInt();
for (int k = 0; k < t; k++) {
    //created an array of n times
	System.out.println("enter the number of items u need to purchase");
    int noOfitems=sc.nextInt();
    int[]arr=new int[noOfitems];
	System.out.println("enter the coupon price offered");
    //getting coupon price
    int couponPrice=sc.nextInt();
    //getting discount price
	System.out.println("enter the discount if coupon is applied");
    int discountPrice=sc.nextInt();

    int totalCostWithoutDiscount=0;
    int totalCostWithDiscount=0;

    //getting cost of each item purchased
    for (int i = 0; i < noOfitems; i++) {
        arr[i]=sc.nextInt();
        totalCostWithoutDiscount+=arr[i];
        int discountedPrice=arr[i]-discountPrice;
        if(discountedPrice>=0){
            totalCostWithDiscount+=discountedPrice;
        }
    }
	System.out.println("total cost without coupon is "+totalCostWithoutDiscount);
	System.out.println("total cost with coupon is "+totalCostWithDiscount);
    if ((totalCostWithDiscount+couponPrice)<totalCostWithoutDiscount) {
        System.out.println("coupon");
    } else {
        System.out.println("no coupon");
    }
}



	}
}