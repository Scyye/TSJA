package dev.scyye.thunderstoreapi.exceptions;

public class NoSuchCommunityException extends Exception{
	String community;

	public NoSuchCommunityException(String community) {
		this.community = community;
	}
}
