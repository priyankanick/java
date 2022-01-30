import java.util.Scanner;
class Doublelist {
          node head;
          node ptr;node ptr1;
          private class node
	 {
           int data;
  	   node llink;
	   node rlink;
         }
 public void create() {
  Scanner sc= new Scanner(System.in);
  System.out.println("enter the quantity you want to insert-->");
  int n=sc.nextInt();
int count=0;
  for(int i=0;i<n;i++)
   {
        node newnode=new node();
        System.out.println("enter data");
        int x=sc.nextInt();
        newnode.data=x;
        newnode.llink=null;
        newnode.rlink=null;
	if(head==null)
	   head=newnode;
	else
	 {
	    ptr=head;
	   while(ptr.rlink!=null)
            {   
        	ptr=ptr.rlink;
            }
           ptr.rlink=newnode;
	   newnode.llink=ptr;
       }  
   }
count=n;
 }
public void display() {
 if(head==null)
  System.out.println("empty list");
  else
  {
    System.out.println("the list is-->");
     ptr=head;
    while(ptr!=null)
    {
      System.out.print(ptr.data +"->");
      ptr=ptr.rlink;
    }
     System.out.println("null");
 }
}
public void insert() {

 Scanner sc=new Scanner(System.in);
 System.out.println("1.insert_first 2.insert_last 3.insert_anyposition  enter your choice");
 int ch=sc.nextInt();
 
     node newnode=new node();
     System.out.println("enter the data");
     int p=sc.nextInt();
     newnode.data=p;
     newnode.llink=null;
     newnode.rlink=null;
 switch(ch)
  { 
   case 1:
     newnode.rlink=head;
     head.llink=newnode;
     newnode.llink=null;
     head=newnode;
     break;
 
   case 2:
     if(head==null)
      {
        head=newnode;
	return;
      }
    ptr=head;
    while(ptr.rlink!=null)
    ptr=ptr.rlink;
    ptr.rlink=newnode;
    newnode.llink=ptr;
    newnode.rlink=null; 
    break;
  case 3:
     System.out.println("enter the position");
     int pos=sc.nextInt();
     ptr=head;
     ptr1=head;
     for(int i=1;i<pos;i++)
	{
	  ptr1=ptr;
          ptr=ptr.rlink;  
	}
     newnode.rlink=ptr;
     newnode.llink=ptr1;
     ptr1.rlink=newnode;
     ptr.llink=newnode;
     break;
      
 default:
    System.out.println("wrong choice");
    break;

}
}
public void del()  {
 if(head==null)
  {
    System.out.println("empty list");
    return;
  }
Scanner sc=new Scanner(System.in);
System.out.println("1.delet_first 2.delet_last 3.delete_any_position   ENTER YOUR CHOICE");
int ch=sc.nextInt();
switch(ch) {
case 1: 
	head=head.rlink;
        head.llink=null;
	break;
case 2:
        ptr=head;
	ptr1=head;
	while(ptr.rlink!=null)
   	{
	   ptr1=ptr;
	   ptr=ptr.rlink;
        }
	ptr1.rlink=null;
	break;
case 3: 
	System.out.println("enter the position");
	int pos=sc.nextInt();
	ptr=head;
	ptr1=head;	
	for(int i=1;i<pos;i++)
	{
	  ptr1=ptr;
	  ptr=ptr.rlink;
	}
	 
	ptr1.rlink=ptr.rlink;
}
}
 public void revers()
  {
    if(head==null)
    {
     System.out.println("empty list");
     return;
    }
ptr=head;
while(ptr.rlink!=null)
  ptr=ptr.rlink;
while(ptr!=head)
{
 System.out.print(ptr.data +"->");
 ptr=ptr.llink;  
 }
System.out.print(head.data +"->");
System.out.println("null");
}
}
class DLL {
  public static void main(String[] args)
   { 
    Doublelist obj=new Doublelist();
    while(true) {
    Scanner sc=new Scanner(System.in);
    System.out.println("1.create 2.insert 3.display 4.delete 5.reverse 6.exit-->enter choice");
    System.out.println("enter your choice");
    int ch=sc.nextInt();
    switch(ch)
    {
      case 1:
            obj.create();
            obj.display(); 
	    break;
     case 2:
	   obj.insert();
	   obj.display();
           break;
     case 3:
	    obj.display();
            break;
     case 4:
 	    obj.del();
  	    obj.display();
            break;
     case 5:
	   obj.revers();
	   break;
     case 6:
	   System.exit(0);
            break;
    default:
          System.out.println("wrong choice");
            
    }  
   
    }
 }
}
//good morning