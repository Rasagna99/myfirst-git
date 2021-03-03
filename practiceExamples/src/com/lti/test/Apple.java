package com.lti.test;

import java.util.Arrays;
import java.util.List;

public class Apple {

		private String color;
		private Double weight;

		public Apple(String c, Double w) {
			this.color = c;
			this.weight = w;
		}

		public String toString() {
			return "Apple{color:" + this.getColor() + ",weight:" + this.getWeight() + "}";
		}
		//getters&setters
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public Double getWeight() {
			return weight;
		}

		public void setWeight(Double weight) {
			this.weight = weight;
		}
		
		public static void main(String[] args) {
			List<Apple> apples = Arrays.asList(new Apple("green", 120.0), new Apple("red", 110.0),
					new Apple("brown", 150.0), new Apple("green", 160.0), new Apple("red", 122.0));
			ApplePredicate.filterApples(apples, ApplePredicate.isWeightAbove150()).forEach(System.out::println);
		}
	}

