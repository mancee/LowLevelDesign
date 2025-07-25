package Leetcode;

enum LANGUAGE{
	JAVA, PYTHON, JAVASCRIPT, C, CPP
}

public class Solution {
	private int id;
	private String code;
	private LANGUAGE lang;
	
	
	public Solution(int id, String code, LANGUAGE lang) {
		this.id = id;
		this.code = code;
		this.lang = lang;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public LANGUAGE getLang() {
		return lang;
	}
	public void setLang(LANGUAGE lang) {
		this.lang = lang;
	}
	
	
	
}
