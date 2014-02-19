
public class MagicalStringDiv2 {
	public int mininalMoves(String s){
		int moves = 0;
		int mid = s.length()/2;
		
		for(int counter=0; counter<s.length(); counter++){
			if(counter < mid){
				if(s.charAt(counter) != '<'){
					moves++;
				}
			}else {
				if(s.charAt(counter) != '>'){
					moves++;
				}
			}
		}
		
		return moves;
	}
}
