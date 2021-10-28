package com.xworkz.patient.operator;

public class WarddrobeOperator {
	String[] wardDrobe=new String[5];
	int count=0;
	
	public boolean add(String thing)
	{
		if(thing!=null && this.count<this.wardDrobe.length)
		{
		 
		 System.out.println("<----------invoked add --------> ");
		 
		 this.wardDrobe[count]=thing;
		 count++;
		 System.out.println(" added --------> ".concat(thing));
		 for(int i=0;i<wardDrobe.length;i++)
		 {
			String ref=this.wardDrobe[i];
			 System.out.println(ref);
		 }
		 return true;
		}
		else
		{
			System.err.println("this is not added,  it should be null or wardDrobe is full");
		}
		return false;
	}
	public boolean update(int index,String newThing)
	{
		
	 if(index>=0 && newThing!=null && index<this.wardDrobe.length)		
	 {
		 System.out.println("invoked update --------> ".concat(newThing));
		 this.wardDrobe[index]=newThing;
		 for(int i=0;i<wardDrobe.length;i++)
		 {
			String ref=this.wardDrobe[i];
			 System.out.println(ref);
		 }
		 return true;
	 }
	 else
	 {
		 System.err.println("invaild index, index should be less than".concat(newThing));
	 }
		return false;
	}
  public boolean delete(int no)
  {
	  System.out.println("invoke delete");
	  if(no>=0 && no<this.wardDrobe.length)
	  {
		  this.wardDrobe[no]=null;
		  for(int i=0;i<wardDrobe.length;i++)
			 {
				String ref=this.wardDrobe[i];
				 System.out.println(ref);
			 }
		  return true;
	  }
	  else {
		  System.err.println("invaild index,  index should be less than".concat(String.valueOf(wardDrobe.length).concat("and greater than zero")));
	  }
	  return false;
  }
  public boolean match(String thing)
  {
	  System.out.println("invoke match");
	  for(int i=0;i<wardDrobe.length;i++)
	  {
		  String temp=this.wardDrobe[i];
		  if(temp!=null)
		  {
			  if(temp.equals(thing))
			  {
				  System.out.println("thing is match".concat(thing));

				  return true;
			  }
			  else
			  {
				  System.err.println("thing is not  matched".concat(thing));

			  }
		  }
	  } 
  
	  return false;
  }
	 public boolean matchFirstChar(String chr)
	  {
		  System.out.println("invoke matchFirstChar  ");
		  Character  c=chr.charAt(0);
		 for(int i=0;i<wardDrobe.length;i++)
		  {
			  String temp=this.wardDrobe[i];
			  if(chr!=null)
			  {
				  Character  h=temp.charAt(0);
				  if(c.equals(h))
				  {
						System.out.println("first character of "+chr+" matched with "+this.wardDrobe[i]);
						return true;
				  }
				  
			  }
			  
		  }
		  return false;

	  }

	 public boolean matchLastChar(String chr)
	  {
		  System.out.println("invoke matchLastChar  ");
		  Character  c=chr.charAt(chr.length()-1);
		 for(int i=0;i<wardDrobe.length;i++)
		  {
			  String temp=this.wardDrobe[i];
			  if(temp!=null)
			  {
				  Character  h=temp.charAt(temp.length()-1);
				  if(c.equals(h))
				  {
						System.out.println("Last character of "+chr+" matched with "+this.wardDrobe[i]);
						return true;
				  }
			  }
		  }
		return false;
	  }
}