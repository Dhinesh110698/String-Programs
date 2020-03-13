package com.Strings;

public class NonRepeateOneCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="dhinesh";
		boolean repeat=false;
		char c=name.charAt(0);
		for(int i=1;i<name.length();i++)
		{
			if(c==name.charAt(i))
			{
				repeat=true;
			}
		}
			if(repeat==false)
			{
				System.out.println(c +"  is non repeated");
			}
		}

	}


