
public class ErrorMsg {

	String msgs[] = {
		"Output Error",
		"Input Error",
		"Disk Full",
		"Index Out-Of_Bounds"
	};
	
	String getErrorMsg(int i) {
		if(i >= 0 & i < msgs.length) {
			return msgs[i];
		} else {
			return "Invalid Error Code";
		}
	}

}
