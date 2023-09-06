package tek.week_2.day1;

public class StringManipulation {
/*
    String manipulation refers to the various operations and techniques you can apply to modify, analyze,
    or get information from strings. In the realm of programming,
     especially with a language like Java, strings are one of the most frequently used data types,
      and the ability to skillfully handle and transform them is vital.

      Think of string manipulation like working with clay. You start with a lump of clay (the string),
      and you can mold it, reshape it, combine it with other pieces, or even extract parts of it to
      create something new.

*/

    public static void main(String[] args) {
        String firstName, lastName;
        firstName = "Taylor";
        lastName = "Smith";

        System.out.println(firstName);
        System.out.println(lastName);

        firstName = "Bob";
        lastName = "Martinez";

        System.out.println(firstName);
        System.out.println(lastName);

        // Concatenation
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat( " " + lastName));
        System.out.println(firstName.concat(" ").concat(lastName));

    }

}

