// import java.lang.Math;
// import java.util.LinkedList;
// /*
//  * RefBasedBinaryTree.java
//  *
//  * A ref-based BinaryTree meant to store values of type Integer
//  */
// public class RefBasedBinaryTree implements BinaryTree {
//     protected TreeNode root;
    
//     public RefBasedBinaryTree() {
//         this.root = null;
//     }
    
//     public void insert(Integer value){
//         if (root==null) {
//             root = new TreeNode(value);
//         } else {
//             insert(null, root, value);
// 		}
        
//     }
//     // not a balanced insert
//     private void insert(TreeNode parent, TreeNode t, Integer value) {
//         if (t==null) {
//             if(parent.getLeft()==null) {
//                 parent.setLeft(new TreeNode(value));
// 			} else {
//                 parent.setRight(new TreeNode(value));
// 			}            
//         }  else {
//             int htLeft = height(t.getLeft());
//             int htRight = height(t.getRight());
//             if (htLeft>htRight) {
//                 insert(t, t.getRight(), value);
// 			} else {
//                 insert(t, t.getLeft(), value);
// 			}
//         }
//     }
    
//     private int height(TreeNode t) {
//         if (t==null) {
//             return -1;
// 		} else {
//             int highest = Math.max(height(t.getLeft()), height(t.getRight()));
//             return 1 + highest;
//         }
//     }
    
//     /*
//      * Purpose: prints the value at each TreeNode in this BinaryTree
//      *          following an in-order traversal
//      * Parameters: none
//      * Returns: Nothing
//      */
//     public void inOrder(){
//         inOrder(root);
//         System.out.println();
//     }
    
//     /*
//      * Purpose: prints the value at each TreeNode in t,
//      *          following an in-order traversal
//      * Parameters: TreeNode t
//      * Returns: Nothing
//      */
//     private void inOrder(TreeNode t){
//         if (t==null) {
//             return;
//         } else {
//             inOrder(t.getLeft());
//             System.out.print(t.getValue() + " ");
//             inOrder(t.getRight());
//         }
//     }
    
//     /*
//      * Purpose: prints the value at each TreeNode in this BinaryTree
//      *          following a pre-order traversal
//      * Parameters: none
//      * Returns: Nothing
//      */
//     public void preOrder(){
//         preOrder(root);
//         System.out.println();
//     }
    
//     /*
//      * Purpose: prints the value at each TreeNode in t,
//      *          following a pre-order traversal
//      * Parameters: TreeNode t
//      * Returns: Nothing
//      */
//     private void preOrder(TreeNode t){
//         if (t==null) {
//             return;
//         } else {
//             System.out.print(t.getValue() + " ");
//             preOrder(t.getLeft());
//             preOrder(t.getRight());
//         }
//     }
    
//     /*
//      * Purpose: prints the value at each TreeNode in this BinaryTree
//      *          following a post-order traversal
//      * Parameters: none
//      * Returns: Nothing
//      */
//     public void postOrder(){
//         postOrder(root);
//         System.out.println();
//     }
    
//     /*
//      * Purpose: prints the value at each TreeNode in t,
//      *          following a post-order traversal
//      * Parameters: TreeNode t
//      * Returns: Nothing
//      */
//     private void postOrder(TreeNode t){
//         if (t==null) {
//             return;
//         } else {
//             postOrder(t.getLeft());
//             postOrder(t.getRight());
//             System.out.print(t.getValue() + " ");
//         }
//     }
    
//     /*
//      * Purpose: returns a String reprensentation of this BinaryTree
//      * Parameters: none
//      * Returns: String - the representation
//      */
//     public String toString() {
//         return toString(root);
//     }
    
//     private String toString(TreeNode t) {
//         if(t==null) {
//             return "";
//         } else {
//             String s = "";
            
//             s += toString(t.getLeft());
//             s += t.getValue() + " ";
//             s += toString(t.getRight());
            
//             return s;
//         }
//     }


//     public int sum() {
//         return sum(root);
//     }


//     private int sum(TreeNode node) {
//         if (node == null) {
//             return 0;
//         }
//         return node.data + sum(node.left) + sum(node.right);
//     }


//     public boolean find(int val) {
//         return find(val, root);
//     }


//     private boolean find(int val, TreeNode node) {
//         if (node == null) {
//             return false;
//         }
//         return val == node.data || find(val, node.left) || find(val, node.right);
//     }

    
//     public int getMax() {
//         return getMax(root, root.data);
//     }


//     private int getMax(TreeNode node, int max) {
//         if (node == null) {
//             return -2147483647;
//         }
//         if (node.data > max) {
//             max = node.data;
//         }
//         return max(getMax(node.right, max), getMax(node.left, max), max);
//     }


//     private int max(int a, int b, int c) {
//         if (a >= b && a >= c) {
//             return a;
//         }
//         else if (b >= a && b >= c) {
//             return b;
//         }
//         else {
//             return c;
//         }
//     }
    
    
//     public static void main(String[] args) {
//         // use these trees to test the methods you will implement in Part II
//         RefBasedBinaryTree emptyTree = new RefBasedBinaryTree();
//         RefBasedBinaryTree myTree = new RefBasedBinaryTree();
//         for(int i=2; i<8; i++) {
//             myTree.insert(i);
//         }

//         System.out.println("Sum: " + myTree.sum());
//         System.out.println("Find (9): " + myTree.find(9));
//         System.out.println("Find (3): " + myTree.find(3));
//         System.out.println("Max: " + myTree.getMax());

//     }
    
// }
