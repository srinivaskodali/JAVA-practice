/*
 * Copyright (c) 2017, Srinivas Kodali. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of srinivas kodali or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

class ArrayBasic {
	public static void main(String[] args) {

		/* Declaration of arrays - No memory will be allocated here. This for compiler to understand the variable data types*/
		int[] ArrayInt;
		char[] ArrayChar;
		String[] ArrayString;
		int[][] MultiArrayInt;
		char[][] MultiArrayChar;
		String[][] MultiArrayString;

		/* Intialization of arrays - memory will be allocated here*/
		ArrayInt = new int[10];
		ArrayChar = new char[10];
		ArrayString = new String[10];
		MultiArrayInt = new int[3][5];
		MultiArrayChar = new char[4][5];
		MultiArrayString = new String[3][2];

		/* assign value to the arrays*/
		for(int i=0; i < 10; i ++) {
			ArrayInt[i] = i + i;
			System.out.println("Element at index " + i + " is " + ArrayInt[i]);
			
			ArrayChar[i] = (char)(i + 65) ;
			System.out.println("Character index " + i + " is " + ArrayChar[i]);

			ArrayString[i] = "new value is " + i + " ";
			System.out.println("String at index " + i + " is " + ArrayString[i]);
			
			/* print new line */
			System.out.println();
		}

		/* assign values to the 2 dimension integer array*/
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				MultiArrayInt[i][j] = i + j;
				System.out.print( MultiArrayInt[i][j] + " ");
			}
			System.out.println();
		}
	}

}
