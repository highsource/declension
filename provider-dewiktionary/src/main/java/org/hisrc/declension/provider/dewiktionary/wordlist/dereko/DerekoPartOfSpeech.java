package org.hisrc.declension.provider.dewiktionary.wordlist.dereko;

import com.fasterxml.jackson.annotation.JsonProperty;

// Quelle: http://www.ims.uni-stuttgart.de/forschung/ressourcen/lexika/TagSets/stts-table.html
public enum DerekoPartOfSpeech {

	// ADJA | attributives Adjektiv | [das] große [Haus]
	@JsonProperty("ADJA")
	ATTRIBUTIVES_ADJEKTIV,


	// ADJD | adverbiales oder prädikatives Adjektiv | [er fährt] schnell, [er ist] schnell
	@JsonProperty("ADJD")
	ADVERBIALES_ODER_PRAEDIKATIVES_ADJEKTIV,

	// ADV | Adverb | schon, bald, doch
	@JsonProperty("ADV")
	ADVERB,

	// APPR | Präposition; Zirkumposition links | in [der Stadt], ohne [mich]
	@JsonProperty("APPR")
	PRAEPOSITION_ZIRKUMPOSITION_LINKS,

	// APPRART | Präposition mit Artikel | im [Haus], zur [Sache]
	@JsonProperty("APPRART")
	PRAEPOSITION_MIT_ARTIKEL,

	// APPO | Postposition | [ihm] zufolge, [der Sache] wegen
	@JsonProperty("APPO")
	POSTPOSITION,

	// APZR | Zirkumposition rechts | [von jetzt] an
	@JsonProperty("APZR")
	ZIRKUMPOSITION_RECHTS,

	// ART | bestimmter oder unbestimmter Artikel | der, die, das, ein, eine
	@JsonProperty("ART")
	BESTIMMTER_ODER_UNBESTIMMTER_ARTIKEL,

	// CARD | Kardinalzahl | zwei [Männer], [im Jahre] 1994
	@JsonProperty("CARD")
	KARDINALZAHL,

	// FM | Fremdsprachliches Material | [Er hat das mit ``] A big fish ['' übersetzt]
	@JsonProperty("FM")
	FREMDSPRACHLICHES_MATERIAL,

	// ITJ | Interjektion | mhm, ach, tja
	@JsonProperty("ITJ")
	INTERJEKTION,

	// KOUI | unterordnende Konjunktion mit ``zu'' und Infinitiv | um [zu leben], anstatt [zu fragen]
	@JsonProperty("KOUI")
	UNTERORDNENDE_KONJUNKTION_MIT_ZU_UND_INFINITIV,

	// KOUS | unterordnende Konjunktion mit Satz | weil, dass, damit, wenn, ob
	@JsonProperty("KOUS")
	UNTERORDNENDE_KONJUNKTION_MIT_SATZ,

	// KON | nebenordnende Konjunktion | und, oder, aber
	@JsonProperty("KON")
	NEBENORDNENDE_KONJUNKTION,

	// KOKOM | Vergleichskonjunktion | als, wie
	@JsonProperty("KOKOM")
	VERGLEICHSKONJUNKTION,

	// NN | normales Nomen | Tisch, Herr, [das] Reisen
	@JsonProperty("NN")
	NORMALES_NOMEN,

	// NE | Eigennamen | Hans, Hamburg, HSV
	@JsonProperty("NE")
	EIGENNAMEN,

	// PDS | substituierendes Demonstrativpronomen | dieser, jener
	@JsonProperty("PDS")
	SUBSTITUIERENDES_DEMONSTRATIVPRONOMEN,

	// PDAT | attribuierendes Demonstrativpronomen | jener [Mensch]
	@JsonProperty("PDAT")
	ATTRIBUIERENDES_DEMONSTRATIVPRONOMEN,

	// PIS | substituierendes Indefinitpronomen | keiner, viele, man, niemand
	@JsonProperty("PIS")
	SUBSTITUIERENDES_INDEFINITPRONOMEN,

	// PIAT | attribuierendes Indefinitpronomen ohne Determiner | kein [Mensch], irgendein [Glas]
	@JsonProperty("PIAT")
	ATTRIBUIERENDES_INDEFINITPRONOMEN_OHNE_DETERMINER,

	// PIDAT | attribuierendes Indefinitpronomen mit Determiner | [ein] wenig [Wasser], [die] beiden [Brüder]
	@JsonProperty("PIDAT")
	ATTRIBUIERENDES_INDEFINITPRONOMEN_MIT_DETERMINER,

	// PPER | irreflexives Personalpronomen | ich, er, ihm, mich, dir
	@JsonProperty("PPER")
	IRREFLEXIVES_PERSONALPRONOMEN,

	// PPOSS | substituierendes Possessivpronomen | meins, deiner
	@JsonProperty("PPOSS")
	SUBSTITUIERENDES_POSSESSIVPRONOMEN,

	// PPOSAT | attribuierendes Possessivpronomen | mein [Buch], deine [Mutter]
	@JsonProperty("PPOSAT")
	ATTRIBUIERENDES_POSSESSIVPRONOMEN,

	// PRELS | substituierendes Relativpronomen | [der Hund ,] der
	@JsonProperty("PRELS")
	SUBSTITUIERENDES_RELATIVPRONOMEN,

	// PRELAT | attribuierendes Relativpronomen | [der Mann ,] dessen [Hund]
	@JsonProperty("PRELAT")
	ATTRIBUIERENDES_RELATIVPRONOMEN,

	// TODO
	@JsonProperty("PROAV")
	PROAV,

	// PRF | reflexives Personalpronomen | sich, einander, dich, mir
	@JsonProperty("PRF")
	REFLEXIVES_PERSONALPRONOMEN,

	// PWS | substituierendes Interrogativpronomen | wer, was
	@JsonProperty("PWS")
	SUBSTITUIERENDES_INTERROGATIVPRONOMEN,

	// PWAT | attribuierendes Interrogativpronomen | welche[Farbe], wessen [Hut]
	@JsonProperty("PWAT")
	ATTRIBUIERENDES_INTERROGATIVPRONOMEN,

	// PWAV | adverbiales Interrogativ- oder Relativpronomen | warum, wo, wann, worüber, wobei
	@JsonProperty("PWAV")
	ADVERBIALES_INTERROGATIV_ODER_RELATIVPRONOMEN,

	// PAV | Pronominaladverb | dafür, dabei, deswegen, trotzdem
	@JsonProperty("PAV")
	PRONOMINALADVERB,

	// PTKZU | ``zu'' vor Infinitiv | zu [gehen]
	@JsonProperty("PTKZU")
	ZU_VOR_INFINITIV,

	// PTKNEG | Negationspartikel | nicht
	@JsonProperty("PTKNEG")
	NEGATIONSPARTIKEL,

	// PTKVZ | abgetrennter Verbzusatz | [er kommt] an, [er fährt] rad
	@JsonProperty("PTKVZ")
	ABGETRENNTER_VERBZUSATZ,

	// PTKANT | Antwortpartikel | ja, nein, danke, bitte
	@JsonProperty("PTKANT")
	ANTWORTPARTIKEL,

	// PTKA | Partikel bei Adjektiv oder Adverb | am [schönsten], zu [schnell]
	@JsonProperty("PTKA")
	PARTIKEL_BEI_ADJEKTIV_ODER_ADVERB,

	// TRUNC | Kompositions-Erstglied | An- [und Abreise]
	@JsonProperty("TRUNC")
	KOMPOSITIONS_ERSTGLIED,

	// VVFIN | finites Verb, voll | [du] gehst, [wir] kommen [an]
	@JsonProperty("VVFIN")
	FINITES_VERB_VOLL,

	// VVIMP | Imperativ, voll | komm [!]
	@JsonProperty("VVIMP")
	IMPERATIV_VOLL,

	// VVINF | Infinitiv, voll | gehen, ankommen
	@JsonProperty("VVINF")
	INFINITIV_VOLL,

	// VVIZU | Infinitiv mit ``zu'', voll | anzukommen, loszulassen
	@JsonProperty("VVIZU")
	INFINITIV_MIT_ZU_VOLL,

	// VVPP | Partizip Perfekt, voll | gegangen, angekommen
	@JsonProperty("VVPP")
	PARTIZIP_PERFEKT_VOLL,

	// VAFIN | finites Verb, aux | [du] bist, [wir] werden
	@JsonProperty("VAFIN")
	FINITES_VERB_AUX,

	// VAIMP | Imperativ, aux | sei [ruhig !]
	@JsonProperty("VAIMP")
	IMPERATIV_AUX,

	// VAINF | Infinitiv, aux | werden, sein
	@JsonProperty("VAINF")
	INFINITIV_AUX,

	// VAPP | Partizip Perfekt, aux | gewesen
	@JsonProperty("VAPP")
	PARTIZIP_PERFEKT_AUX,

	// VMFIN | finites Verb, modal | dürfen
	@JsonProperty("VMFIN")
	FINITES_VERB_MODAL,

	// VMINF | Infinitiv, modal | wollen
	@JsonProperty("VMINF")
	INFINITIV_MODAL,

	// VMPP | Partizip Perfekt, modal | gekonnt, [er hat gehen] können
	@JsonProperty("VMPP")
	PARTIZIP_PERFEKT_MODAL,

	// XY | Nichtwort, Sonderzeichen enthaltend | 3:7, H2O, D2XW3
	@JsonProperty("XY")
	NICHTWORT_SONDERZEICHEN_ENTHALTEND,

	// $, | Komma | ,
	@JsonProperty("$,")
	KOMMA,

	// $. | Satzbeendende Interpunktion | . ? ! ; :
	@JsonProperty("$.")
	SATZBEENDENDE_INTERPUNKTION,

	// $( | sonstige Satzzeichen; satzintern | - [,]()
	@JsonProperty("$(")
	SONSTIGE_SATZZEICHEN_SATZINTERN
}
