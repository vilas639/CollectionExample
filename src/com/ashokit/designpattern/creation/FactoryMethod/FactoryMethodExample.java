package com.ashokit.designpattern.creation.FactoryMethod;

public class FactoryMethodExample {

	
	     //create a interface
		//implement 3 class implement method 
		//create a factory class createNotification method with equal conditions
		//call this parent child releation in main method 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory1 factory = new Factory1();
		
		 Notification notification = factory.createNotification("SMS");
	        if (notification != null) {
	            notification.notifyUser();
	        } else {
	            System.out.println("Invalid notification type.");
	        }

	}
	
	
	 // Interface
    interface Notification {
        void notifyUser();
    }
	
	
 // SMS Notification implementation
    static   class SmsNotification implements Notification {
        @Override
        public void notifyUser() {
            System.out.println("SMS notification is created.");
        }
    }
    
    
 // Email Notification implementation
    static   class EmailNotification implements Notification {
        @Override
        public void notifyUser() {
            System.out.println("Email notification is created.");
        }
    }

    
 // Push Notification implementation
    static  class PushNotification implements Notification {
        @Override
        public void notifyUser() {
            System.out.println("Push notification is created.");
        }
    }
	
    // Factory class
    static  class Factory1 {
        public Notification createNotification(String notificationType) {
            if (notificationType == null || notificationType.isEmpty()) {
                return null;
            }
            switch (notificationType) {
                case "SMS":
                    return new SmsNotification();
                case "Email":
                    return new EmailNotification();
                case "Push":
                    return new PushNotification();
                default:
                    return null;
            }
        }
    }

}
