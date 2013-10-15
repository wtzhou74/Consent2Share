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
package gov.samhsa.consent2share.service.account;

import java.text.ParseException;

import javax.mail.MessagingException;

import gov.samhsa.consent2share.infrastructure.security.EmailAddressNotExistException;
import gov.samhsa.consent2share.infrastructure.security.UsernameNotExistException;
import gov.samhsa.consent2share.service.dto.SignupDto;

import org.springframework.security.core.userdetails.UserDetails;

/**
 * The Interface AccountService.
 */
public interface AccountService {
	
	/**
	 * Signup.
	 *
	 * @param signupDto the signup dto
	 * @param hostName the host name
	 * @throws MessagingException the messaging exception
	 * @throws ParseException the parse exception
	 * @throws UsernameNotExistException the username not exist exception
	 * @throws EmailAddressNotExistException the email address not exist exception
	 */
	public abstract void signup(SignupDto signupDto, String hostName) throws MessagingException, ParseException, UsernameNotExistException, EmailAddressNotExistException;
	
	/**
	 * Find user by username.
	 *
	 * @param username the username
	 * @return the user details
	 */
	public abstract UserDetails findUserByUsername(String username); 
	
	/**
	 * Creates the email token.
	 *
	 * @param username the username
	 * @param emailAddress the email address
	 * @return the string
	 * @throws UsernameNotExistException the username not exist exception
	 * @throws EmailAddressNotExistException the email address not exist exception
	 * @throws MessagingException the messaging exception
	 */
	public abstract String createEmailToken(String username, String emailAddress) throws UsernameNotExistException, EmailAddressNotExistException, MessagingException;
}
