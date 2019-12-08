import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class PhoneBookApp {

    public static void main(String[] args) throws IOException {

        String name;
        int number;

        File file = new File("data.txt");
        Scanner data = new Scanner(file);

        ArrayList<PhoneBookEntry> phoneBook = new ArrayList<>();

        while(data.hasNext()){

            name = data.nextLine();

            number = Integer.parseInt(data.nextLine());

            phoneBook.add(new PhoneBookEntry(name, number));
        }

        data.close();

        System.out.println("Entries in Phone Book:\n");

        for (PhoneBookEntry print: phoneBook){

            System.out.print(print);

        }

    }

}
