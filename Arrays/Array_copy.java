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

class Array_copy {
	public static void main(String[] args) {

        char[] ArrayFrom = { 'm', 'a', 'd', 'e', 'i', 'n', 'i',
			    'n', 'd', 'i', 'a' };
        char[] ArrayTo = new char[7];
		ArrayTo[0] = 'A';
		ArrayTo[1] = 'B';
		ArrayTo[2] = 'C';
        System.out.println(new String(ArrayTo));
		/* arraycopy method requires from array, position in from, to array. position in to, no of characters to be copied*/
		/* if there is no 'length' of characters available in position in from array, error will be thrown*/
		/* similarly, if there is no 'length' of characters available in position in to, error will be thrown*/
        System.arraycopy(ArrayFrom, 6, ArrayTo, 2, 5);
        System.out.println(new String(ArrayTo));
        System.out.println(ArrayTo);
    
		String temp[][] = {{"Mr","Ms"},{"Tarak","Rakul"},{"M","F"}};

		String[][] MultiArrayString;
		MultiArrayString = new String[3][2];

        System.arraycopy(temp, 2, MultiArrayString, 1, 1);


		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print( MultiArrayString[i][j] + " ");
			}
			System.out.println();
		}
	}
}
