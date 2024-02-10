package dsa.lab3.question2;

import java.util.ArrayList;
import java.util.Scanner;






public class PairSumBinarySearchTree {

	static ArrayList<Integer> nodeList = new ArrayList<>();

	public static void main(String[] args) {
		Node root=null;
		Node indicator;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Nodes");
		int size = scanner.nextInt();
		int i;
		int data;
		for(i=1;i<=size;i++)
		{
			System.out.println("Enter the Data for Node "+i+" : ");
			data = scanner.nextInt();
			indicator=new Node(data);
			if(root==null)
			{
				root=indicator;
			}
			else
			{								
				insert(root,indicator);			
			}								
		}



		inOrder(root);


		System.out.println("Enter the Sum");
		int sum = scanner.nextInt(); 

		int n1;
		int n2;
		int flag=0;
		for(int j=nodeList.size()-1;j>=0;j--)
		{
			n1=nodeList.get(j);   
			n2=sum-n1;           
			if(nodeList.contains(n2))
			{
				if(n2!=n1)
				{
					System.out.println("Pair Nodes Found : Pair is ("+n2+","+n1+")");
					flag=1;
					break;
				}
			}	
		}
		if(flag==0)
			System.out.println("Pair Nodes are NOT FOUND");


		scanner.close();

	}

	static void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			nodeList.add(root.data);
			inOrder(root.right);
		}
	}

	private static void insert(Node root, Node indicator) 
	{
		if(indicator.data>root.data)
		{
			if(root.right==null)
			{
				root.right=indicator;
			}
			else
			{
				insert(root.right,indicator);
			}
		}
		else				 
		{
			if(root.left==null)  
			{
				root.left=indicator;
			}
			else
			{
				insert(root.left,indicator);
			}
		}

	}
}
