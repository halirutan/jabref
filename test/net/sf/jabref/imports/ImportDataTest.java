package net.sf.jabref.imports;

import java.io.File;

import junit.framework.TestCase;

/**
 * 
 * @author Nosh&Dan
 * @version 09.11.2008 | 19:41:40
 * 
 */
public class ImportDataTest extends TestCase {

	public static final File FILE_IN_DATABASE = new File("src/resources/tests/net/sf/jabref/imports/unlinkedFilesTestFolder/pdfInDatabase.pdf");
	public static final File FILE_NOT_IN_DATABASE = new File("src/resources/tests/net/sf/jabref/imports/unlinkedFilesTestFolder/pdfNotInDatabase.pdf");
	public static final File EXISTING_FOLDER = new File("src/resources/tests/net/sf/jabref/imports/unlinkedFilesTestFolder");
    public static final File NOT_EXISTING_FOLDER = new File("notexistingfolder");
    public static final File NOT_EXISTING_PDF = new File("src/resources/tests/net/sf/jabref/imports/unlinkedFilesTestFolder/null.pdf");
    public static final File UNLINKED_FILES_TEST_BIB = new File("src/resources/tests/net/sf/jabref/util/unlinkedFilesTestBib.bib");

	/**
	 * Tests the testing environment.
	 */
	public void testTestingEnvironment() {
		assertTrue(EXISTING_FOLDER.exists());
		assertTrue(EXISTING_FOLDER.isDirectory());
		
		assertTrue(FILE_IN_DATABASE.exists());
		assertTrue(FILE_IN_DATABASE.isFile());
		
		assertTrue(FILE_NOT_IN_DATABASE.exists());
		assertTrue(FILE_NOT_IN_DATABASE.isFile());
	}
	
	public void testOpenNotExistingDirectory() {
		assertFalse(NOT_EXISTING_FOLDER.exists());
        assertFalse(NOT_EXISTING_PDF.exists());
	}

}
