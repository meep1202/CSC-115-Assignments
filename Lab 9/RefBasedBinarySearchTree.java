// import java.lang.Math;
// /*
//  * RefBasedBinarySearchTree.java
//  *
//  * A ref-based BinaryTree meant to store values of type Integer
//  */
// public class RefBasedBinarySearchTree extends RefBasedBinaryTree {

//     public void insert(Integer value) {
//         insert(null, value, root);
//     }

//     private void insert(TreeNode parent, Integer value, TreeNode node) {
//         if (parent == null && node == null) {
//             root = new TreeNode(value);
//         }
//         else if (node == null) {
//             node = new TreeNode(value);
//             if (value.compareTo(parent.data) > 0) {
//                 parent.right = node;
//             }
//             else {
//                 parent.left = node;
//             }
//         }
//         else if (value.compareTo(node.data) > 0) {
//             insert(node, value, node.right);
//         }
//         else {
//             insert(node, value, node.left);
//         }
//     }


//     public boolean find(int val) {
//         TreeNode node = root;
//         while (node != null) {
//             if (val == node.data) {
//                 return true;
//             }
//             else if (val > node.data) {
//                 node = node.right;
//             }
//             else {
//                 node = node.left;
//             }
//         }
//         return false;
//     }


//     public int getMax() {
//         int max = root.data;
//         TreeNode node = root;
//         while (node != null) {
//             max = node.data;
//             node = node.right;
//         }
//         return max;
//     }


//     public static void main(String[] args) {
//         // use these trees to test the methods you will implement
//         RefBasedBinarySearchTree emptyTree = new RefBasedBinarySearchTree();
//         RefBasedBinarySearchTree myTree = new RefBasedBinarySearchTree();
//         myTree.insert(2);
//         myTree.insert(1);
//         myTree.insert(5);
//         myTree.insert(7);
//         myTree.insert(0);
//         myTree.insert(4);
//         myTree.insert(6);
        
//         System.out.println("in");
//         myTree.inOrder();
//         System.out.println("pre");
//         myTree.preOrder();
//         System.out.println("post");
//         myTree.postOrder();
        
//         System.out.println("toString\n" + myTree);

//         System.out.println("Sum: " + myTree.sum());
//         System.out.println("Find (9): " + myTree.find(9));
//         System.out.println("Find (2): " + myTree.find(2));
//         System.out.println("Max: " + myTree.getMax());
//     }
// }
