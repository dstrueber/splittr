package de.uni_marburg.splittr.retrieval;

import static pitt.search.semanticvectors.LuceneUtils.LUCENE_VERSION;

import java.io.Reader;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.core.LowerCaseTokenizer;
import org.apache.lucene.analysis.en.EnglishMinimalStemFilter;

/**
 * A Lucene analyzer that only performs minimal stemming: Plurals are stemmed to the singular form.
 * @author strueber
 *
 */
public  class MinimalStemmingAnalyzer extends Analyzer {

	 @Override
	  protected TokenStreamComponents createComponents(String fieldName, Reader reader) {
	    Tokenizer source = new LowerCaseTokenizer(LUCENE_VERSION, reader);
	    return new TokenStreamComponents(source, new EnglishMinimalStemFilter(source));
	  }
	}