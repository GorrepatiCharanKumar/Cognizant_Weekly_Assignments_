package com.example;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

//import com.sun.tools.javac.util.Assert;

   public class MyServiceTest { 
    @Test 
    public void testExternalApi() { 
        //mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class); 
        //stub
        when(mockApi.getData()).thenReturn("Mock Data"); 
        //using
        MyService service = new MyService(mockApi); 
        String result = service.fetchData(); 
        assertEquals("Mock Data", result); 
    } 
    
}