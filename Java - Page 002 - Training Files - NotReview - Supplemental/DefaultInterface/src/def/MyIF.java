package def;

public interface MyIF {
	int getUserID();
	default int getAdminID() {
		return 1;
	}
	static int getUniversalID() {
		return 110;
	}
}
