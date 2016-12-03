package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import main.MainController;

import main.MainControllerSays;

public class StudyCards {
	public HashMap<String, String> biology = new HashMap<String, String>();
	public HashMap<String, String> math = new HashMap<String, String>();
	public HashMap<String, String> history = new HashMap<String, String>();
	
	public void populateCollections(HashMap biology, HashMap math, HashMap history) {
		biology.put("Capillarity", "the property of water to be able to use adhesion and cohesion to move through narrow tubes against the force of gravity");
		biology.put("ATP", "Adenosine Triphosphate, a type of compound that contains large amounts of energy");
		biology.put("Macromolecule", "a type of polymer that is large");
		
		math.put("expression", "a string of variables and numbers connected by mathmatical operators.");
		math.put("operator", "a symbol that signifies what action should be taken with the numbers and variables.");
		math.put("polynomial", "The sum or difference of terms which have variables raised to positive integer powers and which have coefficients that may be real or complex.");
		
		history.put("Enlightenment", "A period from the late 1600s to 1700s that marked a new way of thinking in which people questioned what they knew and began centering their thinking around reason rather than accepting popular belief.");
		history.put("Thomas Paine's Common Sense", "1776. Pamphlet urging the colonies to declare independence and establish a republican government. The widely read pamphlet helped convince colonists to support the Revolution.");
		history.put("Articles of Confederation", "1781. First American constitution that established the United States as a loose confederation of states under a weak national Congress, which was not granted the power to regulate commerce or collect taxes. The Articles were replaced by a more efficient Constitution in 1789.");
	}
	
	public void addCollection(String newHash){
		//Code block for adding collections.
	}
	
	public void addCard(HashMap chosenHash){
		//Code block for adding a card to a collection.
	}
	
	public void studyCollection(HashMap chosenHash) {
		Set keys = chosenHash.keySet();
		for (Iterator i = keys.iterator(); i.hasNext();) {
			String term = (String) i.next();
			String definition = (String) chosenHash.get(term);
			System.out.println(term);
			System.out.println(definition);
		}
		/*
		int i = 0;
		while (i <= chosenHash.size()){
		}
		*/
	}
	
}
