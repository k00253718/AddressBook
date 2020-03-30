/**
 *
 * @AUTHOR: ONYENZE CLINTON 
 */


package binarysearch;


public class TreeNode //CLASS TREENODE DEFINITION NODE 
{
    
//PACKAGE ACCESS MEMBERS
    
TreeNode left;                  //LEFT NODE
      
int data;                       //DATA ITEM - DATA WILL DIFFER DEPENDING ON THE APPLICATION.
        
TreeNode right;                 //RIGHT NODE

        
//CONSTRUCTOR: INITIALIZE DATA TO i AND MAKE THIS A LEAF NODE
        
public TreeNode(int i) {
            
    data = i;
            
    left = right = null;        //THIS NODE HAS NO CHILDREN
        
}
        
//INSERT A TREENODE INTO A TREE THAT CONTAINS NODES. (IGNORE DUPLICATE VALUES).

        
public synchronized void insert(int i) {
            
    if (i < data) {
                
        if (left == null) {
                    
            left = new TreeNode(i);
                
        } else {
                   
            left.insert(i);
                
        }
            
    } else if (i > data) {
                
        if (right == null) {
                    
            right = new TreeNode(i);
                
        } else {
                    
            right.insert(i);
                
        }
            
    }
        
}
    
}//CLASS TREE DEFINITION

   
