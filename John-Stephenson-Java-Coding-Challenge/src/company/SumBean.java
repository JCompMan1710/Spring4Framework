package company;

import javax.faces.bean.*;

@ManagedBean 
public class SumBean { 
    private String num1Sum = "0", num3Sum = "0", num5Sum = "0";
    private String num2Sum = "1000", num4Sum = "500", num6Sum = "300";
    private double total = 2300, num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, sumTotal = 0, devTest = 0, devMgr = 0, testMgr = 0;
    private int dev = 0, test = 0, mgr = 0;

// DEVELOPER
    public String getNum1Sum() {
        return(num1Sum);
    }
    public void setNum1Sum(String num1Sum) {
        this.num1Sum = num1Sum;
        try {
            num1 = Double.parseDouble(num1Sum);
        } catch(Exception e) {}
    }
    public String getNum2Sum() {
        return(num2Sum);
    }
    public void setNum2Sum(String num2Sum) {
        this.num2Sum = num2Sum;
        try {
            num2 = Double.parseDouble(num2Sum);
        } catch(Exception e) {}
    }
// END DEVELOPER

 // TESTER
    public String getNum3Sum() {
        return(num3Sum);
    }
    public void setNum3Sum(String num3Sum) {
        this.num3Sum = num3Sum;
        try {
            num3 = Double.parseDouble(num3Sum);
        } catch(Exception e) {}
    }
    public String getNum4Sum() {
        return(num4Sum);
    }
    public void setNum4Sum(String num4Sum) {
        this.num4Sum = num4Sum;
        try {
            num4 = Double.parseDouble(num4Sum);
        } catch(Exception e) {}
    }
// END TESTER

// MANAGER
    public String getNum5Sum() {
        return(num5Sum);
    }
    public void setNum5Sum(String num5Sum) {
        this.num5Sum = num5Sum;
        try {
            num5 = Double.parseDouble(num5Sum);
        } catch(Exception e) {}
    }
    public String getNum6Sum() {
        return(num6Sum);
    }
    public void setNum6Sum(String num6Sum) {
        this.num6Sum = num6Sum;
        try {
            num6 = Double.parseDouble(num6Sum);
        } catch(Exception e) {}
    }
// END MANAGER

    public Object getSum() {
    	double devSum = (num1 * num2);
    	double testSum = (num3 * num4);
    	double mgrSum = (num5 * num6);
    	sumTotal = (devSum + testSum + mgrSum);
    	devTest = (devSum + testSum);
    	devMgr = (devSum + mgrSum);
    	testMgr = (testSum + mgrSum);

    	if(((num1 * num2) > total) && (num3 == 0) && (num5 == 0)) {
    		dev = (int) num1;
    		test = (int) num3;
    		mgr = (int) num5;
            System.out.println("Developer total is: " + dev);
            System.out.println("Tester total is: " + test);
            System.out.println("Manager total is: " + mgr);
        } else if((((num1 * num2) <= total) && (num1 != 0)) && (num3 == 0) && (num5 == 0)) {
    		dev = (int) num1;
    		test = (int) num3;
    		mgr = (int) num5;
            System.out.println("Developer total is: " + dev);
            System.out.println("Tester total is: " + test);
            System.out.println("Manager total is: " + mgr);
        } else if((((num1 != 0) && (num5 != 0) && (num1 * num2) + (num5 * num6) <= total)) && (num3 == 0)) {
    		dev = (int) num1;
    		test = (int) num3;
    		mgr = (int) num5;
            System.out.println("Developer total is: " + dev);
            System.out.println("Tester total is: " + test);
            System.out.println("Manager total is: " + mgr);
        } else if((((num3 * num4) <= total) && (num3 != 0)) && (num1 == 0) && (num5 == 0)) {
    		dev = (int) num1;
    		test = (int) num3;
    		mgr = (int) num5;
            System.out.println("Developer total is: " + dev);
            System.out.println("Tester total is: " + test);
            System.out.println("Manager total is: " + mgr);
        } else if((((num5 * num6) <= total) && (num5 != 0)) && (num3 == 0) && (num1 == 0)) {
    		dev = (int) num1;
    		test = (int) num3;
    		mgr = (int) num5;
            System.out.println("Developer total is: " + dev);
            System.out.println("Tester total is: " + test);
            System.out.println("Manager total is: " + mgr);
        } else if(((num1 * num2) + (num3 * num4) <= total) && (num5 == 0)) {
    		dev = (int) num1;
    		test = (int) num3;
    		mgr = (int) num5;
            System.out.println("Developer total is: " + dev);
            System.out.println("Tester total is: " + test);
            System.out.println("Manager total is: " + mgr);
        } else if((((num1 != 0) && (num3 != 0) && (num5 != 0)) && ((num1 * num2) + (num3 * num4) + (num5 * num6) <= total))) {
    		dev = (int) num1;
    		test = (int) num3;
    		mgr = (int) num5;
            System.out.println("Developer total is: " + dev);
            System.out.println("Tester total is: " + test);
            System.out.println("Manager total is: " + mgr);
        } else if(((num3 != 0) && (num5 != 0) && (num3 * num4) + (num5 * num6) <= total) && (num1 == 0)) {
    		dev = (int) num1;
    		test = (int) num3;
    		mgr = (int) num5;
            System.out.println("Developer total is: " + dev);
            System.out.println("Tester total is: " + test);
            System.out.println("Manager total is: " + mgr);
        }

    	if(((num1 * num2) > total) && (num3 == 0) && (num5 == 0)) {
            return"You must select fewer Developers.";
        } else if(((((num1 != 0) && (num3 != 0) && (num1 * num2) + (num3 * num4) > total) && (num5 == 0)))) {
        	return"You must select fewer Developers and QA Testers.";
        } else if((((num1 != 0) && (num3 != 0) && (num5 != 0) && (num1 * num2) + (num3 * num4) + (num5 * num6) > total))) {
            return"You must select fewer Developers, QA Testers, and Managers.";
        } else if((((((num1 * num2) + (num5 * num6)) > total) && (num1 != 0) && (num5 != 0)) && (num3 == 0))) {
            return"You must select fewer Developers and Managers.";
        } else if((((num1 * num2) <= total) && (num1 != 0)) && (num3 == 0) && (num5 == 0)) {
    	    return(devSum);
        } else if((((num1 != 0) && (num5 != 0) && (num1 * num2) + (num5 * num6) <= total)) && (num3 == 0)) {
            return(devMgr);
        } else if((((((num3 * num4) + (num5 * num6)) > total) && (num3 != 0) && (num5 != 0)) && (num1 == 0))) {
            return"You must select fewer QA Testers and Managers.";
        } else if((num3 * num4) > total) {
            return"You must select fewer QA Testers.";
        } else if((((num3 * num4) <= total) && (num3 != 0)) && (num1 == 0) && (num5 == 0)) {
            return(testSum);
        } else if((num5 * num6) > total) {
            return"You must select fewer Managers.";
        } else if((((num5 * num6) <= total) && (num5 != 0)) && (num3 == 0) && (num1 == 0)) {
            return(mgrSum);
        } else if(((num1 * num2) + (num3 * num4) <= total) && (num5 == 0)) {
            return(devTest);
        } else if((((num1 != 0) && (num3 != 0) && (num5 != 0)) && ((num1 * num2) + (num3 * num4) + (num5 * num6) <= total))) {
        	return(sumTotal);
        } else if(((num3 != 0) && (num5 != 0) && (num3 * num4) + (num5 * num6) <= total) && (num1 == 0)) {
            return(testMgr);
        }
        return(0);
    }
}