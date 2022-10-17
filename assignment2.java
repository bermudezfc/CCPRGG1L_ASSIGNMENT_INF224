public class assignment2 {
    public static void main(String[] args) throws Exception {
        
        // Use a while loop to print your FIRSTNAME three times.

        int countOne = 0;

        while (countOne != 3) {
            System.out.println("Fortune Raphael");
            countOne ++;
        }

        // Use a do-while loop to print your MIDDLENAME four times.

        int countTwo = 0;

        do {
            System.out.println("Cruz");
            countTwo ++;
        } while (countTwo != 4);

        // Use a for loop to print your SURNAME five times.

        for (int countThree = 0; countThree != 5; countThree ++) {
            System.out.println("Bermudez");
        }

        // Create a char array that consists all of the characters of your FIRSTNAME and use a for loop to print each character of your FIRSTNAME. (example: ELIZER)

        char firstname[] = {'F', 'O', 'R', 'T', 'U', 'N', 'E', ' ', 'R', 'A', 'P', 'H' , 'A', 'E', 'L'};

        for (int countFour = 0; countFour != firstname.length; countFour ++) {
            System.out.print(firstname[countFour]);
        }

        System.out.println();
        // Use a for loop to print the char array of your FIRSTNAME in REVERSE order (example: REZILE)

        
        for (int countFive = 14; countFive > -1; countFive --) {
            System.out.print(firstname[countFive]);
        }

    }
}
