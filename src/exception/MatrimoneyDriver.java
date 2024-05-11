package exception;

public class MatrimoneyDriver  {
	public static void main(String[] args) throws Exception {
		Matrimony m = new Matrimony();
		try {
			m.ageVerification(20);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.ageVerification(65);
		m.ageVerification(26);
	}
}
