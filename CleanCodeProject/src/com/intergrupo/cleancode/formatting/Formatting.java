package com.intergrupo.cleancode.formatting;

import java.util.Arrays;
import java.util.Set;

public class Formatting {
	public int getWidestLineNumber() { return getWidestLineNumber(); } public LineWidthHistogram getLineWidthHistogram() { return getLineWidthHistogram(); } public double getMeanLineWidth() { double totalChars = 0;
	return (double) totalChars/ lineCountForWidth(0); } public int getMedianLineWidth() { Integer[] sortedWidths = getSortedWidths(); int cumulativeLineCount = 0; for (int width : sortedWidths) { cumulativeLineCount += lineCountForWidth( width); if (cumulativeLineCount > lineCountForWidth(0)/ 2) return width; } 
	throw new Error("Cannot get here"); } private int lineCountForWidth( int width) { LineWidthHistogram lineWidthHistogram = new LineWidthHistogram();
	return lineWidthHistogram.getLinesforWidth( width).size(); } private Integer[] getSortedWidths() { LineWidthHistogram lineWidthHistogram = new LineWidthHistogram();
	Set < Integer > widths = lineWidthHistogram.getWidths(); Integer[] sortedWidths = (widths.toArray( new Integer[ 0])); Arrays.sort( sortedWidths); return sortedWidths; } }