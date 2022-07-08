package week2BooleanConditionalsLoops;

public class BooleanConditionalsLoops {

	public static void main(String[] args) {
		//Create a variable named age and assign it a value of 14
		int age = 14;
		
		// print the boolean expression age >= 16 to the console and note the results.- out puts false when 14 
		// change the value of age to 18 and run again. //outputs true
		
		System.out.println(age >= 16);
		age = 18;
		System.out.println(age >= 18);
		
		//using a conditional, print "You can drive" if age is greater than or equal to 16
		//and "You can not drive" otherwise
		//change the value of age and rerun to see the result
		//if (condition){sysout} else {sysout}
		
		boolean hasLicense = true ;
		if (age >=16 && hasLicense) {
		System.out.println("You can drive");
		} else {
			System.out.println("You can not drive");
		}
		
		//add a new variable called hasLicense before the conditional
		//change the boolean expression in the conditional to  additionally include the need for hasLicense to be true
		//try changing the values of age and hasLicense and note the different results
		// boolean hasLicense =true;
		
		//create two new variables - costOfMilk and thirstLevel
		//create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50
		//or if thirstLevel is greater than 6 and prints"No Thanks" otherwise
		double costOfMilk = 2.50;
		int thirstLevel = 6;
		//when both false outputs no thanks, if one is true prints milk please
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please");
		} else {
			System.out.println("No Thanks");
		}
		
		
		//create two variables called numberOfCookies and numberOfChildren
		//you will evenly distributed all of the cookies to the children and as the adult
		//you get to keep the remaining cookies to yourself
		//use a conditional to print the following based on the following conditions:
		//if there are 0 cookies remaining, print "Sad Face"
		//if there are less than 2 cookies, print "Yes!"
		//if there are less than 5 cookies, print "Whoohooo!"
		//if there are 5 or more cookies, print "Jackpot!"
		//division and use remainders = use module
		
		int numberOfCookies = 7;
		int numberOfChildren = 2;
		
		/*or save value in another variable eg int remainingCookies = numberOfCookies % numberOfChildren 
		and replace numberOfCookies % numberOfChildren with remainingCookies */
		
		if (numberOfCookies % numberOfChildren >= 5) {
			System.out.println("Jackpot!");
		} else if (numberOfCookies % numberOfChildren >=2) {
			System.out.println("Whooohooo!");
		} else if (numberOfCookies % numberOfChildren >0) {
			System.out.println("Yes!");
		} else {
			System.out.println("Sad Face");
		}
		
		//Create a variable called loyaltyMemberStatus and assign the value "SILVER"
		//Create a variable called loyaltyMemberDiscount and assign the value 0.0
		//using a switch set the value of loyaltyMemberDiscount based on the following loyaltyMemberStatus scale
		//"SILVER" is 0.10, "GOLD" is 0.15, and "PLATINUM" is 0.25
		
		String loyaltyMemberStatus ="SILVER";
		double loyaltyMemberDiscount = 0.0;
		
		//switch(variable){case: statement; break; default;}
		
		switch(loyaltyMemberStatus) {
			case "SILVER": 
				loyaltyMemberDiscount = .10;
				break;
			case "GOLD":
				loyaltyMemberDiscount = .15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = .25;
				break;
		}
		
		System.out.println(loyaltyMemberDiscount);		
		   
	//create a variable called billTotal and assign a value
	//create a variable called adjustedTotal and assign it the billTotal minus the loyatyMemberDiscount percent of the billTotal
	//if the adjustedBillTotal is greater than $500 upgrade the loyaltyMemberStatus from SILVER to GOLD to PLATINUM
	
	double billTotal = 640.50;
	double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
	System.out.println(adjustedTotal);
	
	if (adjustedTotal > 500) {
		if (loyaltyMemberStatus == "SILVER") {
			loyaltyMemberStatus = "Gold";
			} else if (loyaltyMemberStatus == "GOLD") {
			loyaltyMemberStatus = "PLATINUM";
		  }
		}
	 System.out.println(loyaltyMemberStatus);
	 
	 //create two variables username and password
	 //create a conditional that prints "login successful" if the username is Tommy123 and the password is "12345"
	//print access denied
	 
	 
	 String username = "Tommy123";
	 String password = "12345";
	 
	 if (username == "Tommy123" && password == "12345") {
		 System.out.println("Login Successful");
	 } else {
		 System.out.println("Acess denied.");
	 }
	 
	 
	}
}

