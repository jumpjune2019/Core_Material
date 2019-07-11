
public class ErrorMsg {

	final int OUTERR	= 0;
	final int INERR		= 1;
	final int DISKERR	= 2;
	final int INDEXERR	= 3;
	
	String msgs[] = {
		"Output Error",
		"Input Error",
		"Disk Full",
		"Index Out-Of-Bounds"
	};
	
	String getErrorMsg (int i) {
		String result;
		if ( i >= 0 & i < msgs.length ) {
			result = msgs[i];
		} else {
			result = "Invalid Error Code";
		}
		return result;
	}

}
