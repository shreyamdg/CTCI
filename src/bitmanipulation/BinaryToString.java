package bitmanipulation;

public class BinaryToString {
	public static String printBinary(double num) {
		if (num >= 1 || num <= 0)
			return "ERROR";

		StringBuilder sb = new StringBuilder();
		sb.append("0.");

		while (num > 0) {
			if (sb.length() > 32) {
				return "ERROR";
			}
			double bin = num * 2;

			if (bin >= 1) {
				sb.append("1");
				num = bin - 1;
			} else {
				sb.append("0");
				num = bin;
			}
		}

		return "";
	}
}
