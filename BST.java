/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;  
class Node
{
  int key;
  Node left,right;
   Node (int data)
   {
     key=data;
     left=right=null;
    }
  }
class BST
{
  Node root;
   BST()
  {
    root=null;
   }
  void insert(int key)
   {
    root=insert_recursive(root,key);
   }
    Node insert_recursive (Node root,int key)
    {
     if (root==null)
     {
       root= new Node(key);
       return root;
     }
     if ( key < root.key)
        root.left =insert_recursive(root.left,key);
     else if ( key > root.key)
             root.right=insert_recursive(root.right,key);
     return root;
    }
    void inorder()
     {
        inorder_traversal(root);
     }
     void inorder_traversal(Node root)
     {
       if (root !=null)
       {
        inorder_traversal(root.left);
        System.out.println(root.key+"  ");
        inorder_traversal(root.right);
        }
      }
       
  int minvalue(Node root)
  {
    int minval=root.key;
    while(root.left!=null)
    {
      minval=root.left.key;
      root=root.left;
      }
        return minval;
        }
   int maxvalue(Node root)
  {
    int maxval=root.key;
    while(root.right!=null)
    {
      maxval=root.right.key;
      root=root.right;
      }
        return maxval;
        }
   boolean search(int key)
   {
     root =search_recursive(root,key);
     if (root!=null)
        return true;
     else 
        return  false;
   }
     Node search_recursive(Node root,int key)
     {
       if(  root==null || root.key==key)
           return root;
       if (root.key>key)
           return search_recursive(root.left,key);
       else 
           return search_recursive(root.right,key);
     }
     
     public void deletekey(int key) 
     {
        root = delete_recursive(root, key);
     }  
    
     Node delete_recursive(Node root, int key)
     {
         Node temp=root;
        if (temp==null)
           return temp;
    
    if (key<temp.key)
           temp.left=delete_recursive(temp.left,key);
        else if (key>temp.key)
              temp.right=delete_recursive(temp.right,key);
        else
        {
          if (temp.left==null)
             return temp.right;
          else if (temp.right==null)
          
              return temp.left;
                            
              temp.key=minvalue(temp.right);
              temp.right=delete_recursive(temp.right,temp.key);
        }
         return temp;
     }
             
             
               
              
              
                 
                                               
              
              
              
                           
              
              
  public static void main (String []args)
  {
    BST b=new BST();
   /* Scanner sc=new Scanner(System.in);
    System.out.println("Enter the elements:");
    int a=sc.nextInt();
    b.insert(a);
    System.out.println("Display:");
    b.inorder();
    }
    }*/
 
     b.insert(35);
     b.insert(40);
     b.insert(10);
     b.insert(60);
     b.insert(20);
     b.insert(50);
     b.insert(15);
     System.out.println("Display:");
     b.inorder();
     
    b.minvalue(b.root);
    System.out.println("Minimum element is:"+b.minvalue(b.root));
    b.maxvalue(b.root);
    System.out.println("Maximum element is:"+b.maxvalue(b.root));
    boolean  y=b.search(20);
    System.out.println("Elements is found:  " +y);
    b.deletekey(40);
    System.out.println("Display:");
    b.inorder();
    
        
    }
   
   
   }
  
