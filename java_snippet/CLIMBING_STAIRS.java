
public class CLIMBING_STAIRS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int steps = 4;
        int output = climbingStairs(steps);
        System.out.println(output);
		
	}

	private static int climbingStairs(int steps) {
		
		int[] stairs = new int[steps+1];
		stairs[0] = 1;
		stairs[1] = 1;
		for(int i=2;i<=steps;i++) {
			stairs[i] = stairs[i-1]+stairs[i-2];
		}
		
		return stairs[steps];
	}

}
