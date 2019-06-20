package com.test.junit;

import java.util.List;

public class Fine {
	
	LibraryInterface lib;
	Library fine; 
	public LibraryInterface getLib() {
		return lib;
	}
	public void setLib(LibraryInterface lib) {
		this.lib = lib;
	}
	public Library getFine() {
		return fine;
	}
	public void setFine(Library fine) {
		this.fine = fine;
	}
	
	public int totalFine(Library l)
	{
		if(lib.delayDays(l) < 10)
			return lib.delayDays(l) *5;
		else if(lib.delayDays(l) >= 10 && lib.delayDays(l) < 30)
			return lib.delayDays(l) *15;
		else
			return lib.delayDays(l) *30;
	}

}
