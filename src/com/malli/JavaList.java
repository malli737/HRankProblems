package com.malli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		List list=new ArrayList();
		for(int i=0;i<n;i++)list.add(scanner.nextInt());
		n=scanner.nextInt();
		for(int i=0;i<n;i++){
			String s=scanner.next();
			if(s.contains("Insert")){
				int x=scanner.nextInt(),y=scanner.nextInt();
				list.add(x,y);
			}else{
				int x=scanner.nextInt();
				list.remove(x);
			}
		}
		for(int i=0;i<list.size();i++)System.out.print(list.get(i)+" ");

	}

}
