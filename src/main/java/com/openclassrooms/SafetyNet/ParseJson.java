package com.openclassrooms.SafetyNet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ParseJson {
	
	  @SuppressWarnings("unchecked")
	    public static void Parse()   {
	        
	       try  {
	    	         	   
	    	   CompositeModel Model = new ObjectMapper().readValue(new File("src/main/resources/data.json"), CompositeModel.class );
	    	      	         
	       	} catch (FileNotFoundException e) {
	          e.printStackTrace();
	       	} catch (IOException e) {
	          e.printStackTrace();
	       	}                       
	    }

}
