package com.puppetlabs.geppetto.catalog.test;

import java.io.File;

import junit.framework.TestCase;

import com.puppetlabs.geppetto.catalog.Catalog;
import com.puppetlabs.geppetto.catalog.util.CatalogJsonSerializer;
import com.puppetlabs.geppetto.catalog.util.CatalogRspecGenerator;
import org.eclipse.core.runtime.Path;

public class TestCatalogRspec extends TestCase {

	public static final String expectedRspec1 = "# Puppet RSpec Tests asserting that a catalog for a given host is compliant with\n"
			+ "# rules derived from a baseline catalog obtained for host: 'testcentos.pilsen.cloudsmith.com'\n"
			+ "# Generated by: com.puppetlabs.geppetto.catalog.util.CatalogRspecGenerator\n"
			+ "# Generated at: Aug 25, 2012\n"
			+ "\n"
			+ "require 'spec_helper'\n"
			+ "\n"
			+ "describe 'testcentos.pilsen.cloudsmith.com', :type => :host do\n"
			+ "  # Set facts to empty hash, and expect them to be injected\n"
			+ "  let(:facts) { { } }\n"
			+ "\n"
			+ "  it {\n"
			+ "    # Classes (in alphabetical order)\n"
			+ "    should include_class('javase')\n"
			+ "    should include_class('main')\n"
			+ "    should include_class('settings')\n"
			+ "    should include_class('tcpdump')\n"
			+ "\n"
			+ "    # Resources per type and title (alphabetically)\n"
			+ "    should contain_file('/etc/java_release').with(\n"
			+ "      'content' => '1.6',\n"
			+ "      'ensure'  => 'present',\n"
			+ "      'group'   => 'root',\n"
			+ "      'mode'    => '440',\n"
			+ "      'owner'   => 'root',\n"
			+ "    )\n"
			+ "    should contain_package('tcpdump').with(\n"
			+ "      'ensure'   => 'latest',\n"
			+ "      'provider' => 'yum',\n"
			+ "    )\n"
			+ "    should contain_stage('main').with(\n" + "      'name' => 'main',\n" + "    )\n" + "  }\n" + "end\n";

	public void testCatalogRspec() throws Exception {
		File f = TestDataProvider.getTestFile(new Path("testData/sample1.json"));
		Catalog c = CatalogJsonSerializer.load(f);
		assertEquals("Should have the expected name", "testcentos.pilsen.cloudsmith.com", c.getName());

		CatalogRspecGenerator generator = new CatalogRspecGenerator();
		StringBuilder builder = new StringBuilder();
		generator.generate(c, builder);
		assertEquals(expectedRspec1, builder.toString());
		System.out.print(builder.toString());
	}
}
