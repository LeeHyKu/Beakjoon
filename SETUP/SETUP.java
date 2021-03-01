/*
 * Standard Input and Output in Java
 * 
 * Copyright (C) 2021. Hyun-Ku Lee
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
import java.util.*;

public class Main{
	public static void main(String args[]){
	//EASY INPUT ROUTINE
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	
	//EASY OUTPUT ROUTINE
		System.out.println(a);
		
	//FAST INPUT ROUTINE
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int b = Integer.parseInt(br.readLine());
		br.close();
		
	//FAST OUTPUT ROUTINE
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(Integer.toString(b));
		bw.close();
	}
}