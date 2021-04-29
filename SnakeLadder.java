
public class SnakeLadder {

	public static final int ladder=1;
	public static final int snake=2;
	public static void main(String[] args) {
		
		
		int position=0;
		int count=0;
		while(position<100) {
			int diceroll=(int) Math.floor(Math.random() * 10) % 6 + 1;
			count=count+1;
		    //System.out.println(diceroll);
		    position+=diceroll;
		    int option=(int) Math.floor(Math.random() * 10) % 3;
		    //System.out.println(option);
		    	switch (option) {
		    	case ladder:
				     position+=diceroll;
				     break;
			    case snake:
				     position-=diceroll;
				     break;
			    default:
				     break;					
			}
		}
		    if(position>100){
		    	position-=diceroll;
		    }else if(position<0){
			    position=0;
		    }else if(position==100)
			    break;
	            }
	
		    
		//System.out.println("Player Position:" + position + ',' +  "NoofTimesDIcePlayed" + count);
		}
		System.out.println("Player Position:" + position + ',' +  "NoofTimesDIcePlayed" + count);
		
	}
}
