package ZigZag.Conversion.done;

public class Solution {
	public String convert(String s, int numRows) {
		if (numRows == 1) {
			return s;
		} else if (s == null) {
			return s;
		} else if (numRows < 1) {
			return s;
		} else {
			String out = new String();
			int slen = s.length();
			int cylen = numRows * 2 - 2;
			StringBuffer a0 = new StringBuffer();
			StringBuffer b0 = new StringBuffer();
			StringBuffer cen = new StringBuffer();
			int cyc = slen / cylen + 1;
			String[][] cond = new String[cylen][cyc];
			for (int i = 0; i < slen; i++) {
				int nowi = i % cylen;
				int nowcyc = i / cylen;
				cond[nowi][nowcyc] = s.substring(i, i + 1);
			}
			for (int i = 0; i < cylen; i++) {
				for (int j = 0; j < cyc; j++) {
					if (cond[i][j] != null) {
						if (i == 0) {
							a0.append(cond[i][j]);
						} else if (i < cylen / 2) {
							cen.append(cond[i][j]);
							if (cond[cylen - i][j] != null) {
								cen.append(cond[cylen - i][j]);
							}
						} else if (i == cylen / 2) {
							b0.append(cond[i][j]);
						}
					}
				}
			}
			a0.append(cen);
			a0.append(b0);
			out = a0.toString();
			return out;
		}
	}
}