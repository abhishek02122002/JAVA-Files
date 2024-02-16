public class pattern {
     public static void main (String... args){
           // square pattern
           System.out.println("SQUARE PATTERN");
          for(int i = 0;i<4;i++){
               for(int j =0 ; j <4;j++){
                    System.out.print(" * ");
               }
               System.out.println("");
          }

          //HOLLOW SQUARE
          System.out.println("HOLLOW SQUARE");
          for(int i =0;i<4;i++){
               if(i==0 || i==3){
                    for(int j =0;j<4;j++){
                         System.out.print(" * ");
                    }
               }
               else{
                    System.out.print(" * "); // first star
                    for(int p =0;p<2;p++){
                         System.out.print("   ");
                    }
                    System.out.print(" * ");
               }
               System.out.println(" ");
          }
          
          
          // HALF PYRAMID
          System.out.println("HALF PYRAMID");
          for(int i =0;i<5;i++){
               for(int j =0;j<i+1;j++){
                    System.out.print(" * ");
               }
               System.out.println(" ");
          }

          //INVERTED HALF PYRAMID
          System.out.println("INVERTED PYRAMID");
          for(int w=0;w<4;w++){
               for(int h=0;h<4-w;h++){
                    System.out.print(" * ");
               }
               System.out.println(" ");
          }

          //NUMERIC HALF PYRAMID 
          System.out.println("NUMERIC HALF PYRAMID");
          for(int i =0;i<4;i++){
               for(int j =0;j<i+1;j++){
                    System.out.print( j+1+" " );
               }
               System.out.println(" ");
          }

          System.out.println("\n");
          //NUMERIC INVERSE HALF PYRAMID
          System.out.println("NUMERIC HALF PYRAMID");
          for(int i =0;i<4;i++){
               for(int j =0;j<4-i;j++){
                    System.out.print(j+1 + " ");
               }
               System.out.println(" ");
          }

          //FULL PYRAMID
          for(int i =0;i<6;i++){
               //space 
               for(int j =0;j<6-i-1;j++){
                    System.out.print(" ");
               }
               //stat prinitng
               for(int j =0;j<i+1;j++){
                    System.out.print(" *");
               }
               System.out.print("\n");
          }
           

          // INVERTED FULL PYRAMID 
          System.out.println("INVERTED FULL PYRAMID");
          for(int i =0;i<6;i++){
               //space
               for(int j =0;j<i;j++){
                    System.out.print(" ");
               }
               //star
               for(int j=0;j<6-i;j++){
                    System.out.print("* ");
               }
               System.out.println("");
          }

          // SOLID DIAMOND
          System.out.println("SOLID DIAMOND");
          // upward pyramid section 
          for(int i =0;i<6;i++){
               //space 
               for(int j =0;j<6-i-1;j++){
                    System.out.print(" ");
               }
               //star 
               for(int k =0;k<i+1;k++){
                    System.out.print("* ");
               }
               System.out.println(" ");
          }
          // down ward section pyramid
          for(int i =0;i<6;i++){
               //space 
               for(int j =0;j<i;j++){
                    System.out.print(" ");
               }
               //star 
               for(int k=0;k<6-i;k++){
                    System.out.print("* ");
               }
               System.out.println(" ");
          }


          //HOLLOW DIAMOND 
          System.out.println("\n");
          System.out.println("HOLLOW DIAMOND");
          //upper section printing
          for(int i =0;i<6;i++){
               //space 
               for(int k=0;k<6-i-1;k++){
                    System.out.print(" ");
               }
               //star 
               for(int s =0;s<2*i+1;s++){
                    if(s==0){
                         System.out.print("* ");
                    }
                    else if(s==2*i){
                         System.out.print("* ");
                    }
                    else{
                         System.out.print(" ");
                    }
               }
               System.out.println(" ");
          }
          // lower section prinitng
          for(int i =0;i<6;i++){
               //space 
               for(int j=0;j<i;j++){
                    System.out.print(" ");
               }
               //star
               for(int h=0;h<2*6-(2*i -1);h++){
                    if(h==0 || h== 2*6 - 2*i-2){
                         System.out.print("* ");
                    }
                    else{
                         System.out.print(" ");
                    }
               }
               System.out.print("\n");
          }


          // NUMERIC PATTERN 
          System.out.println("NUMERIC PATTERN");
          for(int i =0;i<5;i++){
               //nomrmal prinitng
               for(int j =0;j<i+1;j++){
                    System.out.print(j+1 +" ");
               }
               //reverse printing
               for(int k=i;k>=1;k--){
                    System.out.print(k+" ");
               }
               System.out.println();
          }

          //NUMERIC HOLLOW PATTERN 
          for(int i =0;i<5;i++){
               //space 
               if(i!=4){
               for(int j=0;j<5-i-1;j++){System.out.print(" ");}
               //elements 
               for(int l=0;l<2*i+1;l++){
                    if(l==0){
                         System.out.print("1");
                    }
                    else if(l==2*i){
                         System.out.print(l);
                    }
                    else{
                         System.out.print(" ");
                    }
               }
          }
          else{
               for(int j=0;j<9;j++){
                    if(j%2==0){
                         System.out.print(5+" ");
                    }
               }
          }
               System.out.println();
          }


          // ALPHABET PATTERN Part-1
          System.out.println();
          System.out.println("ALPHABET PATTERN");
          char letter ='A';
          for(int i=0;i<5;i++){
               for(int j =0;j<=i;j++){
                    System.out.print(letter+" ");
                    letter++;
               }
               System.out.println();
          }

          //  -- ALPHABET PATTERN Part 2 --
          System.out.println();
          System.out.println("ALPHABET CHARACTER");
          char s='A'; 
          for(int i =0;i<5;i++){
               for(int j=0; j<5-i;j++){
                    System.out.print(s+" ");
                    s++;
               }
               System.out.println();
          }



          }
     }

