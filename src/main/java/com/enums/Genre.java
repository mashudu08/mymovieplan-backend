package com.enums;

public enum Genre {
	    ACTION("Action"),
	    COMEDY("Comedy"),
	    DRAMA("Drama"),
	    HORROR("Horror"),
	    ROMANCE("Romance"),
	    SCIFI("Science Fiction");

	    private final String displayName;

	    // Constructor
	    Genre(String displayName) {
	        this.displayName = displayName;
	    }

	    // Getter method
	    public String getDisplayName() {
	        return displayName;
	    }


}
