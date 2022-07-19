package com.example.homework;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class HomeworkApplication {

	public static void main(String[] args) {

	}

	public static void ListAllObject(List<Voiture> voitures)
	{
		voitures.forEach( (n) -> { System.out.println(n.toString());});
	}

	public static Voiture createCargo(int makeyear, Voiture.Color color)
	{
		return new Voiture(makeyear, 6, 50, color);
	}

	public static Voiture createPersonal(int makeyear, Voiture.Color color)
	{
		return new Voiture(makeyear, 4, 17, color);
	}

	public List<Transac> findAllTransactionIn2011AndSortByValueASC(List<Transac> transactions)
	{
		List<Transac> t = transactions
				.stream()
				.filter((x) -> x.getYear() == 2011)
				.sorted(Comparator.comparingDouble(Transac::getValeur)).toList();
		Collections.reverse(transactions);
		return transactions;
	}

	public List<String> getUniqueCitiesSortedASC(List<Transac> transactions)
	{
		List<String> t = transactions
				.stream()
				.map(Transac::getTrader)
				.toList()
				.stream()
				.map(Creancier::getVille)
				.distinct()
				.toList();

		Collections.sort(t);
		Collections.reverse(t);
		return t;
	}

	public String getSingleStringFromUniqueTradersNameSortByNameASC(List<Transac> transactions)
	{
		String result = transactions
				.stream()
				.map(Transac::getTrader)
				.toList()
				.stream()
				.map(Creancier::toString)
				.distinct()
				.reduce("", (a, e) -> a + " " + e);

		return result;
	}

}
