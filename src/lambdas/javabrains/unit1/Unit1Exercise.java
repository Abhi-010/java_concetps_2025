package lambdas.javabrains.unit1;
import lambdas.javabrains.common.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {

	public static void main(String[] args) {
		List<lambdas.javabrains.common.Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		// Step 1: Sort list by last name

		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if(o1.getLastName().compareTo(o2.getLastName())  < 0){
					return -1;
				}
				else if(o1.getLastName().compareTo(o2.getLastName())  > 0){
					return 1;
				}
				return 0;
			}
		});

		// Step 2: Create a method that prints all elements in the list
		printPeople(people);

		// Step 3: Create a method that prints all people that have last name beginning with C

	}
	public static void printPeople(List<Person> people){
		for(Person person : people){
			System.out.println(person);
		}
	}

}
