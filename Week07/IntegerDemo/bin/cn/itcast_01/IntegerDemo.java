// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   IntegerDemo.java

package cn.itcast_01;

import java.io.PrintStream;

public class IntegerDemo
{

	public IntegerDemo()
	{
	}

	public static void main(String args[])
	{
		Integer ii = Integer.valueOf(100);
		ii = Integer.valueOf(ii.intValue() + 200);
		System.out.println((new StringBuilder("ii :")).append(ii).toString());
	}
}
