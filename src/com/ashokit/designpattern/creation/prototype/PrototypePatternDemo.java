package com.ashokit.designpattern.creation.prototype;

public class PrototypePatternDemo {

/*
In this example, we're using shallow cloning, meaning the reference types (like strings) are simply copied. If you had mutable fields (like lists), you'd need to handle deep cloning to ensure that the clone does not share references with the original object.


 */
        public static void main(String[] args) {
            // Creating an initial network connection object
            NetworkConnection connection1 = new NetworkConnection("192.168.1.1", "255.255.255.0", "192.168.1.254");
            connection1.showConnectionDetails();

            // Cloning the initial connection object
            NetworkConnection connection2 = (NetworkConnection) connection1.clone();
            connection2.showConnectionDetails();

            // Modifying the cloned connection
            NetworkConnection connection3 = (NetworkConnection) connection1.clone();
            connection3.showConnectionDetails();
        }


}

// Step 1: Prototype Interface
interface Prototype extends Cloneable {
    Prototype clone();
}

// Step 2: Concrete Class (NetworkConnection) implementing the Prototype
class NetworkConnection implements Prototype {
    private String ipAddress;
    private String subnetMask;
    private String gateway;

    // Constructor to initialize connection settings
    public NetworkConnection(String ipAddress, String subnetMask, String gateway) {
        this.ipAddress = ipAddress;
        this.subnetMask = subnetMask;
        this.gateway = gateway;
    }

    // Implementing the clone method to create a copy of the object
    @Override
    public Prototype clone() {
        try {
            return (NetworkConnection) super.clone();  // Shallow copy
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    // Method to display connection details
    public void showConnectionDetails() {
        System.out.println("IP Address: " + ipAddress + ", Subnet Mask: " + subnetMask + ", Gateway: " + gateway);
    }
}
