package com.ashokit.designpattern.behaviours.iterator;

// InsurancePolicy Class (Individual Element)
class InsurancePolicy {
    private String policyNumber;
    private String policyHolderName;

    public InsurancePolicy(String policyNumber, String policyHolderName) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    @Override
    public String toString() {
        return "PolicyNumber: " + policyNumber + ", PolicyHolder: " + policyHolderName;
    }
}

// Iterator Interface
interface Iterator {
    boolean hasNext();
    Object next();
}

// PolicyCollection Class (Collection of Policies)
class PolicyCollection {
    private InsurancePolicy[] policies;
    private int index = 0;

    public PolicyCollection(int size) {
        policies = new InsurancePolicy[size];
    }

    public void addPolicy(InsurancePolicy policy) {
        if (index < policies.length) {
            policies[index++] = policy;
        } else {
            System.out.println("Policy collection is full!");
        }
    }

    public Iterator getIterator() {
        return new PolicyIterator();
    }

    // Inner class implementing the Iterator
    private class PolicyIterator implements Iterator {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < policies.length && policies[currentIndex] != null;
        }

        @Override
        public Object next() {
            return policies[currentIndex++];
        }
    }
}

// Main Class (Client)
 class Main {
    public static void main(String[] args) {
        // Create a collection of policies
        PolicyCollection policyCollection = new PolicyCollection(3);
        policyCollection.addPolicy(new InsurancePolicy("P123", "John Doe"));
        policyCollection.addPolicy(new InsurancePolicy("P124", "Jane Smith"));
        policyCollection.addPolicy(new InsurancePolicy("P125", "Alice Brown"));

        // Get the iterator and traverse the policies
        Iterator policyIterator = policyCollection.getIterator();
        while (policyIterator.hasNext()) {
            System.out.println(policyIterator.next());
        }
    }
}
