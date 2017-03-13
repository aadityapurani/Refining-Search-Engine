import java.io.*;
import java.util.*;
import java.lang.*;

public class DSA			//class DSA starts
{
	static int choice;		//variabl declairation 
	static int lappyChoice;
	static String choiceStr;
	static int k1 = 1;
	static int choiceBuy;
	static String [] wishList = new String[5];
	static Scanner input = new Scanner(System.in);				//Scanner object
	public static void main(String[] args) throws IOException	//main method
	{	
		dataLaptop Obj = new dataLaptop();			//various objects are created
		Tree TreeObject = new Tree();
		Property PdObject=new Property();
		Form formObject = new Form();
		int choiceLPG = 1;
		
		System.out.println("Welcome to the Shopping Mart...");
		System.out.println("Here are the categories of all things we are selling....");
		while(choiceLPG != 0)   //runs untill choice is not zero
		{
			System.out.println("Enter the appropriate number for category...");
			System.out.println("1. Laptop");
			System.out.println("2. Mobile");
			System.out.println("3. Garments");
			choice = input.nextInt();			//choice for the catagories
			System.out.print("Choice is "); 
			if(choice==1)				//select searching for laptop
			{
				System.out.println(" Laptop");
				System.out.println("Now you can go according to the following categories..");
				while(k1!=0)
				{
					System.out.println("Enter Respective number for category...");
					System.out.println("1.Processor\n2.RAM\n3.HardDisk\n4.External USB Ports\n5.Flexible\n6.Simple Touch/ NonTouch\n7.Graphics Card");
					lappyChoice= input.nextInt(); 
					Obj.DataLaptop();
					System.out.println("Enter 1 to continue searching...0 to exit from this product");
					k1 = input.nextInt();
				}
			}
			k1 = 1;
			if(choice==2)				//select searching for Mobiles
			{
				System.out.println(" Mobile");
				System.out.println("Now you can go according to the following categories..");
				while(k1!=0)
				{
					System.out.println("Enter Respective number for category...");
					System.out.println("1. Name\n2. Android Version\n3. Price\n4. Size\n5. SIM\n6. RAM\n7. Internal Memory\n8.Camera\n9. External memory capacity\n10.Battery\n11.Proccessor");
					lappyChoice= input.nextInt(); 
					Obj.DataMobile();
					System.out.println("Enter 1 to continue searching...0 to exit from this product");
					k1 = input.nextInt();
				}
				//here will be objects of class of Yash's code
			}
			k1=1;
			if(choice==3)			//select searching for Garments
			{
				System.out.println(" Garments");
				System.out.println("Now you can go according to the following categories..");
				while(k1!=0)
				{
					System.out.println("Enter Respective number for category...");
					System.out.println("1. Brand\n2. Color\n3. Size\n4. Price\n5. Cloth type");
					lappyChoice= input.nextInt(); 
					Obj.DataGarments();
					System.out.println("Enter 1 to continue searching...0 to exit from this product");
					k1 = input.nextInt();
				}
			}
			System.out.println("Enter 0 to exit or 1 to change the product....");
			choiceLPG = input.nextInt();			//exit when zero
		}				
		int h = 1;
		System.out.println("Enter product name to make wishList");
		System.out.println("Enter 1 to make wishlist 0 otherwise..");
		h = input.nextInt();						//for making the wishlist
		int m=0;
		while(h!=0)
		{
			wishList[m] = input.next();
			System.out.println("Enter 1 to add add another wishlist 0 to finish..");
			h = input.nextInt();
			m++;
		}
		while(m!=0)
		{
			m--;
			System.out.println(wishList[m]);
		}
		System.out.println("Do you want to buy that product?");
		System.out.println("Enter 1 if you want to buy and 0 otherwise");
		choiceBuy = input.nextInt();			//for buying the product
		if(choiceBuy == 1)
		{
			System.out.println("Enter the name of product...");
			String product = input.next();
			System.out.println("The product you are buying is...."+product);
			formObject.form();
			System.out.println("Thank you So much for Shopping...");
		}
		else
		{
			System.out.println("See you Soon... Thank you for visit...");
		}
	}
}
class Conversion				//class conversion starts
{
	public double toFloat(String data) //method for converting string into float
	{
		double value = 0;
		double code = 0;
		int count2 = 0;
		for (int i=0 ; i<data.length() ; i++)
		{
			if(data.charAt(i)==' ' || data.charAt(i)=='.')    //assigning values
			{
				value = 0;
			}
			if(data.charAt(i)=='0')
			{
				value = 1;
			}
			if(data.charAt(i)=='1')
			{
				value = 2;
			}
			if(data.charAt(i)=='2')
			{
				value = 3;
			}
			if(data.charAt(i)=='3')
			{
				value = 4;
			}
			if(data.charAt(i)=='4')
			{
				value = 5;
			}
			if(data.charAt(i)=='5')
			{
				value = 6;
			}
			if(data.charAt(i)=='6')
			{
				value = 7;
			}
			if(data.charAt(i)=='7')
			{
				value = 8;
			}
			if(data.charAt(i)=='8')
			{
				value = 9;
			}
			if(data.charAt(i)=='9')
			{
				value = 11;
			}
			if(data.charAt(i)=='a' || data.charAt(i)=='A')
			{
				value = 12;
			}
			if(data.charAt(i)=='b' || data.charAt(i)=='B')
			{
				value = 13;
			}
			if(data.charAt(i)=='c' || data.charAt(i)=='C')
			{
				value = 14;
			}
			if(data.charAt(i)=='d' || data.charAt(i)=='D')
			{
				value = 15;
			}
			if(data.charAt(i)=='e' || data.charAt(i)=='E')
			{
				value = 16;
			}
			if(data.charAt(i)=='f' || data.charAt(i)=='F')
			{
				value = 17;
			}
			if(data.charAt(i)=='g' || data.charAt(i)=='G')
			{
				value = 18;
			}
			if(data.charAt(i)=='h' || data.charAt(i)=='H')
			{
				value = 19;
			}
			if(data.charAt(i)=='i' || data.charAt(i)=='I')
			{
				value = 21;
			}
			if(data.charAt(i)=='j' || data.charAt(i)=='J')
			{
				value = 22;
			}
			if(data.charAt(i)=='k' || data.charAt(i)=='K')
			{
				value = 23;
			}
			if(data.charAt(i)=='l' || data.charAt(i)=='L')
			{
				value = 24;
			}
			if(data.charAt(i)=='m' || data.charAt(i)=='M')
			{
				value = 25;
			}
			if(data.charAt(i)=='n' || data.charAt(i)=='N')
			{
				value = 26;
			}
			if(data.charAt(i)=='o' || data.charAt(i)=='O')
			{
				value = 27;
			}
			if(data.charAt(i)=='p' || data.charAt(i)=='P')
			{
				value = 28;
			}
			if(data.charAt(i)=='q' || data.charAt(i)=='Q')
			{
				value = 29;
			}
			if(data.charAt(i)=='r' || data.charAt(i)=='R')
			{
				value = 31;
			}
			if(data.charAt(i)=='s' || data.charAt(i)=='S')
			{
				value = 32;
			}
			if(data.charAt(i)=='t' || data.charAt(i)=='T')
			{
				value = 33;
			}
			if(data.charAt(i)=='u' || data.charAt(i)=='U')
			{
				value = 34;
			}
			if(data.charAt(i)=='v' || data.charAt(i)=='V')
			{
				value = 35;
			}
			if(data.charAt(i)=='w' || data.charAt(i)=='W')
			{
				value = 36;
			}
			if(data.charAt(i)=='x' || data.charAt(i)=='X')
			{
				value = 37;
			}
			if(data.charAt(i)=='y' || data.charAt(i)=='Y')
			{
				value = 38;
			}
			if(data.charAt(i)=='z' || data.charAt(i)=='Z')
			{
				value = 39;
			}
			if(i==0)
			{
				code = value;
			}
			else
			{
				code = code + (value/Math.round(Math.pow(10,2*i)));
				count2++;
			}
		}
		if(count2 == 1)
		{
			String s = String.format("%.2f", code);
    	 	code = Double.parseDouble(s);
		}
		if(count2 == 2)
		{
			String s = String.format("%.4f", code);
    	 	code = Double.parseDouble(s);
		}
		if(count2 == 3)
		{
			String s = String.format("%.6f", code);
    	 	code = Double.parseDouble(s);
		}
		if(count2 == 4)
		{
			String s = String.format("%.8f", code);
    	 	code = Double.parseDouble(s);
		}
		if(count2 == 5)
		{
			String s = String.format("%.10f", code);
    	 	code = Double.parseDouble(s);
		}
		if(count2 == 6)
		{
			String s = String.format("%.12f", code);
    	 	code = Double.parseDouble(s);
		}
		if(count2 == 7)
		{
			String s = String.format("%.14f", code);
    	 	code = Double.parseDouble(s);
		}
		if(count2 == 8)
		{
			String s = String.format("%.16f", code);
    	 	code = Double.parseDouble(s);
		}
		if(count2 == 9)
		{
			String s = String.format("%.18f", code);
    	 	code = Double.parseDouble(s);
		}
		if(count2 == 10)
		{
			String s = String.format("%.20f", code);
    	 	code = Double.parseDouble(s);
		}
		return code;
	} 
	public String toString(double data)			//method for converting codeword into string
	{
		int a = (int)data;
		String remaining = Double.toString(data);
		String newR = remaining.substring(3,remaining.length());
		long long1 = Long.parseLong(newR);
		long check;
		String answer = " ";
		String part = " ";
		String fc = " ";
		while(long1!=0)
		{
			check = long1%100;
			long1 = long1/100;
			if(check == 0)
			{
				part = " ";
			}
			else if(check == 1)
			{
				part = "0";
			}
			else if(check == 2)
			{
				part = "1";
			}
			else if(check == 3)
			{
				part = "2";
			}
			else if(check == 5)
			{
				part = "4";
			}
			else if(check == 6)
			{
				part = "5";
			}
			else if(check == 7)
			{
				part = "6";
			}
			else if(check == 8)
			{
				part = "7";
			}
			else if(check == 9)
			{
				part = "8";
			}
			else if(check == 4)
			{
				part = "3";
			}
			else if(check == 11)
			{
				part = "9";
			}
			else if(check == 12)
			{
				part = "A";
			}
			else if(check == 13)
			{
				part = "B";
			}
			else if(check == 14)
			{
				part = "C";
			}
			else if(check == 15)
			{
				part = "D";
			}
			else if(check == 16)
			{
				part = "E";
			}
			else if(check == 17)
			{
				part = "F";
			}
			else if(check == 18)
			{
				part = "G";
			}
			else if(check == 19)
			{
				part = "H";
			}
			else if(check == 21)
			{
				part = "I";
			}
			else if(check == 22)
			{
				part = "J";
			}
			else if(check == 23)
			{
				part = "K";
			}
			else if(check == 24)
			{
				part = "L";
			}
			else if(check == 25)
			{
				part = "M";
			}
			if(check == 26)
			{
				part = "N";
			}
			if(check == 27)
			{
				part = "O";
			}
			if(check == 28)
			{
				part = "P";
			}
			if(check == 29)
			{
				part = "Q";
			}
			if(check == 31)
			{
				part = "R";
			}
			if(check == 32)
			{
				part = "S";
			}
			if(check == 33)
			{
				part = "T";
			}
			if(check == 34)
			{
				part = "U";
			}
			if(check == 35)
			{
				part = "V";
			}
			if(check == 36)
			{
				part = "W";
			}
			if(check == 37)
			{
				part = "X";
			}
			if(check == 38)
			{
				part = "Y";
			}
			if(check == 39)
			{
				part = "Z";
			}
			answer = answer + part;
		}
			if(a == 0)
			{
				fc = " ";
			}
			if(a == 1)
			{
				fc = "0";
			}
			if(a == 2)
			{
				fc = "1";
			}
			if(a == 3)
			{
				fc = "2";
			}
			if(a == 5)
			{
				fc = "4";
			}
			if(a == 6)
			{
				fc = "5";
			}
			if(a == 7)
			{
				fc = "6";
			}
			if( a== 8)
			{
				
				fc = "7";
			}
			if(a == 9)
			{
				fc = "8";
			}
			if(a == 4)
			{
				fc = "3";
			}
			if(a == 11)
			{
				fc = "9";
			}
			if(a == 12)
			{
				fc = "A";
			}
			if(a == 13)
			{
				fc = "B";
			}
			if(a == 14)
			{
				fc = "C";
			}
			if(a == 15)
			{
				fc = "D";
			}
			if(a == 16)
			{
				fc = "E";
			}
			if(a == 17)
			{
				fc = "F";
			}
			if(a == 18)
			{
				fc = "G";
			}
			if(a == 19)
			{
				fc = "H";
			}
			if(a == 21)
			{
				fc = "I";
			}
			if(a == 22)
			{
				fc = "J";
			}
			if(a == 23)
			{
				fc = "K";
			}
			if(a == 24)
			{
				fc = "L";
			}
			if(a == 25)
			{
				fc = "M";
			}
			if(a == 26)
			{
				fc = "N";
			}
			if(a == 27)
			{
				fc = "O";
			}
			if(a == 28)
			{
				fc = "P";
			}
			if(a == 29)
			{
				fc = "Q";
			}
			if(a == 31)
			{
				fc = "R";
			}
			if(a == 32)
			{
				fc = "S";
			}
			if(a == 33)
			{
				fc = "T";
			}
			if(a == 34)
			{
				fc = "U";
			}
			if(a == 35)
			{
				fc = "V";
			}
			if(a == 36)
			{
				fc = "W";
			}
			if(a == 37)
			{
				fc = "X";
			}
			if(a == 38)
			{
				fc = "Y";
			}
			if(a == 39)
			{
				fc = "Z";
			}
		System.out.print(fc);
		for(int i=answer.length()-1; i>=0 ;i--)
		{
			System.out.print(answer.charAt(i));
		}
		System.out.println("");
		return "Thanks";
	}
}



class Node							//class Node
{
public double codeword;
Property PropertyCode;
public Node leftChild;         	  // this node's left child
public Node rightChild;       	 // this node's right child

public void displayNode()      // display node
   {
   System.out.print("{");
   System.out.print(codeword+", ");
   System.out.println("}\n");
   }
}  // end class Node

class Property				// class property starts
{
	double [] var = new double[11];
	int Stock;
}

class Tree
{
static Node root;             // first node of tree


public Tree()                  // constructor
   { root = null; }            // no nodes in tree yet


public void insert(double cd,Property pd)		//insertion method
   {
   Node newNode = new Node();    // make new node
   newNode.codeword = cd;           // insert codeword
   newNode.PropertyCode=pd;			//insert property code
   if(root==null)  
   {              // no node in root
      root = newNode;
  }
   else                          // root occupied
      {
      Node current = root;       // start at root
      Node parent;
      while(true)                // (exits internally)
         {
         parent = current;
         if(cd < current.codeword)  // go left?
            {
            current = current.leftChild;
            if(current == null)  // if end of the line,
               {                 // insert on left
               parent.leftChild = newNode;
               return;
               }
            }  // end if go left
         else                    // or go right?
            {
            current = current.rightChild;
            if(current == null)  // if end of the line
               {                 // insert on right
               parent.rightChild = newNode;
               return;
               }
            }  // end else go right
         }  // end while
      } //end else root not null
   }  // end insert()

public Node find(double cd)      // find node with given key
   {                           // (assumes non-empty tree)
	   Node current = root;               // start at root
	   while(current.codeword != cd)        // while no match,
	      {
		      if(cd < current.codeword)         // go left?
		         current = current.leftChild;
		      else                            // or go right?
		         current = current.rightChild;
		      if(current == null)             // if no child,
		         return null;                 // didn't find it
	      }
	   return current;                    // found it
   }  // end find()

public boolean delete(int key) // delete node with given key
{                           // (assumes non-empty list)
Node current = root;
Node parent = root;
boolean isLeftChild = true;

while(current.codeword != key)        // search for node
   {
	   parent = current;
	   if(key < current.codeword)         // go left?
	    {
	      isLeftChild = true;
	      current = current.leftChild;
	    }
	   else                            // or go right?
	    {
	      isLeftChild = false;
	      current = current.rightChild;
	    }
	   if(current == null)             // end of the line,
	      return false;                // didn't find it
   }  // end while
// found node to delete Stock
	if(current.PropertyCode.Stock != 0)
		current.PropertyCode.Stock-=1;
	else
	{
		// if no children, simply delete it
		if(current.leftChild==null &&
		                             current.rightChild==null)
		   {
		   if(current == root)             // if root,
		      root = null;                 // tree is empty
		   else if(isLeftChild)
		      parent.leftChild = null;     // disconnect
		   else                            // from parent
		      parent.rightChild = null;
		   }
	
		// if no right child, replace with left subtree
		else if(current.rightChild==null)
		   if(current == root)
		      root = current.leftChild;
		   else if(isLeftChild)
		      parent.leftChild = current.leftChild;
		   else
		      parent.rightChild = current.leftChild;
	
		// if no left child, replace with right subtree
		else if(current.leftChild==null)
		   if(current == root)
		      root = current.rightChild;
		   else if(isLeftChild)
		      parent.leftChild = current.rightChild;
		   else
		      parent.rightChild = current.rightChild;
	
		else  // two children, so replace with inorder successor
		   {
		   // get successor of node to delete (current)
		   Node successor = getSuccessor(current);
	
		   // connect parent of current to successor instead
		   if(current == root)
		      root = successor;
		   else if(isLeftChild)
		      parent.leftChild = successor;
		   else
		      parent.rightChild = successor;
	
		   // connect successor to current's left child
		   successor.leftChild = current.leftChild;
		   }  // end else two children
		// (successor cannot have a left child)
	}//end else stock=0
return true;                                // success
}
//returns node with next-highest value after delNode
//goes to right child, then right child's left descendents
private Node getSuccessor(Node delNode)
{
Node successorParent = delNode;
Node successor = delNode;
Node current = delNode.rightChild;   // go to right child
while(current != null)               // until no more
   {                                 // left children,
   successorParent = successor;
   successor = current;
   current = current.leftChild;      // go to left child
   }
                                     // if successor not
if(successor != delNode.rightChild)  // right child,
   {                                 // make connections
   successorParent.leftChild = successor.rightChild;
   successor.rightChild = delNode.rightChild;
   }
return successor;
}

void preOrder(Node data,double Pd)		//tree traversal
	{
	if(data != null)
	   {
		double matchedData;
		if(data.PropertyCode.var[0] == Pd ||data.PropertyCode.var[1] == Pd ||data.PropertyCode.var[2] == Pd ||data.PropertyCode.var[3] == Pd ||data.PropertyCode.var[4] == Pd
				||data.PropertyCode.var[5] == Pd ||data.PropertyCode.var[6] == Pd ||data.PropertyCode.var[7] == Pd ||data.PropertyCode.var[8] == Pd ||data.PropertyCode.var[9] == Pd
				||data.PropertyCode.var[10] == Pd)
		{
			matchedData=Pd;      //data matched
			System.out.print(data.codeword + "\nYes\n");
		}
	   	preOrder(data.leftChild,Pd);
	   	preOrder(data.rightChild,Pd);
	   }
	}
}//end Tree class


class dataLaptop					//class dataLaptop starts
{
	int DataLaptop()
	{
		int i1=0;
		String s;
		Scanner c = new Scanner(System.in);
		Conversion ObjLaptop1 = new Conversion();
		Property PdObject=new Property();
		Tree TreeObject=new Tree();
		int checkR=0;
		try
		{
			FileWriter f0 = new FileWriter("Laptop Data.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
			FileReader fstream1 = new FileReader("Laptop Data.txt");
			BufferedReader fbr0 = new BufferedReader(fstream1);
			System.out.println("Enter the String that........");
		   	String new1 = c.nextLine();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==8)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<8 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
			fbw0.close();
			fbr0.close();	
		}
		catch (Exception r)		//exception occurs 
		{
            System.out.println("File Not Found...");
        }
		return 0;
	}
	int DataMobile()
	{
		int i1=0;
		String s;
		Scanner c = new Scanner(System.in);
		Conversion ObjLaptop1 = new Conversion();
		Property PdObject=new Property();
		Tree TreeObject=new Tree();
		int checkR=0;
		try
		{
			FileWriter f0 = new FileWriter("Mobile Data.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
			FileReader fstream1 = new FileReader("Mobile Data.txt");
			BufferedReader fbr0 = new BufferedReader(fstream1);
			System.out.println("Enter the String that........");
		   	String new1 = c.nextLine();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==11)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<11 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
			fbw0.close();
			fbr0.close();	
		}
		catch (Exception r)
		{
            System.out.println("File Not Found...");
        }
		return 0;
	}
	int DataGarments()
	{
		int i1=0;
		String s;
		Scanner c = new Scanner(System.in);
		Conversion ObjLaptop1 = new Conversion();
		Property PdObject=new Property();
		Tree TreeObject=new Tree();
		int checkR=0;
		try
		{
			FileWriter f0 = new FileWriter("Garment Data.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
			FileReader fstream1 = new FileReader("Garment Data.txt");
			BufferedReader fbr0 = new BufferedReader(fstream1);
			System.out.println("Enter the String that........");
		   	String new1 = c.nextLine();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
			fbw0.close();
			fbr0.close();	
		}
		catch (Exception r)
		{
            System.out.println("File Not Found...");
        }
		return 0;
	}
}

class Form		//class form starts
{
	int form()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter if 1 you are new user.\n Enter 2 if you are existing user.");
		int choiceUser = input.nextInt();
		
		if(choiceUser == 1)
		{
			try 
			{
                FileWriter fstream5 = new FileWriter("User Data.txt", true);
                BufferedWriter fbw5 = new BufferedWriter(fstream5);
				
				FileWriter fstream6 = new FileWriter("UserName.txt", true);
				BufferedWriter fbw6 = new BufferedWriter(fstream6);
				
				System.out.println("Enter your Name:");
				String name = input.nextLine();
				System.out.println("Enter the UserName By which you can handle your account:");
				String uName = input.nextLine();
				
				String s;
				int count = 1;
				while(count>0)
				{
					FileReader fstream61 = new FileReader("UserName.txt");
					BufferedReader fbr6 = new BufferedReader(fstream61);
					count = 0;
	                while((s = fbr6.readLine()) != null) 
					{ 
						if(s.equals(uName))
						{
							count++;
						}
					} 
					if(count>0)
					{
						System.out.println("Username Already Exist.. Enter Other Username please");
						uName = input.nextLine();
					}
				}
				
				System.out.println("Enter Contact number:");
				String cNumber = input.nextLine();
				System.out.println("Enter your House number (Block Number):");
				String hNumber = input.nextLine();
				System.out.println("Enter your Area name:");
				String area = input.nextLine();
				System.out.println("Enter your City name:");
				String city = input.nextLine();
				System.out.println("Enter the PinCode:");
				String PinCode = input.nextLine();
				System.out.println("Enter your Country name:");
				String country = input.nextLine();
				
                /* Writing system date into the file */
                fbw5.write("Name			:			" + name);
                fbw5.newLine();

                fbw5.write("User Name		:			" + uName);
                fbw5.newLine();

                fbw5.write("Contact Number		:			" + cNumber);
                fbw5.newLine();

                fbw5.write("House Number		:			" + hNumber);
                fbw5.newLine();

                fbw5.write("Area			:			" + area);
                fbw5.newLine();

                fbw5.write("City			:			" + city);
                fbw5.newLine();

                fbw5.write("Pincode			:			" + PinCode);
                fbw5.newLine();

				fbw5.write("Country Name		:			" + country);
                fbw5.newLine();
                
                fbw5.newLine();
                fbw5.newLine();
                fbw5.newLine();
                fbw5.newLine();
                fbw5.newLine();

                fbw5.close();
                
                fbw6.write(uName);
                fbw6.newLine();
                
                fbw6.close();
            } 
			catch (Exception r)
			{
                System.out.println("File Not Found...");
            }
		}
		else
		{
			try 
			{
				System.out.println("Enter the UserName:");
				String existing = input.next();
				String s;
				int count = 1;
				while(count!=0)
				{
					FileReader fstream61 = new FileReader("UserName.txt");
					BufferedReader fbr6 = new BufferedReader(fstream61);
					count = 1;
	                while((s = fbr6.readLine()) != null) 
					{ 
						//System.out.println("Hello");
						if(s.equals(existing))
						{
							count=0;
						}
					} 
					if(count==0)
					{
						System.out.println("USERNAME Found in our Data");
						//uName = input.next();
					}
					else
					{
						System.out.println("Invalid Username");
						System.out.println("Enter the UserName again:");
						existing = input.nextLine();
					}
				}
			} 
			catch (Exception r)
			{
                System.out.println("File Not Found...");
            }
		}
		return 0;
	}
}

class Queue
   {
   private int maxSize;
   private int [] queArray;
   private int front;
   private int rear;
   private int nItems;
//--------------------------------------------------------------
   public Queue(int s)          
      {
      maxSize = s;
      queArray = new int[maxSize];
      front = 0;
      rear = -1;
      nItems = 0;
      }
//--------------------------------------------------------------
   public void enqueue(int item)   // put item at rear of queue
      {
      if(rear == maxSize-1)         // deal with wraparound
         rear = -1;

      queArray[++rear] = item;         // increment rear and insert
      nItems++;                     // one more item
      }
//--------------------------------------------------------------
   public int dequeue()         // take item from front of queue
      {
      int temp = queArray[front++]; // get value and incr front
      if(front == maxSize)           // deal with wraparound
         front = 0;
      nItems--;                      // one less item
      return temp;
      }
//--------------------------------------------------------------
   public int peek()      // peek at front of queue
      {
      return queArray[front];
      }
//--------------------------------------------------------------
   public boolean isEmpty()    // true if queue is empty
      {
      return (nItems==0);
      }
//--------------------------------------------------------------
   public boolean isFull()     // true if queue is full
      {
      return (nItems==maxSize);
      }
//--------------------------------------------------------------
   public int size()           // number of items in queue
      {
      return nItems;
      }
//--------------------------------------------------------------
   }  // end class Queue
