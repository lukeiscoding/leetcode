package ZigZag.Conversion.done;

//https://leetcode.com/problems/zigzag-conversion/

public class app {
	public static void main(String[] args) {
		String words = "PAYPALISHIRING";
		Solution nsol = new Solution();
		String nnsol = nsol.convert(words, 3);
		System.out.println(nnsol);
	}
}
