package com.company;
import java.util.Scanner;


/*
 TODO Wczytywanie z pliku JSON listy uzytkowników
 TODO Interfejs z metodami (usun po id, znajdz po id) dziedziczenie po id w srodku interfejsu
*/
public class Main {

    public static void main(String[] args) {
        UserService userService = UserService.GetInstance();
        Scanner scanner = new Scanner(System.in);
        ProductService productService = ProductService.GetInstance();



        while (true) {
            System.out.println("1.Baza danych uzytkownikow \n2.Baza danych produktów");
            Boolean CurrentMode = true;
            //CountryEnum country = CountryEnum.valueOf( "user-input" )

            /*
           try {
            CountryEnum country = CountryEnum.valueOf( "user-input" );
                } catch ( IllegalArgumentException e ) {
                 System.err.println( "No such country" );
                }
             */
            Menu liczba = Menu.valueOf(scanner.nextLine());
            switch (liczba) {


                case MENU_UZYTKOWNIK:
                    while (CurrentMode) {
                        System.out.println("Wybierz opcję: \n1.Dodanie użytkownika \n2.Usunięcie użytkownika \n3.Usunięcie wszystkich \n4.Wyświetl konkretne id \n5.Wyświetl wszystkich \n6.Modyfikuj użytkownika \n7.Wyjscie z programu ");
                        switch (scanner.nextInt()) {
                            case 1:
                                userService.CreateNewUser();
                                break;
                            case 2:
                                userService.DeleteUser();
                                break;
                            case 3:
                                userService.DeleteAll();
                                break;
                            case 4:
                                userService.ShowUser();
                                break;
                            case 5:
                                userService.ShowAll();
                                break;
                            case 6:
                                userService.ModifyUser();
                                break;
                            case 7:
                                CurrentMode = false;
                                break;
                        }
                    }
                case MENU_PRODUKT:
                    while (CurrentMode) {
                        System.out.println("Wybierz opcję: \n1.Dodanie Produktu \n2.Usunięcie produktu \n3.Usunięcie produktów \n4.Wyświetl konkretne id \n5.Wyświetl wszystkich \n6.Modyfikuj produkt \n7.Wyjscie z programu ");
                        switch (scanner.nextInt()) {
                            case 1 -> productService.CreateNewProduct();
                            case 2 -> productService.DeleteProduct();
                            case 3 -> productService.DeleteAll();
                            case 4 -> productService.ShowProduct();
                            case 5 -> productService.ShotAllProduct();
                            case 6 -> productService.ModifyProduct();
                            case 7 -> CurrentMode = false;
                        }
                    }
            }
        }
    }
}

