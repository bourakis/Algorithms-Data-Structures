package stacktest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackString 
{

    public static void main(String[] args)
    {
        Stack<String> stackOfCards = new Stack<>();

        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        System.out.println("Stack is: " + stackOfCards);
        System.out.println("");

        // η κλάση Stack έχει τη μέθοδο pop()η οποία
        // επιστρέφει και διαγράφει το πρώτο στοιχείο (πάνω-πάνω)
        // που είναι στο stack
        String cardAtTop = stackOfCards.pop();

        System.out.println("Το χαρτι στην κορυφή είναι: " + cardAtTop);

        // Η μέθοδος peek() επιστρέφει το 1ο στοιχείο, χωρίς να το κάνει delete
        System.out.println("Το χαρτι στην κορυφή είναι: " + stackOfCards.peek());

		    // Η isEmpty() ελέγχει αν το stack είναι κενό ή όχι (booblean)
        System.out.println("Is stack empty? " + stackOfCards.isEmpty());

		    // H size() επιστρέφει το πλήθος στοιχείων του stack
        System.out.println("Το πλήθος στοιχείων του stack είναι: " + stackOfCards.size());

        int position = stackOfCards.search("Jack");

        System.out.println("βρίσκεται στη θέση: " + position);

        if (position != -1)
        {
            System.out.println("Το στοιχείο βρέθηκε στη θέση: " + position);
        }
        else
        {
            System.out.println("Το στοιχείο δε βρέθηκε");
        }

		// και δύο τρόποι να περνάμε ένα ένα με τη σειρά (traverse) από τα
		// στοιχεία του stack
        Iterator<String> card = stackOfCards.iterator();
        System.out.println("");

        while (card.hasNext())
        {
            String current_card = card.next();
            System.out.println(current_card);

        }

        System.out.println("");
        ListIterator<String> lcard = stackOfCards.listIterator(stackOfCards.size());

        while (lcard.hasPrevious())
        {
            String current_card = lcard.previous();
            System.out.println(current_card);
        }
    }
}
