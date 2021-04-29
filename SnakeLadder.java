
public class SnakeLadder {

	public static final int ladder=1;
	public static final int snake=2;
	public static void main(String[] args) {
		
		int position1=0;
		int position2=0;
		
		int count1=0; 
		int count2=0;
		
		while(position1<100 && position2<100) {
			count1++;
			int diceroll=(int) Math.floor(Math.random() * 10) % 6 + 1;
		    int option=(int) Math.floor(Math.random() * 10) % 3;
		    switch (option) { 	    
		    case ladder:
				position1+=diceroll;
				break;
			case snake:
				position1-=diceroll;
				break;
			default:
				break;					
			}
		    if(position1==100) {
		    	break;
		    } else if(position1<0){
		    	position1=0;
		    	
		    } else if(position1>100) {
		    	position1-=diceroll;
		    }
		    
		    count2++;
		    int diceroll1=(int) Math.floor(Math.random() * 10) % 6 + 1;
		    int option1=(int) Math.floor(Math.random() * 10) % 3;
		    switch (option1) { 	    
		    case ladder:
				position2+=diceroll1;
				break;
			case snake:
				position2-=diceroll1;
				break;
			default:
				break;					
			}
		    if(position2==100) {
		    	break;
		    } else if(position2>100) {
		    	position2-=diceroll;
		    } else if(position2<0) {
		    	position2=0;
		    }
		}
		System.out.println("Player1 Position: " + position1);
		System.out.println("No of time diceRoll: " + count1);
		System.out.println("Player2 Position: " + position2);
		System.out.println("No of time diceroll: " + count2);
		
		if(position1==100) {
			System.out.println("Player1 Won The Game");
		}else {
			System.out.println("Player2 Won The Game");
		}
	}
}
