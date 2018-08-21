/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class NamaDerik {
   public static void D(){
             int x,y;
        for(x=1;x<=7;x++){
            if(x==1 || x == 7){
          
            for( y=1;y<=4;y++){
                System.out.print("D");
             
            }
                    
                  
                }else if(x == 2){
                System.out.println(" ");
                   
                     
                          for( y=1;y<=6;y++){
                         System.out.print("D");
                     }System.out.println(" ");
                     for(y=1;y<=7;y++){
                         System.out.print("D");
                     }System.out.println(" ");
                     for(y=1;y<=7;y++){
                         System.out.print("D");
                     }System.out.println(" ");
                     for(y=1;y<=7;y++){
                         System.out.print("D");
                     }System.out.println(" ");
                     for(y=1;y<=6;y++){
                         System.out.print("D");
                         }System.out.println("");
            }else {
                    System.out.print("");
                }
        }System.out.println("");
        System.out.println("");
    }
  public static void E(){
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
  public static void R(){
        int sp;
     for (sp = 0; sp< 2; sp++){
         System.out.println("");
     }
     int r1;
     int ar;
     for (r1=0; r1 < 2; r1++){
         System.out.println("RRRR");
         for (ar =0;ar<r1;ar++){
             System.out.print("");
         }
         System.out.println("RR RR");
     }
     for(r1 = 0;r1<3;r1++){
         System.out.print("");
         for(ar=0;ar<r1;ar++){
             System.out.print("");
         }
     }System.out.println("RR  RR");
     System.out.println("");
            
   }
   public static void I(){
        int x,y;
        System.out.println("");
        for(y=1;y<=2;y++){
        System.out.println("###");}
        for(x=1;x<=5;x++){
            System.out.println("III");
        }
   }
   
  public static void K(){
        int sp;
        for (sp = 0; sp < 2; sp++){
            System.out.println("");
        }
        for (int k= 0; k<2;k++){
            System.out.print("KK");
            for (int ksp = 2; ksp > k; ksp--){
                System.out.print(" ");
            }
            System.out.println("KK"); 
        }
        for (int ka = 0; ka< 2; ka++){
            System.out.print("KK");
        }
        System.out.println("");
        for (int k= 1;k<3;k++){
            System.out.print("KK");
            for(int ksp = 0;ksp <k;ksp++){
                System.out.print(" ");
                
            }
            System.out.println("KK");
        }
   }
   public  static void main(String[] args){
    D();   
    E();
    R();
    I();
    K();
       
   }
   
    }
    

