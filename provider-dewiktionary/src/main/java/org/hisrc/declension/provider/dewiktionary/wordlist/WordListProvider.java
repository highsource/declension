package org.hisrc.declension.provider.dewiktionary.wordlist;

import java.io.IOException;
import java.util.function.Consumer;

public interface WordListProvider {

	public void loadWordList(Consumer<? super WordListEntry> consumer) throws IOException;
}
