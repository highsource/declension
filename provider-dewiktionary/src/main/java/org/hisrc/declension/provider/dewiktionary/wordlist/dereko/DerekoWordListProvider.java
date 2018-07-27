package org.hisrc.declension.provider.dewiktionary.wordlist.dereko;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

import org.hisrc.declension.provider.dewiktionary.wordlist.WordListEntry;
import org.hisrc.declension.provider.dewiktionary.wordlist.WordListProvider;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class DerekoWordListProvider implements WordListProvider {

	private final InputStream is;

	public DerekoWordListProvider(InputStream is) {
		super();
		this.is = is;
	}

	@Override
	public void loadWordList(Consumer<? super WordListEntry> consumer) throws IOException {

		final CsvMapper mapper = new CsvMapper();
		final CsvSchema schema = mapper.schemaFor(DerekoWordListEntry.class).withoutHeader().withoutQuoteChar()
				.withColumnSeparator('\t');

		final MappingIterator<DerekoWordListEntry> wordListEntriesIterator = mapper.readerFor(DerekoWordListEntry.class)
				.with(schema).readValues(new InputStreamReader(is, "UTF-8"));
		while (wordListEntriesIterator.hasNext()) {
			consumer.accept(wordListEntriesIterator.next());
		}
	}

}
