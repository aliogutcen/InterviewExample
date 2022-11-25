import java.util.ArrayList;

class Solution {
	public static void main(String[] args) {
		
	}
    public ArrayList<String> genIp(String s) {
        ArrayList<String> res = new ArrayList<String>();
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {
                    for (int l = 1; l <= 3; l++) {
                        if (i + j + k + l == s.length()) {
                            int a = Integer.parseInt(s.substring(0, i));
                            int b = Integer.parseInt(s.substring(i, i + j));
                            int c =
                                Integer.parseInt(s.substring(i + j, i + j + k));
                            int d = Integer.parseInt(
                                s.substring(i + j + k, i + j + k + l));

                            if (isOk(a, b, c, d)) {
                                String str = make(a, b, c, d);
                                /*+3 because of 3 dots*/
                                if (str.length() == s.length() + 3) {
                                    res.add(str);
                                }
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
    public static boolean isOk(int a, int b, int c, int d) {
        return a <= 255 && b <= 255 && c <= 255 && d <= 255;
    }

    public static String make(int a, int b, int c, int d) {
        return String.valueOf(a) + "." + String.valueOf(b) + "." +
               String.valueOf(c) + "." + String.valueOf(d);
    }
}