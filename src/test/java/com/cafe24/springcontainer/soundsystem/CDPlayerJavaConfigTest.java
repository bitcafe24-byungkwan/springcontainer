package com.cafe24.springcontainer.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.soundsystem.CDPLayerConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPLayerConfig.class)
public class CDPlayerJavaConfigTest {
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private CDPlayer player;
	
	@Test
	public void testCDNull() {
		assertNotNull(cd);
	}
	
	@Test
	public void testPlayerNull() {
		assertNotNull(player);
	}

	@Test
	public void testPlay() {
		player.play();
		assertEquals("Playing 지구멸망 by 양승호\r\n", systemOutRule.getLog());
		
	}
}