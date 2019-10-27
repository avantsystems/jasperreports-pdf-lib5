package com.jaspersoft.jasperreports.export.pdf;

import com.itextpdf.text.pdf.PdfContentByte;

import net.sf.jasperreports.engine.JRPrintText;
import net.sf.jasperreports.engine.util.JRStyledText;

public interface JRPdfTextRenderer {

	public void initialize(JRPdfExporter pdfExporter, PdfContentByte pdfContentByte, JRPrintText text,
			JRStyledText styledText, int offsetX, int offsetY);

}
