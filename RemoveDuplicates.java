package Week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");
		Set<String> words = new LinkedHashSet<String>();

		for(String eachValue: split)
		{
			boolean op = words.add(eachValue);
			if(op==true)
			{
				System.out.print(eachValue+" ");}}}}
			
