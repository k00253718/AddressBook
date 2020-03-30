

/**
 *
 * @AUTHOR: ONYENZE CLINTON
 */

package binarysearch;

public class Tree {

private TreeNode root;

//CONSTRUCT AN EMPTY TREE OF INTEGERS
        
public Tree() {
            
    root = null;
        
}

//INSERT A NEW NODE IN THE BINARY SEARCH TREE. IF THE ROOT NODE IS NULL, CREATE THE ROOT NODE HERE. OTHERWISE, CALL THE INSERT METHOD OF CLASS TREE NODE.    
        
public synchronized void insertNode(int d) {
            
    if (root == null) {
                
        root = new TreeNode(d);
            
    } else {
                
        root.insert(d);
            
    }
        
}
        
// PREORDER TRAVERSAL - VISIT EACH NODE IN THE TREE IN PREORDER.
        
// PRE: THE BINARY TREE TO WHICH ROOT POINTS HAS BEEN CREATED.
        
// POST: THE FUNCTION VISIT HAS BEEN PERFORMED ON EVERY ENTRY IN THE BINARY TREE IN PREORDER SEQUENCE.  

        
public synchronized void preorderTraversal() {
            
    preorderHelper(root);
        
}

        
// RECURSIVE METHOD TO PERFORM PREORDER TRAVERSAL 
        
private void preorderHelper(TreeNode node) {
            
    if (node == null) {
                
        return;
            
    }
            
    System.out.print(node.data + " ");
            
    preorderHelper(node.left);
            
    preorderHelper(node.right);
        
}
        
// IN ORDER TRAVERSAL - VISIT EACH NODE IN THE TREE IN ORDER.
        
// PRE: THE BINARY TREE TO WHICH ROOT POINTS HAS BEEN CREATED.
        
// POST: THE FUNCTION VISIT HAS BEEN PERFORMED ON EVERY ENTRY IN THE BINARY TREE IN INORDER SEQUENCE. 

        
public synchronized void inorderTraversal() {
            
    inorderHelper(root);
        
}

        
// RECURSIVE METHOD TO PERFORM INORDER TRAVERSAL 
        
private void inorderHelper(TreeNode node) {
            
    if (node == null) {
                
        return;
            
    }
            
    inorderHelper(node.left);
            
    System.out.print(node.data + " ");
            
    inorderHelper(node.right);
        
}
        
// IN ORDER TRAVERSAL - VISIT EACH NODE IN THE TREE IN ORDER.
        
// PRE: THE BINARY TREE TO WHICH ROOT POINTS HAS BEEN CREATED.
        
// POST: THE FUNCTION VISIT HAS BEEN PERFORMED ON EVERY ENTRY IN THE BINARY TREE IN INORDER SEQUENCE. 

        
public synchronized void postorderTraversal() {
            
    postorderHelper(root);
        
}

        
// RECURSIVE METHOD TO PERFORM POSTORDER TRAVERSAL 
        
private void postorderHelper(TreeNode node) {
            
    if (node == null) {
                
        return;
            
    }
            
    postorderHelper(node.left);
            
    postorderHelper(node.right);
            
    System.out.print(node.data + " ");
        
}

public void clear(){
    
root=null;

}
    
}//END OF CLASS


    


   
