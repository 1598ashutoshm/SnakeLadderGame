
public class SnakeLadder {

	public static final int ladder=1;
	public static final int snake=2;
	public static void main(String[] args) {
		
		
		int position=0;
		while(position<100) {
			int diceroll=(int) Math.floor(Math.random() * 10) % 6 + 1;
		    System.out.println(diceroll);
		    position+=diceroll;
		    int option=(int) Math.floor(Math.random() * 10) % 3;
		    System.out.println(option);
		    if(diceroll==option) {
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
		    if(position>100)
		    	position-=diceroll;
		    
		System.out.println("Player Position:" + position);
		}
		
	}
}
