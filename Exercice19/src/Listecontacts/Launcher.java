package Listecontacts;

import.Contacts.java;

public class Launcher {

	public static void main(String[] args) {
		Contact[] contacts = new Contact [100];
		
		
		ArrayList<String>contacts = new ArrayList <>();
		Contacts ContactSupplementaire = new Contact ();
		ContactSupplementaire.setContact ("nouveau contact:");
		ContactSupplementaire.setNomContact ("nom du nouveau contact:");
		ContactSupplementaire.setAdresseMail("nouvelle adresse mail:");
		Contact.setnumeroTelephone("nouveau numéro de téléphone:");
		
		Contacts.add(contactsupplementaire(i));
		for (i=0, i<3, i++);
				System.out.Sprintln("nouveau contact(i)");
				String contactsupplementaire = scanner.nextline();	
		
		System.out.println("Taille contacts : "+ contacts.size());
		contacts.Add(contactsupplementaire);
		System.out.println("Taille contacts : "+ contacts.size());
		contacts.remove(contactsupplementaire);
		System.out.println("Taille contacts : "+ contacts.size());
		contacts.Add(contactsupplementaire);

	}

}
