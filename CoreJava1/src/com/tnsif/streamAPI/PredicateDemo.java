package com.tnsif.streamAPI;
//to demonstrate predicate interface
import java.util.function.Predicate;

public class PredicateDemo {
public static void main(String[] args) {
	Predicate<Integer>pr=a->(a>10);//creating predicate
	System.out.println(pr.test(3));
	}
}
