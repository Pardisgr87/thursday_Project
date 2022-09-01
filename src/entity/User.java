package entity;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private  String family;
    private String nationalId;
    private List<Account> accountList=new ArrayList<>();


    public User(String name, String family, String nationalId) {
        this.name = name;
        this.family = family;
        this.nationalId = nationalId;
    }

    public User(String name, String family, String nationalId, List<Account> accountList) {
        this.name = name;
        this.family = family;
        this.nationalId = nationalId;
        this.accountList = accountList;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

}
