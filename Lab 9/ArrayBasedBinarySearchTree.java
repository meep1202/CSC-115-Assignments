// public class ArrayBasedBinarySearchTree extends ArrayBasedBinaryTree{

//     public void insert(Integer value) {
//         insert(value, root);
//         size++;
//     }

//     private void insert(Integer value, int index) {
//         if (data[index] == null) {
//             data[index] = value;
//         }
//         else if (value.compareTo(data[index]) > 0) {
//             insert(value, getRight(index));
//         }
//         else {
//             insert(value, getLeft(index));
//         }
//     }

//     public static void main(String[] args) {
//         ArrayBasedBinarySearchTree emptyTree = new ArrayBasedBinarySearchTree();
        
//         ArrayBasedBinarySearchTree myTree = new ArrayBasedBinarySearchTree();
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
//     }

// }
