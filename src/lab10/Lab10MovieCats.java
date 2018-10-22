package lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab10MovieCats {
	// A scanner.
	static Scanner read = new Scanner(System.in);
	// List is used in multiple locations.
	static List<Movie> movList = new ArrayList<>();

	public static void main(String[] args) {
		// Movie Objects created for the sake of this exercise. Each is added to the
		// movList list.
		Movie coco = new Movie("Coco", "Animated");
		movList.add(coco);
		coco.setCat("Supernatural");
		coco.setCat("Family");
		Movie iHeart = new Movie("I <3 Huckabees", "Quirky");
		movList.add(iHeart);
		iHeart.setCat("Comedy");
		iHeart.setCat("Drama");
		Movie machGo = new Movie("Speed Racer", "Action");
		movList.add(machGo);
		machGo.setCat("Comedy");
		machGo.setCat("Family");
		Movie fightClub = new Movie("Fight Club", "Drama");
		movList.add(fightClub);
		fightClub.setCat("Thriller");
		Movie scott = new Movie("Scott Pilgrim vs. The World", "Action");
		movList.add(scott);
		scott.setCat("Comedy");
		scott.setCat("Coming of age");
		scott.setCat("Teen");
		Movie scream = new Movie("Scream", "Horror");
		movList.add(scream);
		scream.setCat("Thriller");
		scream.setCat("Teen");
		Movie nick = new Movie("Nick & Norah's Infinite Playlist", "Teen");
		movList.add(nick);
		nick.setCat("Romantic Comedy");
		nick.setCat("Coming of age");
		Movie fiveHun = new Movie("(500) Days of Summer", "Romantic Comedy");
		movList.add(fiveHun);
		fiveHun.setCat("Drama");
		fiveHun.setCat("Coming of Age");
		fiveHun.setCat("Quirky");
		Movie nightMare = new Movie("The Nightmare Before Christmas", "Animated");
		movList.add(nightMare);
		nightMare.setCat("Family");
		nightMare.setCat("Comedy");
		Movie ferris = new Movie("Ferris Bueller's Day Off");
		movList.add(ferris);
		ferris.setCat("Teen");
		ferris.setCat("Coming of age");
		ferris.setCat("Comedy");
//Menu is moved to it's own method for simplicity. 
		System.out.println(
				"Welcome to the movie list app! \n \nThere are currently " + movList.size() + " movies on the list.");
		menu();
	}

	private static void menu() {
		//Boolean for the loop.
		boolean finished = false;
		do {
			System.out.println(
					"If you would like to view a current the movies on the movie list, please type \"all\" \nIf you would like to see a list of the initial possible categories, please type \"categories\" \n\nTo search for films by category, please type the category, now\nTo exit the program, just type \"no\"");
			String menAns = read.nextLine();
			if (menAns.equalsIgnoreCase("all")) {
				listFormat();
			} else if (menAns.equalsIgnoreCase("categories") || menAns.equalsIgnoreCase("cats")) {
				catList();
			} else if (menAns.equalsIgnoreCase("no")) {
				finished = true;
			} else {
				seachCats(menAns);
			}
		} while (!finished);

	}
//Method displays movies with a particular category.
	private static void seachCats(String maybeCat) {
		System.out.println("List of " + maybeCat + " movies");
		System.out.println("===============================");
		int i;
		int x = 0;
		for (i = 0; i < movList.size(); i++) {
			if (movList.get(i).isCat(maybeCat)) {
				System.out.println(movList.get(i));
				x++;
			}
		}
		if (x == 0) {
			System.out.println("Sorry, there are no movies in that category.");
		}
	}
//Method displays a list of preset categories.
	private static void catList() {
		System.out.println("List of preset Categories");
		System.out.println("=========================");
		System.out.println(
				"Family\nTeen\nThriller\nAnimated\nSupernatural\nComedy\nDrama\nQuirky\nAction\nComing of age\nHorror\nRomantic Comedy\n\n");
	}
//Method produces a list of all movies.
	private static void listFormat() {
		System.out.println("List of all your movies");
		System.out.println("=======================");
		for (int i = 0; i < movList.size(); i++) {
			System.out.println(movList.get(i));
		}
	}
}
