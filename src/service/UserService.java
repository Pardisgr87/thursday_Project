package service;

import entity.User;
import repository.UserRepo;

public class UserService {
    private UserRepo userRepo = new UserRepo();
    public void addUser(String name ,String family,String nationalId){
        User user = new User(name,family,nationalId);
        userRepo.addUser(user);
    }
}
