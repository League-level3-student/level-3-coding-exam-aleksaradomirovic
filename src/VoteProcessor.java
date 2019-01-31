import java.util.ArrayList;

public class VoteProcessor {
	String calculateElectionWinner(ArrayList<String> votes) {
		int can1 = 0, can2 = 0;
		String c1n = "", c2n = "";
		
		for(String v : votes) {
			v = v.toLowerCase();
			
			if(c1n == "") {
				c1n = v;
				System.out.println(v+" 1");
				can1++;
			} else if(!c1n.equals(v) && c2n == "") {
				c2n = v;
				System.out.println(v+" 2");
				can2++;
			} else if(c1n.equals(v)) {
				can1++;
			} else {
				can2++;
			}
		}
		
		if(can1 > can2) {
			return c1n;
		} else if(can2 > can1) {
			return c2n;
		} else {
			return "TIE";
		}
	}
}
