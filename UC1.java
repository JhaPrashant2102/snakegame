import java.lang.*;
import java.util.*;
public class UC1{
	public static final int NO_PLAY_CASE = 0;
	public static final int LADDER_CASE = 1;
	public static final int SNAKE_CASE = 2;
	public static void main(String args[]){
		int pos =  0;
		int rand_num;
		//System.out.println(rand_num);
		int rand_pos;
		int NO_OF_TIMES_DICE_ROLLED = 0;
		while(pos<=100){
			System.out.println("player position: "+pos+"  NO_OF_TIMES_DICE_ROLLED: "+NO_OF_TIMES_DICE_ROLLED);
			rand_pos = ((int)Math.floor(Math.random()*10)%3);
			rand_num = ((int)Math.floor(Math.random()*10)%6)+1;
			NO_OF_TIMES_DICE_ROLLED++;
			if(pos<0){
				pos = 0;
				continue;
			}
			if(pos+rand_num<=100){
				pos+=rand_num;
			}

			if(pos==100){
				System.out.println("player position: "+pos+"  NO_OF_TIMES_DICE_ROLLED: "+NO_OF_TIMES_DICE_ROLLED+" Player won");
				break;
			}
			if(rand_pos==NO_PLAY_CASE){
				continue;
			}
			if(rand_pos==LADDER_CASE){
				pos+=rand_num;

			}
			if(rand_pos==SNAKE_CASE){
				pos-=rand_num;
			}

		}

	}
}
