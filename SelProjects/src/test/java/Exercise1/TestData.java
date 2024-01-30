package Exercise1;

import java.util.ArrayList;
import java.util.List;

public class TestData {
	    
	    private String username;
	    private String password;

	    public TestData(String username, String password) {
	        this.username = username;
	        this.password = password;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    // Create a list to store the test data
	    public static List<TestData> testDataList = new ArrayList<>();

	    // Add test data to the list
	    static {
	       
	        testDataList.add(new TestData("xxxxx", "zUgEgab"));
	        testDataList.add(new TestData("mngr527123", "xxxxx"));
	        testDataList.add(new TestData("xxxxx", "xxxxx"));
	        testDataList.add(new TestData("mngr527123", "zUgEgab"));
	    }
	}

