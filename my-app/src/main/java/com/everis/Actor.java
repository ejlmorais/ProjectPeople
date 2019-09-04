package com.everis;

public class Actor extends People {

	
	private Integer oscarNominations;

	public Actor(Integer oscarNominations) {
		super();
		this.oscarNominations = oscarNominations;
	}

	public Integer getOscarNominations() {
		return oscarNominations;
	}

	public void setOscarNominations(Integer oscarNominations) {
		this.oscarNominations = oscarNominations;
	}
	
	enum TipoActor{
		MAIN, SUPPORTING, STUNTMAN
	}
	
	/* public static void main(String[] args) { 
		    TipoActor act = TipoActor.SUPPORTING; 
		    System.out.println("O ACTOR É " + act); 
		  } */
}
