/*******************************************************************************
 * Open Behavioral Health Information Technology Architecture (OBHITA.org)
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the <organization> nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 ******************************************************************************/
package gov.samhsa.ds4ppilot.orchestrator.documentprocessor;

import gov.samhsa.ds4ppilot.schema.documentprocessor.ProcessDocumentResponse;
import gov.samhsa.schemas.client.DocumentProcessorWebServiceClient;

/**
 * The Class DocumentProcessorImpl.
 */
public class DocumentProcessorImpl implements DocumentProcessor {

	/** The endpoint address. */
	private final String endpointAddress;

	/**
	 * Instantiates a new document processor implementation.
	 *
	 * @param endpointAddress the endpoint address
	 */
	public DocumentProcessorImpl(String endpointAddress) {
		this.endpointAddress = endpointAddress;
	}

	/* (non-Javadoc)
	 * @see gov.samhsa.ds4ppilot.orchestrator.documentprocessor.DocumentProcessor#processDocument(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String)
	 */
	@Override
	public ProcessDocumentResponse processDocument(String c32Document,
			String enforcePolicyResponseXmlString, boolean packageAsXdm, boolean encryptDocument,
			String senderEmailAddress, String recipientEmailAddress, String xdsDocumentEntryUniqueId) {

		DocumentProcessorWebServiceClient documentProcessorWebServiceClient = new DocumentProcessorWebServiceClient(
				endpointAddress);
		ProcessDocumentResponse response = documentProcessorWebServiceClient
				.processDocument(c32Document, enforcePolicyResponseXmlString,
						packageAsXdm, encryptDocument, senderEmailAddress, recipientEmailAddress, xdsDocumentEntryUniqueId);

		return response;
	}
}
