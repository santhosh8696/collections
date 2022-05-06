package com.sant.spring.bean;


import org.springframework.stereotype.Component;

@Component

public class MediaTek implements MobileProcessor
{
	 public void process() 
	 {
		System.out.println("2nd best cpu"); 
}

    
}
