/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartserver;

/**
 *
 * @author YangLaptop
 */
public class SmartServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "";
        for(String t:args){
            s += t + "---";
        }
        
        System.out.println(s);
    }
    
}
