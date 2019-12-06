package com.yc.java.d1206;

import java.util.Random;

public class Demo2 {

	/**
	 * С�᣺
	 * 	���鶨�壺
	 * 		1  int[] arr = new int[10]   
	 * 		2  int[] arr = new int[]{1,2,3}
	 *  	3  int[] arr = {1,2,3}
	 *  �������ԣ�length ����
	 *  ������ʣ� �±���� 0 ��ʾ��һԪ�أ�  ���һ��Ԫ�ص��±�  length - 1
	 *  		������[ �±� ]
	 *
	 * ����ĸ���
	 * 	1�����ø���
	 * 	2����¡����
	 * 	3��arraycopy����(�߼����ƣ�Ԫ�ظ���) System
	 * 
	 *  Array   Index  Out  Of  Bounds Exception
	 *  ����Խ�� 0~51      52 or -1 
	 * 
	 */

	public static void main(String[] args) {
		/**
		 * ģ���ֹ�����
		 */
		int[] poke = new int[52];
		for (int i = 1; i <= poke.length; i++) {
			System.out.print(i + ",");
			poke[i - 1] = i;
		}

		System.out.println();
		
		// �����������
		Random rand = new Random();
		// �������Ƶ�   0 ~ 51
		int size = rand.nextInt(52); 
		
		System.out.println("���Ƶ㣺" + size);

		// ������ʱ�������Ƶ�������Ƶ�����
		int[] poke1 = new int[size];
		// �����г�����
		System.arraycopy(poke, 0, poke1, 0, size);
		// ��������Ƹ��Ƶ�����
		System.arraycopy(poke, size, poke, 0, poke.length - size);
		// ����ʱ������ƣ����ƻ�poke
		System.arraycopy(poke1, 0, poke, poke.length - size, size);
		// ��ӡ���ƺ�Ľ��
		for (int i = 0; i < poke.length; i++) {
			System.out.print(poke[i] + ",");
		}
		
		// ������ʮ��
		
		/**
		 * ��ҵ��
		 * 1�����˿�����ʾ��Ӧ�Ļ�ɫ��
		 * 		1~13   ���� A ~ K
		 *		14~26 ���� A ~ K
		 * 		27~39 ÷�� A ~ K
		 * 		40~52 ���� A ~ K
		 * 2�����ƣ���52�Ʒָ�4������
		 */
		

	}

	/**
	 * ���ø���
	 */
	public static void copy1() {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = arr1; // ���ø���

		arr1[2] = 100;

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

	/**
	 * ��¡����    ctrl + shift + f �ر����뷨
	 */
	public static void copy2() {
		int[] arr1 = { 1, 2, 3, 4, 5 };

		int[] arr2 = arr1.clone(); // ��¡����

		arr1[2] = 100;

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

	public static void copy3() {
		int[] arr1 = { 1, 2, 3, 4, 5 };

		int[] arr2 = new int[10];

		/**
		 *  ���鸴�Ʒ���
		 *  ����1��src 	 ԭ����
		 *  ����2��srcPos	 ��ԭ����ĵڼ���Ԫ�ؿ�ʼ���ƣ�����ǵ�һ����ô���� 0
		 *  ����3��dest	 Ŀ������
		 *  ����4��destPos ���Ƶ�Ŀ������ĵڼ���Ԫ��λ��
		 *  ����5��length  ���Ƶ�Ԫ�ظ���
		 *  
		 */
		// System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(arr1, 0, arr2, 5, arr1.length);

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ",");
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + ",");
		}
	}

}