package com.example.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream()
		       .filter(n -> n % 2 == 0)
		       .forEach(System.out::println);
		
		
//		Q: How do you use the Streams API to find the sum of squares of a list of integers?
//				A:
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4);
		int sumOfSquares = numbers1.stream()
		                          .map(n -> n * n)
		                          .reduce(0, Integer::sum);
		System.out.println(sumOfSquares); // Outputs 30
		
		
		
//		Q: How do you safely handle a null value using Optional?
//				A:

				Optional<String> name = Optional.ofNullable(null);
				String result = name.orElse("Default Name");

				System.out.println(result); // Outputs "Default Name"
				
//				Q: How do you group a list of strings by their length using Streams?
//						A:

						List<String> words = Arrays.asList("apple", "banana", "cat");
						Map<Integer, List<String>> groupedByLength = words.stream()
						                                                  .collect(Collectors.groupingBy(String::length));
						System.out.println(groupedByLength); // Outputs {3=[cat], 5=[apple], 6=[banana]}		
						
//						10. Stream Filter
//						Q: How do you filter a list of strings to only include those starting with "A"?
//						A:

						List<String> names1 = Arrays.asList("Alice", "Bob", "Amanda");
						names1.stream()
						     .filter(n -> n.startsWith("A"))
						     .forEach(System.out::println);	
						
//						Q: How can flatMap be used to flatten a list of lists?
//								A:


								List<List<String>> nestedList = Arrays.asList(Arrays.asList("A", "B"), Arrays.asList("C", "D"));
								List<String> flatList = nestedList.stream()
								                                  .flatMap(List::stream)
								                                  .collect(Collectors.toList());
								System.out.println(flatList); // Outputs [A, B, C, D]	
								
//								13. CompletableFuture
//								Q: How do you run two asynchronous tasks and combine their results?
//								A:

								CompletableFuture<Integer> task1 = CompletableFuture.supplyAsync(() -> 10);
								CompletableFuture<Integer> task2 = CompletableFuture.supplyAsync(() -> 20);
								CompletableFuture<Integer> result1 = task1.thenCombine(task2, Integer::sum);
								System.out.println(result1.join()); // Outputs 30		
								
								
//								17. Stream Peek
//								Q: How can you debug a stream pipeline?
//								A: Use peek to inspect elements.
								
								numbers.stream()
							       .peek(System.out::println)
							       .map(n -> n * n)
							       .peek(System.out::println)
							       .collect(Collectors.toList());
								
								
	}

}
