/*
 * Copyright (C) 2018 Pineapple Soft
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package timestablescore;

/**
 *
 * @author David Ward
 * @version 1.0.0.
 */
public class Multiplication {
    
    /**
     * Takes two integers and multiplies the first by the second and returns
     * the answer.
     * 
     * @param firstNumber
     * @param secondNumber
     * @return answer
     */
    public static int multiply(int firstNumber, int secondNumber)
    {
        return firstNumber * secondNumber;                
    }
    
    /**
     * Returns true if first number multiplied by the second number equals
     * the answer.
     * 
     * @param firstNumber
     * @param secondNumber
     * @param answer
     * @return True if answer is correct.
     */
    public static boolean checkAnswer(int firstNumber, int secondNumber, int answer)
    {
        return firstNumber * secondNumber == answer;        
    }
    
}
