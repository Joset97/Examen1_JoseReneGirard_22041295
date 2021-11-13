/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import java.util.ArrayList;

/**
 *
 * @author jrgir
 */
public class ArrayLUsers {
    
    
  public ArrayList<Usuarios> users= new ArrayList();

    public ArrayList<Usuarios> getUsersAR() {
        return users;
    }

    public void setUsersAR(Usuarios users) {
        this.users.add(users);
    }
    
    
}
