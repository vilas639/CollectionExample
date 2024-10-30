package com.ashokit.threadall.synchron;

import java.time.LocalDate;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class HDFCBANkReeadLock {
	
	
	double balance=0.0;
	
	ReentrantReadWriteLock l1 = new ReentrantReadWriteLock();
	
	
	void diposity(double i)
	{
		
		
		//l1.writeLock().unlock();
		
//		try
//		{
//			l1.writeLock().lock();
//			balance = balance+i;
//		}
//		catch(Exception e)
//		{
//			
//		}
//		finally {
//			l1.writeLock().unlock();
//		}
		
		
		
		l1.writeLock().lock();
		balance = balance+i;
		
		String dateString = "2024-10-30"; // ISO format (yyyy-MM-dd)
        LocalDate givenDate = LocalDate.parse(dateString);
		
		//LocalDate givenDate = LocalDate.of(2024, 10, 31); // Example date to check
		//LocalDate givenDate = LocalDate.of(2024, 10, 31); // Example date to check
        if (isCurrentDateGreaterThan(givenDate)) {
            System.out.println("old date.");
            l1.writeLock().unlock();
        } else {
            System.out.println("feture date.");
            l1.writeLock().unlock();
        }
			
		
	}
	
	
	public static boolean isCurrentDateGreaterThan(LocalDate givenDate) {
        LocalDate currentDate = LocalDate.now();
        return currentDate.isAfter(givenDate);
    }
	
	public static boolean isTomorrow(LocalDate date) {
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        return date.equals(tomorrow);
    }
	
	void fetchbalance()
	{
		l1.readLock().lock();
		System.out.println("total balance fetchbalance"+balance);
		
		l1.readLock().unlock();
	}
	
	
	void fetchbalancefromupi()
	{
		l1.readLock().lock();
		System.out.println("total balance fetchbalancefromupi"+balance);
		
		l1.readLock().unlock();
	}
	
	void fetchbalancefromnetbanking()
	{
		l1.readLock().lock();
		System.out.println("total balance fetchbalancefromnetbanking"+balance);
		
		l1.readLock().unlock();
	}
	
	public static void main(String[] args) {
		HDFCBANkReeadLock h= new HDFCBANkReeadLock();
		
		Thread t1 =new Thread(() -> h.diposity(100));
		
		Thread t2 =new Thread(() -> h.fetchbalance());
		Thread t3 =new Thread(() -> h.fetchbalancefromupi());
		Thread t4 =new Thread(() -> h.diposity(200));
		Thread t5 =new Thread(() -> h.fetchbalancefromnetbanking());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}
