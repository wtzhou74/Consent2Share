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
package gov.samhsa.consent2share.accesscontrolservice.documentsegmentation.brms;

import gov.samhsa.consent2share.accesscontrolservice.brms.client.RuleExecutionWebServiceClient;
import gov.samhsa.consent2share.schema.ruleexecutionservice.AssertAndExecuteClinicalFactsRequest;
import gov.samhsa.consent2share.schema.ruleexecutionservice.AssertAndExecuteClinicalFactsResponse;

/**
 * The Class RuleExecutionServiceClientImpl.
 */
public class RuleExecutionServiceClientImpl implements RuleExecutionService {

	/** The endpoint address. */
	private String endpointAddress;

	/**
	 * Instantiates a new rule execution service client implementation.
	 * 
	 * @param endpointAddress
	 *            the endpoint address
	 */
	public RuleExecutionServiceClientImpl(String endpointAddress) {
		this.endpointAddress = endpointAddress;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * gov.samhsa.consent2share.accesscontrolservice.documentsegmentation.brms
	 * .RuleExecutionServiceClient
	 * #assertAndExecuteClinicalFacts(java.lang.String)
	 */
	@Override
	public String assertAndExecuteClinicalFacts(String factModelXmlString) {
		RuleExecutionWebServiceClient ruleExecutionWebServiceClient = getRuleExecutionWebServiceClient();

		AssertAndExecuteClinicalFactsRequest request = createRequest(factModelXmlString);

		AssertAndExecuteClinicalFactsResponse result = ruleExecutionWebServiceClient
				.assertAndExecuteClinicalFacts(request);

		return result.getRuleExecutionResponseContainer();
	}

	/**
	 * Gets the rule execution web service client.
	 * 
	 * @return the rule execution web service client
	 */
	RuleExecutionWebServiceClient getRuleExecutionWebServiceClient() {
		return new RuleExecutionWebServiceClient(endpointAddress);
	}

	/**
	 * Creates the request.
	 * 
	 * @param factModelXmlString
	 *            the fact model xml string
	 * @return the assert and execute clinical facts request
	 */
	AssertAndExecuteClinicalFactsRequest createRequest(String factModelXmlString) {
		AssertAndExecuteClinicalFactsRequest request = new AssertAndExecuteClinicalFactsRequest();
		request.setClinicalFactXmlString(factModelXmlString);
		return request;
	}
}
