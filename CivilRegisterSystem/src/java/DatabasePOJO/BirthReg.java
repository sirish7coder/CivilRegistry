/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabasePOJO;

/**
 *
 * @author Ravibalg
 */
public class BirthReg {

private String email;
private String addr;
private String hospitaladdr;
private String delTime;

    public BirthReg(String email, String addr, String hospitaladdr, String delTime) {
        this.email = email;
        this.addr = addr;
        this.hospitaladdr = hospitaladdr;
        this.delTime = delTime;
    }

    
}
