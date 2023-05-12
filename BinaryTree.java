package bin;

public class BinaryTree {
	
	Tree_Nodes base; 

	public BinaryTree(Tree_Nodes base ) {
		this.base=base;
	}
	
	 public void Add_Node(Tree_Nodes neww, Tree_Nodes Root_Explore ) {
		 if(Root_Explore==null)
			 return;
		 
		 if(neww.Val>Root_Explore.Val) {
			 if(Root_Explore.R==null) 
				 Root_Explore.R=neww;
			 else 
				 Add_Node(neww , Root_Explore.R);
				 
			 }
		 if(neww.Val<Root_Explore.Val) {
			 if(Root_Explore.L==null) 
				 Root_Explore.L=neww;
			 else 
				 Add_Node(neww , Root_Explore.L);
				 
		 
	 }

		 
}
	 public void Search_value(int val, Tree_Nodes Root_Explore ) {
		 if(Root_Explore==null) {
			 System.out.println("Value not in the binary tree");
			 return;
		 }
		 		
		 if(Root_Explore.Val==val) {
			 
			 System.out.println("Value is found");
			 return;
		 }
		 if(val >Root_Explore.Val) {
			
				 Search_value(val , Root_Explore.R);
				 
			 }
		 if(val<Root_Explore.Val) {
			 
				 Search_value(val , Root_Explore.L);
				 
		 
	 }

		 
}
} 