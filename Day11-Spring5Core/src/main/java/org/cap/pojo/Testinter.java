package org.cap.pojo;

import java.io.IOException;

public interface Testinter {
	
	public void print() throws IOException;

	
	
}

class Test implements Testinter
{
    public void print()throws IOException 
    {
        System.out.println("In print");
    }
}


