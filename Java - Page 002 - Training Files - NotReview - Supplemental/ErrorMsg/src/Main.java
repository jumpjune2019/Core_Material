
public class Main {

	public static void main(String[] args) {
		ErrorMsg err = new ErrorMsg();
		System.out.println(err.getErrorMsg(2));
		System.out.println("\n");
		ErrorInfo err1 = new ErrorInfo();
		Err e;
		
		e = err1.getErrorInfo(2);
		System.out.println(e.msg + " - Severity: " + e.severity);
		System.out.println("\n");
		e = err1.getErrorInfo(19);
		System.out.println(e.msg + " - Severity: " + e.severity);		
		
	}

}
