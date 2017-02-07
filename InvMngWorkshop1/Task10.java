package gla.cs.joose.coursework.invmgt;

import static org.junit.Assert.*;
import org.junit.Test;
import gla.cs.joose.coursework.invmgt.model.ItemFactory;

/***
 * 
 * Set of JUNIT tests for invmgt package, testing the use cases for addItem function
 * in ItemFactory.java, created by tslgenerator
 * 
 * The tests created can be found in addItem.c.s.tsl
 * 
 * @author 2141487, 2230072, 2167936
 */

 
public class Task10 {
	//V for Valid
	private static final long VBARCODE = 100;
	private static final String VNAME = "Butter";
	private static final int VQUANTITY = 3;
	private static final int VNOQUANTITY = 0;
	private static final String VSUPPLIER = "Ruwaid";
	private static final String VITEMTYPE = "OUTDOOR";
	private static final String VDESC = "This item is made for testing!";
	
	private static final long LOWERTHANMINBAR = 98;
	private static final long GREATERTHANMAXBAR = 99999;
	private static final int LOWERTHANMINQUN = -1;
	private static final int GREATERTHANMAXQUN = 102;
	private static final Integer NULLINT=null;
	private static final String EMPTY = "";
	private static final String NULL= null;
	private static final String SPECIALCHAR = "%!?@Â£$%";
	private static final String CHARACTERS= "\\A\\p{ASCII}*\\z";


	// Test Case 1
	@Test
	public void testIncompleteItem() {
		try {
			ItemFactory.addItem(Long.parseLong(NULL), NULL, NULL, NULLINT, NULL, NULL);
			fail("Exception was expected as Item was empty.");
		} catch (IllegalArgumentException e) {

		}
	}

	// Test Case 2
	@Test
	public void testDuplicateItem(){
		try {
			ItemFactory.addItem(VBARCODE, VNAME, VITEMTYPE, VQUANTITY, VSUPPLIER, VDESC);
			ItemFactory.addItem(VBARCODE, VNAME, VITEMTYPE, VQUANTITY, VSUPPLIER, VDESC);
			fail("Exception was expected as there are duplicate Items.");
		} catch (IllegalArgumentException e) {

		}
	}

	// Test Case 3
	@Test
	public void testItemBarcodeEmpty(){
		try {
			ItemFactory.addItem(Long.parseLong(NULL), VNAME, VITEMTYPE, VQUANTITY, VSUPPLIER, VDESC);
			fail("Exception was expected as Barcode was empty.");
		} catch (IllegalArgumentException e) {

		}
	}

	// Test Case 4
	@Test
	public void testItemBarcodeHasChars(){
		try {
			ItemFactory.addItem(Long.parseLong(CHARACTERS), VNAME, VITEMTYPE, VQUANTITY, VSUPPLIER, VDESC);
			fail("Exception was expected as Barcode contains Characters.");
		} catch (IllegalArgumentException e) {

		}
	}
	
	// Test Case 5
	@Test
	public void testItemBarcodeLessThanMin(){
		try {
			ItemFactory.addItem(LOWERTHANMINBAR, VNAME, VITEMTYPE, VQUANTITY, VSUPPLIER, VDESC);
			fail("Exception was expected as Barcode is less than Min.");
		} catch (IllegalArgumentException e) {

		}
	}
	
	// Test Case 6
	@Test
	public void testItemBarcodeGreaterThanMax(){
		try {
			ItemFactory.addItem(GREATERTHANMAXBAR, VNAME, VITEMTYPE, VQUANTITY, VSUPPLIER, VDESC);
			fail("Exception was expected as Barcode is greater than Max.");
		} catch (IllegalArgumentException e) {

		}
	}

	// Test Case 7
	@Test
	public void testItemNameEmpty(){
		try {
			ItemFactory.addItem(VBARCODE, EMPTY, VITEMTYPE, VQUANTITY, VSUPPLIER, VDESC);
			fail("Exception was expected as ItemName was empty.");
		} catch (IllegalArgumentException e) {

		}
	}

	// Test Case 8
	@Test
	public void testItemNameNull(){
		try {
			ItemFactory.addItem(VBARCODE, NULL, VITEMTYPE, VQUANTITY, VSUPPLIER, VDESC);
			fail("Exception was expected as ItemName was null.");
		} catch (IllegalArgumentException e) {

		}
	}

	// Test Case 9
	@Test
	public void testItemNameSpecialChar(){
		try {
			ItemFactory.addItem(VBARCODE, SPECIALCHAR, VITEMTYPE, VQUANTITY, VSUPPLIER, VDESC);
			fail("Exception was expected as ItemName has special characters.");
		} catch (IllegalArgumentException e) {

		}
	}

	// Test Case 10
	@Test
	public void testQuantityNull(){
		try {
			ItemFactory.addItem(VBARCODE, VNAME, VITEMTYPE, Integer.parseInt(NULL), VSUPPLIER, VDESC);
			fail("Exception was expected as Quantity was null.");
		} catch (IllegalArgumentException e) {

		}
	}

	// Test Case 11
	@Test
	public void testQuantityEmpty(){
		try {
			ItemFactory.addItem(VBARCODE, VNAME, VITEMTYPE,Integer.parseInt(EMPTY) , VSUPPLIER, VDESC);
			fail("Exception was expected as Quantity was Empty.");
		} catch (IllegalArgumentException e) {

		}
	}
	// Test Case 12
	@Test
	public void testQuantityCharacters(){
		try {
			ItemFactory.addItem(VBARCODE, VNAME, VITEMTYPE, Integer.parseInt(CHARACTERS) , VSUPPLIER, VDESC);
			fail("Exception was expected as Quantity has characters.");
		} catch (IllegalArgumentException e) {

		}
	}

	// Test Case 13
	@Test
	public void testQuantityZero(){
		try {
			ItemFactory.addItem(VBARCODE, VNAME, VITEMTYPE, VNOQUANTITY , VSUPPLIER, VDESC);
		} catch (IllegalArgumentException e) {
			fail("Exception was expected as Quantity was zero.");
		}
	}

	// Test Case 14
	@Test
	public void addItemQunLessThanMin() {
		try {
			ItemFactory.addItem(VBARCODE, VNAME, VITEMTYPE, LOWERTHANMINQUN, VSUPPLIER, VDESC);
			fail("Exception was expected as Quantity was less than zero.");
		} catch (IllegalArgumentException e) {

		}

	}

	// Test Case 15
	@Test
	public void addItemQunGreaterThanMax() {
		try {
			ItemFactory.addItem(VBARCODE, VNAME, VITEMTYPE, GREATERTHANMAXQUN, VSUPPLIER, VDESC);
			fail("Exception was expected as Quantity was greater than zero.");
		} catch (IllegalArgumentException e) {

		}

	}

	// Test Case 16
	@Test
	public void addItemSupplierNull() {
		try {
			ItemFactory.addItem(VBARCODE, VNAME, VITEMTYPE, VQUANTITY, NULL, VDESC);
			fail("Exception was expected as Quantity was empty.");
		} catch (IllegalArgumentException e) {

		}

	}

	// Test Case 17
	@Test
	public void addItemEmptySupplier() {
		try {
			ItemFactory.addItem(VBARCODE, VNAME, VITEMTYPE, VQUANTITY, EMPTY, VDESC);
			fail("Exception was expected as Supplier was empty.");
		} catch (IllegalArgumentException e) {

		}

	}

	// Test Case 18
	@Test
	public void addItemSpecialCharSupplier() {
		try {
			ItemFactory.addItem(VBARCODE, VNAME, VITEMTYPE, VQUANTITY, SPECIALCHAR, VDESC);
			fail("Exception was expected as Supplier has special characters.");
		} catch (IllegalArgumentException e) {

		}

	}

	// Test Case 19
	@Test
	public void addItemValidOne() {
		try {
			ItemFactory.addItem(VBARCODE, VNAME, VITEMTYPE, VQUANTITY, VSUPPLIER, VDESC);
		} catch (IllegalArgumentException e) {
			fail("Was unable to add a valid item");
		}

	}	

	// Test Case 20
	@Test
	public void addItemValidTwo() {
		try {
			ItemFactory.addItem(VBARCODE, VNAME, VITEMTYPE, VNOQUANTITY, VSUPPLIER, VDESC);
		} catch (IllegalArgumentException e) {
			fail("Was unable to add a valid item");
		}

	}	

}
