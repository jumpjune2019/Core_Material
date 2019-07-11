
public class ErrorInfo {

	String msgs[] = {
		"Output Error",
		"Input Error",
		"Disk Full",
		"Index Out-Of_Bounds"
	};	
	
	int howbad[] = { 3, 3, 2, 4 };
	
	Err getErrorInfo(int i) {
		if(i >= 0 & i < msgs.length) {
			return new Err(msgs[i], howbad[i]);
		} else {
			return new Err("Invalid Error Code", 0);
		}
	}

}
