

public class Rider extends User {

	Rider(String uN, String em, String p, Profile pf) {
		super(uN, em, p, pf);
	}

	public void requestRide() {

	}

	public Profile checkDriverProfile(Profile P) {
		return P;
	}

	public void setDestination(String dest) {

	}

	public String getDestination() {
		return "it works";
	}

}
