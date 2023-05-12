package bin;

public class binary_tree_test {

	public static void main(String[] args) {
		
		Tree_Nodes base= new Tree_Nodes(7,null,null);
		
		BinaryTree saif= new BinaryTree(base);
		
		
		
		Tree_Nodes base2= new Tree_Nodes(8,null,null);
		
		
		saif.Add_Node(base2, saif.base);
		
		Tree_Nodes base3= new Tree_Nodes(9,null,null);
		
		
		saif.Add_Node(base3, saif.base);
		
		saif.Search_value(6, saif.base);


	}
	

}
