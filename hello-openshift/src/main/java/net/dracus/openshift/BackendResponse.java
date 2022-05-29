package net.dracus.openshift;

public class BackendResponse {

	private String msg1;
	private String msg2;
	private String msg3;

	private String secret;

	public String getMsg1() {
		return msg1;
	}

	public String getMsg2() {
		return msg2;
	}

	public String getMsg3() {
		return msg3;
	}

	public String getSecret() {
		return secret;
	}

	@Override
	public String toString() {
		var toString = "BackendResponse:\n";
		toString = toString + "> msg1: " + this.msg1 + "\n";
		toString = toString + "> msg2: " + this.msg2 + "\n";
		toString = toString + "> msg3: " + this.msg3 + "\n";
		toString = toString + "> secret: " + this.secret + "\n";
		return toString;
	}
}
