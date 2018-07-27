package org.hisrc.declension.provider.dewiktionary;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

import org.hisrc.declension.provider.dewiktionary.wordlist.dereko.DerekoPartOfSpeech;
import org.hisrc.declension.provider.dewiktionary.wordlist.dereko.DerekoWordListEntry;
import org.hisrc.declension.provider.dewiktionary.wordlist.dereko.DerekoWordListProvider;
import org.junit.Test;

public class DerekoWordListProviderTest {

	public static final String DEREKO_FILE = "data/DeReKo-2014-II-MainArchive-STT.100000.freq";

	@Test
	public void parses() throws IOException {
		try (InputStream is = new FileInputStream(new File(DEREKO_FILE))) {
			final DerekoWordListProvider wordListProvider = new DerekoWordListProvider(is);

			final AtomicInteger nounsCount = new AtomicInteger();
			wordListProvider.loadWordList(wordListEntry -> {
				DerekoWordListEntry derekoWordListEntry = (DerekoWordListEntry) wordListEntry;
				if (DerekoPartOfSpeech.NORMALES_NOMEN == derekoWordListEntry.getPartOfSpeech()) {
					nounsCount.incrementAndGet();
				}
			});
			System.out.println("Number of nouns:" + nounsCount);
			assertThat(nounsCount.get()).isGreaterThan(1000); 
		}
	}
}