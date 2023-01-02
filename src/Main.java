public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");

        PhoneBook phoneBook = new PhoneBook();
        for (int i = 0; i < 10; i++) {
            long number = 89633181603L;
            phoneBook.add("ФИО " + (i + 1), String.format(String.valueOf(number + i)));
        }
        phoneBook.print();
    }
}