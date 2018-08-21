/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class HurufE {
    public static void main(String[] args){
        int x, y;
        for(x=1;x<=7;x++){
            if(x==1 || x==4 || x==7){
                for(y=1;y<=5;y++){
                    System.out.print("#");
                }
                System.out.println();
                
            }else{
                System.out.println("#");
            }
        }
    }
}
