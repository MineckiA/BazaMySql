package com.company;
import java.io.FileReader;
import java.util.List;

import java.util.Scanner;
import java.util.stream.Collectors;

public class UserService implements  IBaseActions{
    private static final UserService Instance = new UserService();

    private Scanner scanner = new Scanner(System.in);

    private UserService(){
    }

    public static UserService GetInstance(){
        return Instance;
    }

    public void CreateNewUser(){
        System.out.println("Imie");
        String name = scanner.next();
        System.out.println("Haslo");
        String password = scanner.next();
        User newUser = new User(name, password);
        Repository.UserList.add(newUser);
        System.out.println("Użytkownik dodany ");
    }

    public void DeleteUser(){
        System.out.println("Podaj ID użytkownika do usunięcia ");
        int userId = scanner.nextInt();
        var selectedUsers = (List<User>)Repository.UserList.stream().filter(item -> item.Id==userId).collect(Collectors.toList());

        if (!selectedUsers.isEmpty())
            Repository.UserList.remove(selectedUsers.get(0));
        else
            System.out.println("Brak użytkownika o takim ID");

    }

    public void DeleteAll(){
        System.out.println("Usuwam wszystkich użytkowników");
        Repository.UserList.clear();
    }

    public void ShowUser(){
        System.out.println("Podaj ID użytkownika do wyświetlenia");
        int u = scanner.nextInt();
        try {
            System.out.println(Repository.UserList.get(u));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Brak użytkownika o takim ID");
        }
    }

    public void ModifyUser(){
        System.out.println("Podaj id którego uzytkownika dane chcesz zmienić");
        int userId = scanner.nextInt();
        System.out.println("Imie");
        String name = scanner.next();
        System.out.println("Haslo");
        String password = scanner.next();
        User newUser = new User(name, password);
        Repository.UserList.set(userId, newUser);
    }

    public void ShowAll(){
        Repository.UserList.forEach(x -> System.out.println(x));
    }

    @Override
    public Object GetById(int Id) {
        return null;
    }

    @Override
    public void DeleteById(int Id) {

    }
}
