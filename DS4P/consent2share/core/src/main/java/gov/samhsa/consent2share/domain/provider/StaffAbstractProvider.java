package gov.samhsa.consent2share.domain.provider;

import gov.samhsa.consent2share.domain.reference.EntityType;
import gov.samhsa.consent2share.domain.staff.Staff;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractProvider.
 */
@MappedSuperclass
public class StaffAbstractProvider {

    /** The npi. */
    @Size(min = 3, max = 30)
    private String npi;

    /** The entity type. */
    @Enumerated
    private EntityType entityType;
    
    /** The first line mailing address. */
    @NotNull
    @Size(max = 255)
    private String firstLineMailingAddress;

    /** The second line mailing address. */
    @NotNull
    @Size(max = 255)
    private String secondLineMailingAddress;

    /** The mailing address city name. */
    @NotNull
    @Size(max = 30)
    private String mailingAddressCityName;

    /** The mailing address state name. */
    @NotNull
    @Size(max = 30)
    private String mailingAddressStateName;

    /** The mailing address postal code. */
    @NotNull
    @Size(max = 30)
    private String mailingAddressPostalCode;

    /** The mailing address country code. */
    @NotNull
    @Size(max = 30)
    private String mailingAddressCountryCode;

    /** The mailing address telephone number. */
    @NotNull
    @Size(max = 30)
    private String mailingAddressTelephoneNumber;

    /** The mailing address fax number. */
    @NotNull
    @Size(max = 30)
    private String mailingAddressFaxNumber;

    /** The first line practice location address. */
    @NotNull
    @Size(max = 255)
    private String firstLinePracticeLocationAddress;

    /** The second line practice location address. */
    @NotNull
    @Size(max = 255)
    private String secondLinePracticeLocationAddress;

    /** The practice location address city name. */
    @NotNull
    @Size(max = 30)
    private String practiceLocationAddressCityName;

    /** The practice location address state name. */
    @NotNull
    @Size(max = 30)
    private String practiceLocationAddressStateName;

    /** The practice location address postal code. */
    @NotNull
    @Size(max = 30)
    private String practiceLocationAddressPostalCode;

    /** The practice location address country code. */
    @NotNull
    @Size(max = 30)
    private String practiceLocationAddressCountryCode;

    /** The practice location address telephone number. */
    @NotNull
    @Size(max = 30)
    private String practiceLocationAddressTelephoneNumber;

    /** The practice location address fax number. */
    @NotNull
    @Size(max = 30)
    private String practiceLocationAddressFaxNumber;

    /** The enumeration date. */
    @NotNull
    @Size(max = 30)
    private String enumerationDate;

    /** The last update date. */
    @NotNull
    @Size(max = 30)
    private String lastUpdateDate;

    /** The provider taxonomy code. */
    @NotNull
    @Size(max = 30)
    private String providerTaxonomyCode;

    /** The provider taxonomy description. */
    @NotNull
    @Size(max = 255)
    private String providerTaxonomyDescription;
    
    /** The patient. */
    @ManyToOne
   
    private Staff staff;
    
	/**
	 * Gets the staff.
	 *
	 * @return the staff
	 */
	public Staff getStaff() {
		return staff;
	}

	/**
	 * Sets the staff.
	 *
	 * @param staff the new staff
	 */
	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	/**
     * Gets the npi.
     *
     * @return the npi
     */
    public String getNpi() {
        return this.npi;
    }

	/**
	 * Sets the npi.
	 *
	 * @param npi the new npi
	 */
	public void setNpi(String npi) {
        this.npi = npi;
    }

	/**
	 * Gets the entity type.
	 *
	 * @return the entity type
	 */
	public EntityType getEntityType() {
        return this.entityType;
    }

	/**
	 * Sets the entity type.
	 *
	 * @param entityType the new entity type
	 */
	public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

	/**
	 * Gets the first line mailing address.
	 *
	 * @return the first line mailing address
	 */
	public String getFirstLineMailingAddress() {
        return this.firstLineMailingAddress;
    }

	/**
	 * Sets the first line mailing address.
	 *
	 * @param firstLineMailingAddress the new first line mailing address
	 */
	public void setFirstLineMailingAddress(String firstLineMailingAddress) {
        this.firstLineMailingAddress = firstLineMailingAddress;
    }

	/**
	 * Gets the second line mailing address.
	 *
	 * @return the second line mailing address
	 */
	public String getSecondLineMailingAddress() {
        return this.secondLineMailingAddress;
    }

	/**
	 * Sets the second line mailing address.
	 *
	 * @param secondLineMailingAddress the new second line mailing address
	 */
	public void setSecondLineMailingAddress(String secondLineMailingAddress) {
        this.secondLineMailingAddress = secondLineMailingAddress;
    }

	/**
	 * Gets the mailing address city name.
	 *
	 * @return the mailing address city name
	 */
	public String getMailingAddressCityName() {
        return this.mailingAddressCityName;
    }

	/**
	 * Sets the mailing address city name.
	 *
	 * @param mailingAddressCityName the new mailing address city name
	 */
	public void setMailingAddressCityName(String mailingAddressCityName) {
        this.mailingAddressCityName = mailingAddressCityName;
    }

	/**
	 * Gets the mailing address state name.
	 *
	 * @return the mailing address state name
	 */
	public String getMailingAddressStateName() {
        return this.mailingAddressStateName;
    }

	/**
	 * Sets the mailing address state name.
	 *
	 * @param mailingAddressStateName the new mailing address state name
	 */
	public void setMailingAddressStateName(String mailingAddressStateName) {
        this.mailingAddressStateName = mailingAddressStateName;
    }

	/**
	 * Gets the mailing address postal code.
	 *
	 * @return the mailing address postal code
	 */
	public String getMailingAddressPostalCode() {
        return this.mailingAddressPostalCode;
    }

	/**
	 * Sets the mailing address postal code.
	 *
	 * @param mailingAddressPostalCode the new mailing address postal code
	 */
	public void setMailingAddressPostalCode(String mailingAddressPostalCode) {
        this.mailingAddressPostalCode = mailingAddressPostalCode;
    }

	/**
	 * Gets the mailing address country code.
	 *
	 * @return the mailing address country code
	 */
	public String getMailingAddressCountryCode() {
        return this.mailingAddressCountryCode;
    }

	/**
	 * Sets the mailing address country code.
	 *
	 * @param mailingAddressCountryCode the new mailing address country code
	 */
	public void setMailingAddressCountryCode(String mailingAddressCountryCode) {
        this.mailingAddressCountryCode = mailingAddressCountryCode;
    }

	/**
	 * Gets the mailing address telephone number.
	 *
	 * @return the mailing address telephone number
	 */
	public String getMailingAddressTelephoneNumber() {
        return this.mailingAddressTelephoneNumber;
    }

	/**
	 * Sets the mailing address telephone number.
	 *
	 * @param mailingAddressTelephoneNumber the new mailing address telephone number
	 */
	public void setMailingAddressTelephoneNumber(String mailingAddressTelephoneNumber) {
        this.mailingAddressTelephoneNumber = mailingAddressTelephoneNumber;
    }

	/**
	 * Gets the mailing address fax number.
	 *
	 * @return the mailing address fax number
	 */
	public String getMailingAddressFaxNumber() {
        return this.mailingAddressFaxNumber;
    }

	/**
	 * Sets the mailing address fax number.
	 *
	 * @param mailingAddressFaxNumber the new mailing address fax number
	 */
	public void setMailingAddressFaxNumber(String mailingAddressFaxNumber) {
        this.mailingAddressFaxNumber = mailingAddressFaxNumber;
    }

	/**
	 * Gets the first line practice location address.
	 *
	 * @return the first line practice location address
	 */
	public String getFirstLinePracticeLocationAddress() {
        return this.firstLinePracticeLocationAddress;
    }

	/**
	 * Sets the first line practice location address.
	 *
	 * @param firstLinePracticeLocationAddress the new first line practice location address
	 */
	public void setFirstLinePracticeLocationAddress(String firstLinePracticeLocationAddress) {
        this.firstLinePracticeLocationAddress = firstLinePracticeLocationAddress;
    }

	/**
	 * Gets the second line practice location address.
	 *
	 * @return the second line practice location address
	 */
	public String getSecondLinePracticeLocationAddress() {
        return this.secondLinePracticeLocationAddress;
    }

	/**
	 * Sets the second line practice location address.
	 *
	 * @param secondLinePracticeLocationAddress the new second line practice location address
	 */
	public void setSecondLinePracticeLocationAddress(String secondLinePracticeLocationAddress) {
        this.secondLinePracticeLocationAddress = secondLinePracticeLocationAddress;
    }

	/**
	 * Gets the practice location address city name.
	 *
	 * @return the practice location address city name
	 */
	public String getPracticeLocationAddressCityName() {
        return this.practiceLocationAddressCityName;
    }

	/**
	 * Sets the practice location address city name.
	 *
	 * @param practiceLocationAddressCityName the new practice location address city name
	 */
	public void setPracticeLocationAddressCityName(String practiceLocationAddressCityName) {
        this.practiceLocationAddressCityName = practiceLocationAddressCityName;
    }

	/**
	 * Gets the practice location address state name.
	 *
	 * @return the practice location address state name
	 */
	public String getPracticeLocationAddressStateName() {
        return this.practiceLocationAddressStateName;
    }

	/**
	 * Sets the practice location address state name.
	 *
	 * @param practiceLocationAddressStateName the new practice location address state name
	 */
	public void setPracticeLocationAddressStateName(String practiceLocationAddressStateName) {
        this.practiceLocationAddressStateName = practiceLocationAddressStateName;
    }

	/**
	 * Gets the practice location address postal code.
	 *
	 * @return the practice location address postal code
	 */
	public String getPracticeLocationAddressPostalCode() {
        return this.practiceLocationAddressPostalCode;
    }

	/**
	 * Sets the practice location address postal code.
	 *
	 * @param practiceLocationAddressPostalCode the new practice location address postal code
	 */
	public void setPracticeLocationAddressPostalCode(String practiceLocationAddressPostalCode) {
        this.practiceLocationAddressPostalCode = practiceLocationAddressPostalCode;
    }

	/**
	 * Gets the practice location address country code.
	 *
	 * @return the practice location address country code
	 */
	public String getPracticeLocationAddressCountryCode() {
        return this.practiceLocationAddressCountryCode;
    }

	/**
	 * Sets the practice location address country code.
	 *
	 * @param practiceLocationAddressCountryCode the new practice location address country code
	 */
	public void setPracticeLocationAddressCountryCode(String practiceLocationAddressCountryCode) {
        this.practiceLocationAddressCountryCode = practiceLocationAddressCountryCode;
    }

	/**
	 * Gets the practice location address telephone number.
	 *
	 * @return the practice location address telephone number
	 */
	public String getPracticeLocationAddressTelephoneNumber() {
        return this.practiceLocationAddressTelephoneNumber;
    }

	/**
	 * Sets the practice location address telephone number.
	 *
	 * @param practiceLocationAddressTelephoneNumber the new practice location address telephone number
	 */
	public void setPracticeLocationAddressTelephoneNumber(String practiceLocationAddressTelephoneNumber) {
        this.practiceLocationAddressTelephoneNumber = practiceLocationAddressTelephoneNumber;
    }

	/**
	 * Gets the practice location address fax number.
	 *
	 * @return the practice location address fax number
	 */
	public String getPracticeLocationAddressFaxNumber() {
        return this.practiceLocationAddressFaxNumber;
    }

	/**
	 * Sets the practice location address fax number.
	 *
	 * @param practiceLocationAddressFaxNumber the new practice location address fax number
	 */
	public void setPracticeLocationAddressFaxNumber(String practiceLocationAddressFaxNumber) {
        this.practiceLocationAddressFaxNumber = practiceLocationAddressFaxNumber;
    }

	/**
	 * Gets the enumeration date.
	 *
	 * @return the enumeration date
	 */
	public String getEnumerationDate() {
        return this.enumerationDate;
    }

	/**
	 * Sets the enumeration date.
	 *
	 * @param enumerationDate the new enumeration date
	 */
	public void setEnumerationDate(String enumerationDate) {
        this.enumerationDate = enumerationDate;
    }

	/**
	 * Gets the last update date.
	 *
	 * @return the last update date
	 */
	public String getLastUpdateDate() {
        return this.lastUpdateDate;
    }

	/**
	 * Sets the last update date.
	 *
	 * @param lastUpdateDate the new last update date
	 */
	public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

	/**
	 * Gets the provider taxonomy code.
	 *
	 * @return the provider taxonomy code
	 */
	public String getProviderTaxonomyCode() {
        return this.providerTaxonomyCode;
    }

	/**
	 * Sets the provider taxonomy code.
	 *
	 * @param providerTaxonomyCode the new provider taxonomy code
	 */
	public void setProviderTaxonomyCode(String providerTaxonomyCode) {
        this.providerTaxonomyCode = providerTaxonomyCode;
    }

	/**
	 * Gets the provider taxonomy description.
	 *
	 * @return the provider taxonomy description
	 */
	public String getProviderTaxonomyDescription() {
        return this.providerTaxonomyDescription;
    }

	/**
	 * Sets the provider taxonomy description.
	 *
	 * @param providerTaxonomyDescription the new provider taxonomy description
	 */
	public void setProviderTaxonomyDescription(String providerTaxonomyDescription) {
        this.providerTaxonomyDescription = providerTaxonomyDescription;
    }

	/** The id. */
	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "idgen")
    @Column(name = "id")
    private Long id;

	/** The version. */
	@Version
    @Column(name = "version")
    private Integer version;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
        return this.id;
    }

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
        this.id = id;
    }

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public Integer getVersion() {
        return this.version;
    }

	/**
	 * Sets the version.
	 *
	 * @param version the new version
	 */
	public void setVersion(Integer version) {
        this.version = version;
    }

}