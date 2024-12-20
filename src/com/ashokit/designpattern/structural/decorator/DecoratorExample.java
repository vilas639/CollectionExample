package com.ashokit.designpattern.structural.decorator;


//create a interface
//implement the interface
//creat abstract class with implement interface 
//create a additonal class for feture 
//now run code

public class DecoratorExample {
	
	
	
	public static void main(String[] args) {
        // Basic policy
        InsurancePolicy basicPolicy = new BasicPolicy();
        System.out.println("Policy: " + basicPolicy.getDetails());
        System.out.println("Cost: " + basicPolicy.getCost());

        // Adding accident coverage dynamically
        InsurancePolicy accidentPolicy = new AccidentCoverageDecorator(basicPolicy);
        System.out.println("Policy: " + accidentPolicy.getDetails());
        System.out.println("Cost: " + accidentPolicy.getCost());
    }
	
	

}

//Component
 interface InsurancePolicy {
	 
 String getDetails();
 double getCost();
 
}
 
 
//Concrete Component
 class BasicPolicy implements InsurancePolicy {
  @Override
  public String getDetails() {
      return "Basic Insurance Policy";
  }

  @Override
  public double getCost() {
      return 5000.0; // Base cost of the policy
  }
}
 
 
//Decorator
 abstract class PolicyDecorator implements InsurancePolicy {
  protected InsurancePolicy policy;

  public PolicyDecorator(InsurancePolicy policy) {
      this.policy = policy;
  }

  @Override
  public String getDetails() {
      return policy.getDetails();
  }

  @Override
  public double getCost() {
      return policy.getCost();
  }
}

 
//Concrete Decorator
 class AccidentCoverageDecorator extends PolicyDecorator {
  public AccidentCoverageDecorator(InsurancePolicy policy) {
      super(policy);
  }

  @Override
  public String getDetails() {
      return super.getDetails() + " + Accident Coverage";
  }

  @Override
  public double getCost() {
      return super.getCost() + 2000.0; // Additional cost for accident coverage
  }
}

 
 




