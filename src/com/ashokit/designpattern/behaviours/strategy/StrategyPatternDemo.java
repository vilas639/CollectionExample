package com.ashokit.designpattern.behaviours.strategy;

public class StrategyPatternDemo {

    /*
    Payment Systems: In an e-commerce system, different payment methods (credit card, PayPal, cryptocurrency, etc.) can be handled using different strategies.
Sorting Algorithms: You can switch between different sorting algorithms (quick sort, bubble sort, merge sort, etc.) based on the dataset or performance requirements.
Route Planning: In navigation systems, different routing strategies (fastest route, shortest route, scenic route) can be chosen based on user preferences.
     */
    public static void main(String[] args) {
        // Create the context with StandardShipping strategy
        ShippingContext context = new ShippingContext(new StandardShipping());

        double weight = 10.0;  // Example weight (10 kg)

        // Calculate shipping cost using Standard Shipping
        System.out.println("Standard Shipping Cost: " + context.calculateShipping(weight));

        // Switch to Express Shipping strategy
        context.setShippingStrategy(new ExpressShipping());
        System.out.println("Express Shipping Cost: " + context.calculateShipping(weight));

        // Switch to International Shipping strategy
        context.setShippingStrategy(new InternationalShipping());
        System.out.println("International Shipping Cost: " + context.calculateShipping(weight));
    }
}

interface ShippingStrategy {
    double calculateShippingCost(double weight);
}

// Concrete Strategy 1: Standard Shipping
class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 5.0;  // Standard shipping cost = weight * 5
    }
}

// Concrete Strategy 2: Express Shipping
class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 10.0;  // Express shipping cost = weight * 10
    }
}

// Concrete Strategy 3: International Shipping
class InternationalShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 20.0;  // International shipping cost = weight * 20
    }
}

class ShippingContext {
    private ShippingStrategy strategy;

    // Constructor to initialize the strategy
    public ShippingContext(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    // Method to calculate shipping cost using the selected strategy
    public double calculateShipping(double weight) {
        return strategy.calculateShippingCost(weight);
    }

    // Method to change the strategy at runtime
    public void setShippingStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }
}
