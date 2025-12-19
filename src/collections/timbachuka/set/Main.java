package collections.timbachuka.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

        LinkedHashSet<Integer> list  ;
        TreeSet<Integer> r ;


        //printDate("Phone List", phones);
        printDate("Email List" , emails);


        Set<Contact> emailContact = new HashSet<>(emails);

        printDate("Email List" , emailContact);

        /*
        Set<Contact> phoneContact = new HashSet<>(phones);

        printDate("Phone List", phoneContact);
        printDate("Email List" , emailContact);

       //System.out.println(emailContact.getClass());

       Contact newContact = new Contact("Robin Hood") ;
       int index = emails.indexOf(newContact) ;

       Contact robinHood = emails.get(index);
       robinHood.addEmail("Sherwood Forest");
       robinHood.addEmail("Sherwood Forest");

       robinHood.replaceEmailIfExists("RHood@sherwoodforest.com", "RHood@sherwoodforest.org");
       System.out.println(robinHood);

        printDate("Phone List", phoneContact);
        printDate("Email List" , emailContact);

        HashSet<Contact> unionAB = new HashSet<>() ;
        unionAB.addAll(phoneContact) ;
        unionAB.addAll(emailContact) ;
        printDate(" (A U B ) Union of emails and phones ",unionAB) ;


        HashSet<Contact> interestAB = new HashSet<>(phoneContact);
        interestAB.retainAll(emailContact) ;
        printDate(" (A interest B ) Interesting of emails and phones ",interestAB) ;

        HashSet<Contact> AminusB = new HashSet<>(phoneContact);
        AminusB.removeAll(emailContact) ;
        printDate(" (A - B ) Subtracting emails - phones ",AminusB) ;

       // System.out.println(unionAB.containsAll(unionAB));

         */

    }
    public static void printDate(String header , Collection<Contact> contacts ){
        System.out.println("-------------------------------------------------");
        System.out.println(header);
        System.out.println("--------------------------------------------------");
        contacts.forEach(System.out::println);
    }
}
