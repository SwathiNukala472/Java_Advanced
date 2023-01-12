package com.test.java8;

public class BitwiseAlogoritham {

	public static void main(String[] args) {
		int number1 = 12, number2 = 25, result;
		/*
		 *           * Bitwise OR Operation of 12 and 25 00001100 | 00011001
		 * ____________ 00011101 =            * 29 (In Decimal)           
		 */
		// bitwise OR between 12 and 25
		result = number1 | number2;
		System.out.println(result);

		/*
		 *    * 12 = 00001100 (In Binary) 25 = 00011001 (In Binary)    *     * //
		 * Bitwise AND Operation of 12 and 25 00001100 & 00011001 ____________     *
		 * 00001000 = 8 (In Decimal)   
		 */

		// bitwise AND between 12 and 25
		result = number1 & number2;
		System.out.println(result);

		/*
		 *      * 12 = 00001100 (In Binary) 25 = 00011001 (In Binary)
		 *                   * // Bitwise XOR Operation of 12 and 25
		 * 00001100 ^ 00011001 ____________                  * 00010101 = 21 (In
		 * Decimal)                 
		 */
		// bitwise XOR between 12 and 25
		result = number1 ^ number2;
		System.out.println(result);

	}
}
