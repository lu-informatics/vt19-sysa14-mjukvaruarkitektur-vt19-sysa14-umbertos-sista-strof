package ejbModule.test;

import ejbModule.Person;
import junit.framework.TestCase;

public class PersonTest extends TestCase {
	String expectedId;
	String expectedFirstname;
	String expectedLastname;
	String expectedEmail;
	String expectedPhone;
	String expectedPassword;
	Person p1;
	Person p2;

	public PersonTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		p1 = new Person(expectedId, expectedFirstname, expectedLastname, expectedEmail,expectedPhone, expectedPassword);
		p2 = new Person("TestID", "TestFName", "TestLName",	"TestEmail", "TestPhone", "TestPassword");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		p1 = null;
		p2 = null;
	}

	public void testGetId() {
		assertNotNull(p1);
		assertEquals(expectedId,p1.getId());
	}

	public void testSetId() {
		String expectedId2="TestId";
		p1.setId(expectedId2);
		assertEquals(expectedId2,p1.getId());
	}

	public void testGetFirstsname() {
		assertEquals(expectedFirstname,p1.getFirstname());
	}

	public void testSetFirstsname() {
		String expectedFirstname2="TestFname";
		p1.setFirstname(expectedFirstname2);
		assertEquals(expectedFirstname2,p1.getFirstname());
	}

	public void testGetLastname() {
		assertEquals(expectedLastname,p1.getLastname());
	}

	public void testSetLastname() {
		String expectedLastname2="TestLname";
		p1.setLastname(expectedLastname2);
		assertEquals(expectedLastname2,p1.getLastname());
	}

	public void testGetEmail() {
		assertEquals(expectedEmail,p1.getEmail());
	}

	public void testSetEmail() {
		String expectedEmail2="TestEmail";
		p1.setEmail(expectedEmail2);
		assertEquals(expectedEmail2,p1.getEmail());
	}

	public void testGetPhone() {
		assertEquals(expectedPhone,p1.getPhone());
	}

	public void testSetPhone() {
		String expectedPhone2="TestPhone";
		p1.setPhone(expectedPhone2);
		assertEquals(expectedPhone2,p1.getPhone());
	}

	public void testGetPassword() {
		assertEquals(expectedPassword,p1.getPassword());
	}

	public void testSetPassword() {
		String expectedPassword2="TestPassword";
		p1.setPassword(expectedPassword2);
		assertEquals(expectedPassword2,p1.getPassword());
	}
	
	public void testEquals(){
		assertTrue(!p1.equals(null));
		assertEquals(p1,p1);
		assertTrue(!p1.equals(p2));
	}

}
