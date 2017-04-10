package by.htp.fraction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		int k = 15;
		Fraction[] fractions = new Fraction[k];

		for (int i = 0; i < fractions.length; i++) {
			fractions[i] = new Fraction((int) (Math.random() * i + 1), (int) (Math.random() * i + 1));
		}
		System.out.println("original array:");
		for (int i = 0; i < fractions.length; i++) {
			System.out.print(fractions[i] + " ");
		}

		arrayChanger(fractions);

		List<Fraction> fractionsList = new ArrayList<>(Arrays.asList(fractions));
		System.out.println("\n Original list:");
		for (Fraction a : fractionsList) {
			System.out.print(a + " ");
		}

		arrayChanger(fractionsList);

		System.out.println("\n original set");
		Set<Fraction> fractionSet = new HashSet<>(fractionsList);
		for (Fraction a : fractionSet) {
			System.out.print(a + " ");
		}

		arrayChanger(fractionSet);
	}

	public static void arrayChanger(Fraction[] fractions) {
		for (int i = 1; i < fractions.length - 1; i += 2) {
			if (i != fractions.length) {
				fractions[i].setM(fractions[i].getM() + fractions[i + 1].getM());
				fractions[i].setN(fractions[i].getN() + fractions[i + 1].getN());
			}
		}
		System.out.println();
		for (int i = 0; i < fractions.length; i++) {
			System.out.print(fractions[i] + " ");
		}
	}

	public static void arrayChanger(Collection<Fraction> collection) {
		if (collection instanceof List) {
			ArrayList<Fraction> tempList = (ArrayList<Fraction>) collection;
			for (int i = 1; i < tempList.size() - 1; i += 2) {
				tempList.get(i).setM(tempList.get(i).getM() + tempList.get(i + 1).getM());
				tempList.get(i).setN(tempList.get(i).getN() + tempList.get(i + 1).getN());
			}
			System.out.println();
			for (Fraction a : tempList) {
				System.out.print(a + " ");
			}
		}
		if (collection instanceof Set) {
			HashSet<Fraction> tempSet = (HashSet<Fraction>) collection;
			ArrayList<Fraction> newSet = new ArrayList<>(tempSet);
			for (int i = 1; i < newSet.size() - 1; i += 2) {
				newSet.get(i).setM(newSet.get(i).getM() + newSet.get(i + 1).getM());
				newSet.get(i).setN(newSet.get(i).getN() + newSet.get(i + 1).getN());
			}
			tempSet.clear();
			for (Fraction b : newSet) {
				tempSet.add(b);
			}
			System.out.println();
			for (Fraction a : newSet) {
				System.out.print(a + " ");
			}
			System.out.println();
			for (Fraction a : tempSet) {
				System.out.print(a + " ");
			}
		}

		System.out.println("Yaremenko. Got task 06.04.2017. Finished task 09.04.2017.");

	}

}
