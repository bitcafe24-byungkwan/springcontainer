package com.cafe24.springcontainer.soundsystem;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component("HighSchoolRapper3Final2")
//@Named("HighSchoolRapper3Final")
public class HighSchoolRapper3Final2 implements CompactDisc {
	private String title = "지구멸망2";
	private String artist = "양승호2";
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
}