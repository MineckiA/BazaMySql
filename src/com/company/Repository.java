package com.company;

import java.util.ArrayList;
import java.util.List;

public class Repository {

   public static List<User> UserList = new ArrayList<User>();
   private static int Id = 0;

   public static int GetId(){
       return Id++;
   }

}
