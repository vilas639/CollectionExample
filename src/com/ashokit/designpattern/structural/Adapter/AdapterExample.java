package com.ashokit.designpattern.structural.Adapter;

public class AdapterExample {
	
	public static void main(String[] args) {
        // Use Paytm for payment
        PaymentGateway paytmGateway = new PaytmAdapter("9876543210");
        paytmGateway.pay(500.0);

        // Use Razorpay for payment
        PaymentGateway razorpayGateway = new RazorpayAdapter("user@example.com");
        razorpayGateway.pay(1000.0);
    }

}


//Target Interface
 interface PaymentGateway {
 void pay(double amount);
}

 
//Adaptee 1
 class Paytm {
  public void makePayment(String mobileNumber, double amount) {
      System.out.println("Payment of Rs. " + amount + " made via Paytm using mobile: " + mobileNumber);
  }
}
 
 
//Adaptee 2
 class Razorpay {
  public void processPayment(String email, double amount) {
      System.out.println("Payment of Rs. " + amount + " made via Razorpay using email: " + email);
  }
}


 
//Adapter for Paytm
 class PaytmAdapter implements PaymentGateway {
  private Paytm paytm;
  private String mobileNumber;

  public PaytmAdapter(String mobileNumber) {
      this.paytm = new Paytm();
      this.mobileNumber = mobileNumber;
  }

  @Override
  public void pay(double amount) {
      paytm.makePayment(mobileNumber, amount);
  }
}
 
 
//Adapter for Razorpay
 class RazorpayAdapter implements PaymentGateway {
  private Razorpay razorpay;
  private String email;

  public RazorpayAdapter(String email) {
      this.razorpay = new Razorpay();
      this.email = email;
  }

  @Override
  public void pay(double amount) {
      razorpay.processPayment(email, amount);
  }
}

