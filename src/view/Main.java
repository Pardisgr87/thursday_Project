package view;

import entity.*;
import service.UserService;

import java.util.ArrayList;
import java.util.List;


public class Main {
    static final UserService userservice =new UserService();
    public static void main(String[] args) {
        Account shortAccount=new ShortAccount("5047061022012930",1253,"127845989",145);
        Account longAccount=new LongAccount("5047061022012930",1253,"127845989",100);
        Account currant=new Currant("5047061022012930",1253,"127845989",40);
        List<Account> accountList=new ArrayList<>();
        accountList.add(shortAccount);
        accountList.add(longAccount);
        accountList.add(currant);
        userservice.addUser("ali","ahmadi","1245");
        //User user = new User("ali","ahmadi","4132587845",accountList);
        for (int i =0 ;i <=accountList.size()-1 ;i++){
            System.out.println();
        }


    }
}
