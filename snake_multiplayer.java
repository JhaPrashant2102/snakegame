import java.lang.*;
import java.util.*;
public class snake_multiplayer{
        public static final int NO_PLAY_CASE = 0;
        public static final int LADDER_CASE = 1;
        public static final int SNAKE_CASE = 2;
        public static void main(String args[]){
                int pos1 =  0, pos2 = 0;
                int rand_num1, rand_num2;
                //System.out.println(rand_num);
                int rand_pos1,  rand_pos2;
                int NO_OF_TIMES_DICE_ROLLED_1 = 0, NO_OF_TIMES_DICE_ROLLED_2 =0;
                while(true){
                        System.out.println("player1 position: "+pos1+"  NO_OF_TIMES_DICE_ROLLED_BY_PLAYER1: "+NO_OF_TIMES_DICE_ROLLED_1);
                        System.out.println("player2 position: "+pos2+"  NO_OF_TIMES_DICE_ROLLED_BY_PLAYER2: "+NO_OF_TIMES_DICE_ROLLED_2);
                        rand_pos1 = ((int)Math.floor(Math.random()*10)%3);
                        rand_pos2 = ((int)Math.floor(Math.random()*10)%3);
                        rand_num1 = ((int)Math.floor(Math.random()*10)%6)+1;
                        rand_num2 = ((int)Math.floor(Math.random()*10)%6)+1;
                        NO_OF_TIMES_DICE_ROLLED_2++;
                        NO_OF_TIMES_DICE_ROLLED_1++;

                        if(pos1==100){
                                if(pos2!=100)
                                System.out.println(" Player1 won");
                                else{
                                        System.out.println("both player won simultaneously");
                                }
                                break;
                        }
                        if(rand_pos1==SNAKE_CASE){
                              if(pos1-rand_num1<0)
                                pos1=0;
                                else
                                pos1-=rand_num1;
                        }
                        else if(rand_pos1==LADDER_CASE){
                              if(pos1+rand_num1<=100)
                                pos1+=rand_num1;  
                        }
                        if(pos2==100){
                                System.out.println("Player2 Won");
                                break;
                        }
                        if(rand_pos2==SNAKE_CASE){
                                if(pos2-rand_num2<0)
                                pos2=0;
                                else
                                pos2-=rand_num2;
                        }
                        else if(rand_pos2==LADDER_CASE){
                                if(pos2+rand_num2<=100)
                                pos2+=rand_num2;
                        }                                             

                }

        }
}

