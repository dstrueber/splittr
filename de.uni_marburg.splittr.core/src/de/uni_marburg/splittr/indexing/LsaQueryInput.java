package de.uni_marburg.splittr.indexing;

public class LsaQueryInput {
	public String name;
	public String content;
	
	public LsaQueryInput(String name, String content) {
		this.name = name;
		this.content = content;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
