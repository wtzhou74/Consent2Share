/*******************************************************************************
 * Open Behavioral Health Information Technology Architecture (OBHITA.org)
 *   
 *   Redistribution and use in source and binary forms, with or without
 *   modification, are permitted provided that the following conditions are met:
 *       * Redistributions of source code must retain the above copyright
 *         notice, this list of conditions and the following disclaimer.
 *       * Redistributions in binary form must reproduce the above copyright
 *         notice, this list of conditions and the following disclaimer in the
 *         documentation and/or other materials provided with the distribution.
 *       * Neither the name of the <organization> nor the
 *         names of its contributors may be used to endorse or promote products
 *         derived from this software without specific prior written permission.
 *   
 *   THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 *   ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 *   WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 *   DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 *   DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 *   (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 *   LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 *   ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *   (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *   SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 ******************************************************************************/
package gov.samhsa.consent2share.accesscontrolservice.xdsb.common;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class UniqueOidProviderImpl.
 */
public class UniqueOidProviderImpl implements UniqueOidProvider {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UniqueOidProviderImpl.class);
	/*
	 * (non-Javadoc)
	 * 
	 * @see UniqueOidProvider#getOid()
	 */
	@Override
	public String getOid() {
		UUID uuid = UUID.randomUUID();
		String id = String.valueOf(uuid);

		id = id.replace("-", ".");

		id = id.replace("a", "10");
		id = id.replace("b", "11");
		id = id.replace("c", "12");
		id = id.replace("d", "13");
		id = id.replace("e", "14");
		id = id.replace("f", "15");

		// Removes leading zeroes
		id = id.replaceFirst("^0+(?!$)", "");

		return id;
	}

	/**
	 * The main method.
	 * 
	 * @param aArgs
	 *            the arguments
	 */
	public static final void main(String... aArgs) {
		UniqueOidProviderImpl provider = new UniqueOidProviderImpl();
		String oid = provider.getOid();

		LOGGER.debug(oid);
	}
}
