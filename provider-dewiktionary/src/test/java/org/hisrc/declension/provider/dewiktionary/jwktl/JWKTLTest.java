package org.hisrc.declension.provider.dewiktionary.jwktl;

import java.io.File;
import java.util.List;
import java.util.Objects;

import org.junit.Test;

import de.tudarmstadt.ukp.jwktl.JWKTL;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryEdition;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryEntry;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryWordForm;
import de.tudarmstadt.ukp.jwktl.api.PartOfSpeech;
import de.tudarmstadt.ukp.jwktl.api.filter.IWiktionaryEntryFilter;
import de.tudarmstadt.ukp.jwktl.api.util.IWiktionaryIterator;
import de.tudarmstadt.ukp.jwktl.api.util.Language;

public class JWKTLTest {

	private final static String PATH_TO_DUMP_FILE = "data/dewiktionary-20180720-pages-articles.xml.bz2";
	private final static String TARGET_DIRECTORY = "dump";

	@Test
	public void parses() {
		// File dumpFile = new File(PATH_TO_DUMP_FILE);
		// File outputDirectory = new File(TARGET_DIRECTORY);
		// boolean overwriteExisting = false;
		// JWKTL.parseWiktionaryDump(dumpFile, outputDirectory, overwriteExisting);

		File wiktionaryDirectory = new File(TARGET_DIRECTORY);
		try (IWiktionaryEdition wkt = JWKTL.openEdition(wiktionaryDirectory)) {
			IWiktionaryIterator<IWiktionaryEntry> allEntries = wkt.getAllEntries(new IWiktionaryEntryFilter() {

				@Override
				public boolean accept(IWiktionaryEntry entry) {
					List<PartOfSpeech> partsOfSpeech = entry.getPartsOfSpeech();
					if (Objects.equals(Language.GERMAN, entry.getWordLanguage())
							&& partsOfSpeech.contains(PartOfSpeech.NOUN)) {
						return true;
					} else {
						return false;
					}
				}
			});

			int nounCount = 0;
			for (; allEntries.hasNext();) {
				nounCount++;
				IWiktionaryEntry wiktionaryEntry = allEntries.next();
				if (wiktionaryEntry.getWordLanguage() == null) {
					System.out.println(wiktionaryEntry.getWord());
				}
				List<IWiktionaryWordForm> wordForms = wiktionaryEntry.getWordForms();
				if (wordForms == null || wordForms.size() != 8) {
					System.out.println(wiktionaryEntry.getWord());
				}
			}
			System.out.println("German noun count=" + nounCount);
		}
	}
}