package com.lti.test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Condition->I want to get the apples whose weight is above 150 grams,i'll write a Predicate
public class ApplePredicate {
	public static Predicate<Apple> isWeightAbove150() {
		return apple -> apple.getWeight() >= 150;
	}
// predicate in filter(), to filter a list of apples by the condition in this predicate.
	public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> predicate) {
		return apples.stream().filter(predicate).collect(Collectors.toList());
	}
}
