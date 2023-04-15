
public class Linkedlist
{
   Node head;

 public void deleteData(int value) {
	 if(head==null) {
		 System.out.println("LinkedList is empty");
	 }else if(head.data==value){
		 head=head.next;
	 }
	 else {
	     Node previous = head;
		 Node temp=head.next;
		 while(temp.next!=null) {
			 if(temp.data==value)
				 previous.next = previous.next.next;
			temp = temp.next;
			previous = previous.next;
		 }
		 if(temp.data==value) {
			 previous.next=null;
		 }
	 }
 }
 
 public void deleteDatabyPos(int pos) {
	 int count =1;
	 if(head==null) {
		 System.out.println("LinkedList is empty");
	 }else if(count == pos){
		 head=head.next;
	 }
	 else {
	     Node previous = head;
		 Node temp=head.next;
		 while(temp.next!=null) {
			 count++;
			 //System.out.println("Count "+count);
			 if(count==pos)
				 previous.next = previous.next.next;
			temp = temp.next;
			previous = previous.next;
		 }
		 if(count==pos ) {
			 previous.next=null;
		 }
	 }
 }
   
   public void insertData(int value)
{
	Node newNode=new Node(value);
	if(head==null)
	{
		head =newNode;
	}
	else
	{
		Node temp= head ; 
	while (temp.next != null )
	{				
		temp = temp.next;				
	}			
	temp.next = newNode;				
}
	
}
public void displayData()
{
	Node temp=head;
	while(temp.next !=null){
		System.out.print(temp.data+" ");
		temp = temp.next;
	}
	System.out.println(temp.data+" ");
	
}
public void insertData(int value ,int pos)
{
	Node newNode=new Node(value);
	int count=1;
	if(head==null) {
		head=newNode;
	}
	else
	{
		Node temp= head ; 
		while ((temp.next != null) && (count != pos)){		
			count += 1;
			temp = temp.next;
		}if(temp.next!=null) {
		   Node temp2= temp.next;
		   temp.next=newNode;
		   newNode.next=temp2;
		
		}else {
			temp.next=newNode;
		}
	}
		
}
}