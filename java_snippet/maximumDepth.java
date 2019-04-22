
public class maximumDepth {

	
	static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		 }
	
	static TreeNode root;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		maximumDepth dep = new maximumDepth();
		dep.root = new TreeNode(1);
		dep.root.left = new TreeNode(2); 
		dep.root.right = new TreeNode(3); 
		dep.root.left.left = new TreeNode(4); 
		dep.root.left.right = new TreeNode(5); 
		
		System.out.println("Maximum depth of the binary tree is "+dep.maximum(dep.root));
		
	}

	private int maximum(TreeNode root2) {
		// TODO Auto-generated method stub
		
		if(root2==null)
			return 0;
		
		int leftDepth = maximum(root2.left);
		int rightDepth = maximum(root2.right);
		
		
		return 1+Math.max(leftDepth, rightDepth);
	}

}
