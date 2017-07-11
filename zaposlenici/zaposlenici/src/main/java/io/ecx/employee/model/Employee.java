package io.ecx.employee.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * Created by Martin on 6/6/2017.
 */
@Entity
public class Employee implements Serializable
{
    public enum Contract {
        Specified,
        Indefinetly
    }

    public enum Gender {
        Male,
        Female
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private Long oib;
    private String gender;
    @DateTimeFormat(pattern = "dd.MM.yyyy.")
    private Date birthDate;
    private String birthPlace;
    private String citizenship;
    private String residencePlace;
    private Integer residencePostNumber;
    private String residencePostOffice;
    private String residenceStreet;
    private Integer residenceStreetNumber;
    private String inhabitancyPlace;
    private Integer inhabitancyPostNumber;
    private String inhabitancyPostOffice;
    private String inhabitancyStreet;
    private Integer inhabitancyStreetNumber;
    @DateTimeFormat(pattern = "dd.MM.yyyy.")
    private Date inhabitancyStartDate;
    @DateTimeFormat(pattern = "dd.MM.yyyy.")
    private Date inhabitancyEndDate;
    private boolean permitToStayAndWork;
    private String qualification;
    private String title;
    @DateTimeFormat(pattern = "dd.MM.yyyy.")
    private Date startingDate;
    private String jobName;
    private String contractOfEmployment;
    @DateTimeFormat(pattern = "dd.MM.yyyy.")
    private Date probationTime;
    @DateTimeFormat(pattern = "dd.MM.yyyy.")
    private Date internshipDuration;
    @DateTimeFormat(pattern = "dd.MM.yyyy.")
    private Date internshipDatePassedExam;
    @DateTimeFormat(pattern = "dd.MM.yyyy.")
    private Date workAbroadTime;
    private String workAbroadPlace;
    @DateTimeFormat(pattern = "dd.MM.yyyy.")
    private Date temporaryAssignmentTime;
    private String temporaryAssignmentPlace;
    private String temporaryAssignmentCountry;
    private boolean jobsExtendedInsurancePolicyTime;
    private boolean jobsHealthAssessment;
    private String mainWorkPlace;
    private boolean workingInDifferentPlaces;
    private String weeklyWorkingTime;
    private String retirementTime;
    @DateTimeFormat(pattern = "dd.MM.yyyy.")
    private Date idleTimeFrom;
    @DateTimeFormat(pattern = "dd.MM.yyyy.")
    private Date idleTimeTo;
    @DateTimeFormat(pattern = "dd.MM.yyyy.")
    private Date idleTimeMaternityFrom;
    @DateTimeFormat(pattern = "dd.MM.yyyy.")
    private Date idleTimeMaternityTo;
    @DateTimeFormat(pattern = "dd.MM.yyyy.")
    private Date idleTimeParentalFrom;
    @DateTimeFormat(pattern = "dd.MM.yyyy.")
    private Date idleTimeParentalTo;

    @DateTimeFormat(pattern = "dd.MM.yyyy.")
    private Date endingDate;
    private String endingReason;
    private boolean pregnancy;
    private boolean maternityORPaternity;
    private boolean breastFeeding;
    private boolean singleParent;
    private boolean adoptiveParent;
    private boolean professionalIllness;
    private boolean injuryAtWork;
    private boolean professionalIncapacityToWork;
    private boolean reducedRemainingWorkAbility;
    private boolean reducedPartlyLostWorkAbility;
    private boolean dangerOfReductionWorkAbility;
    private boolean dangerOfDisability;
    private boolean disability;
    private boolean disabilityPension;
    private boolean caretakerDuties;
    private String otherEmployersInformation;

    private boolean contractBan;

    @DateTimeFormat(pattern = "dd.MM.yyyy.")
    private Date contractBanTime;

    public Employee()
    {
    }

    public Employee(String firstName, String lastName, Long oib, String gender, Date birthDate, String birthPlace, String citizenship, String residencePlace, Integer residencePostNumber, String residencePostOffice, String residenceStreet, Integer residenceStreetNumber, String inhabitancyPlace, Integer inhabitancyPostNumber, String inhabitancyPostOffice, String inhabitancyStreet, Integer inhabitancyStreetNumber, Date inhabitancyStartDate, Date inhabitancyEndDate, boolean permitToStayAndWork, String qualification, String title, Date startingDate, String jobName, String contractOfEmployment, Date probationTime, Date internshipDuration, Date internshipDatePassedExam, Date workAbroadTime, String workAbroadPlace, Date temporaryAssignmentTime, String temporaryAssignmentPlace, String temporaryAssignmentCountry, boolean jobsExtendedInsurancePolicyTime, boolean jobsHealthAssessment, String mainWorkPlace, boolean workingInDifferentPlaces, String weeklyWorkingTime, String retirementTime, Date idleTimeFrom, Date idleTimeTo, Date idleTimeMaternityFrom, Date idleTimeMaternityTo, Date idleTimeParentalFrom, Date idleTimeParentalTo, Date endingDate, String endingReason, boolean pregnancy, boolean maternityORPaternity, boolean breastFeeding, boolean singleParent, boolean adoptiveParent, boolean professionalIllness, boolean injuryAtWork, boolean professionalIncapacityToWork, boolean reducedRemainingWorkAbility, boolean reducedPartlyLostWorkAbility, boolean dangerOfReductionWorkAbility, boolean dangerOfDisability, boolean disability, boolean disabilityPension, boolean caretakerDuties, String otherEmployersInformation, boolean contractBan, Date contractBanTime)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.oib = oib;
        this.gender = gender;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.citizenship = citizenship;
        this.residencePlace = residencePlace;
        this.residencePostNumber = residencePostNumber;
        this.residencePostOffice = residencePostOffice;
        this.residenceStreet = residenceStreet;
        this.residenceStreetNumber = residenceStreetNumber;
        this.inhabitancyPlace = inhabitancyPlace;
        this.inhabitancyPostNumber = inhabitancyPostNumber;
        this.inhabitancyPostOffice = inhabitancyPostOffice;
        this.inhabitancyStreet = inhabitancyStreet;
        this.inhabitancyStreetNumber = inhabitancyStreetNumber;
        this.inhabitancyStartDate = inhabitancyStartDate;
        this.inhabitancyEndDate = inhabitancyEndDate;
        this.permitToStayAndWork = permitToStayAndWork;
        this.qualification = qualification;
        this.title = title;
        this.startingDate = startingDate;
        this.jobName = jobName;
        this.contractOfEmployment = contractOfEmployment;
        this.probationTime = probationTime;
        this.internshipDuration = internshipDuration;
        this.internshipDatePassedExam = internshipDatePassedExam;
        this.workAbroadTime = workAbroadTime;
        this.workAbroadPlace = workAbroadPlace;
        this.temporaryAssignmentTime = temporaryAssignmentTime;
        this.temporaryAssignmentPlace = temporaryAssignmentPlace;
        this.temporaryAssignmentCountry = temporaryAssignmentCountry;
        this.jobsExtendedInsurancePolicyTime = jobsExtendedInsurancePolicyTime;
        this.jobsHealthAssessment = jobsHealthAssessment;
        this.mainWorkPlace = mainWorkPlace;
        this.workingInDifferentPlaces = workingInDifferentPlaces;
        this.weeklyWorkingTime = weeklyWorkingTime;
        this.retirementTime = retirementTime;
        this.idleTimeFrom = idleTimeFrom;
        this.idleTimeTo = idleTimeTo;
        this.idleTimeMaternityFrom = idleTimeMaternityFrom;
        this.idleTimeMaternityTo = idleTimeMaternityTo;
        this.idleTimeParentalFrom = idleTimeParentalFrom;
        this.idleTimeParentalTo = idleTimeParentalTo;
        this.endingDate = endingDate;
        this.endingReason = endingReason;
        this.pregnancy = pregnancy;
        this.maternityORPaternity = maternityORPaternity;
        this.breastFeeding = breastFeeding;
        this.singleParent = singleParent;
        this.adoptiveParent = adoptiveParent;
        this.professionalIllness = professionalIllness;
        this.injuryAtWork = injuryAtWork;
        this.professionalIncapacityToWork = professionalIncapacityToWork;
        this.reducedRemainingWorkAbility = reducedRemainingWorkAbility;
        this.reducedPartlyLostWorkAbility = reducedPartlyLostWorkAbility;
        this.dangerOfReductionWorkAbility = dangerOfReductionWorkAbility;
        this.dangerOfDisability = dangerOfDisability;
        this.disability = disability;
        this.disabilityPension = disabilityPension;
        this.caretakerDuties = caretakerDuties;
        this.otherEmployersInformation = otherEmployersInformation;
        this.contractBan = contractBan;
        this.contractBanTime = contractBanTime;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    public String getBirthPlace()
    {
        return birthPlace;
    }

    public String getCitizenship()
    {
        return citizenship;
    }

    public Date getContractBanTime()
    {
        return contractBanTime;
    }

    public String getContractOfEmployment()
    {
        return contractOfEmployment;
    }

    public Date getEndingDate()
    {
        return endingDate;
    }

    public String getEndingReason()
    {
        return endingReason;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getGender()
    {
        return gender;
    }

    public Integer getId()
    {
        return id;
    }

    public Date getIdleTimeFrom()
    {
        return idleTimeFrom;
    }

    public Date getIdleTimeMaternityFrom()
    {
        return idleTimeMaternityFrom;
    }

    public Date getIdleTimeMaternityTo()
    {
        return idleTimeMaternityTo;
    }

    public Date getIdleTimeParentalFrom()
    {
        return idleTimeParentalFrom;
    }

    public Date getIdleTimeParentalTo()
    {
        return idleTimeParentalTo;
    }

    public Date getIdleTimeTo()
    {
        return idleTimeTo;
    }

    public Date getInhabitancyEndDate()
    {
        return inhabitancyEndDate;
    }

    public String getInhabitancyPlace()
    {
        return inhabitancyPlace;
    }

    public Integer getInhabitancyPostNumber()
    {
        return inhabitancyPostNumber;
    }

    public String getInhabitancyPostOffice()
    {
        return inhabitancyPostOffice;
    }

    public Date getInhabitancyStartDate()
    {
        return inhabitancyStartDate;
    }

    public String getInhabitancyStreet()
    {
        return inhabitancyStreet;
    }

    public Integer getInhabitancyStreetNumber()
    {
        return inhabitancyStreetNumber;
    }

    public Date getInternshipDatePassedExam()
    {
        return internshipDatePassedExam;
    }

    public Date getInternshipDuration()
    {
        return internshipDuration;
    }

    public String getJobName()
    {
        return jobName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getMainWorkPlace()
    {
        return mainWorkPlace;
    }

    public Long getOib()
    {
        return oib;
    }

    public String getOtherEmployersInformation()
    {
        return otherEmployersInformation;
    }

    public Date getProbationTime()
    {
        return probationTime;
    }

    public String getQualification()
    {
        return qualification;
    }

    public String getResidencePlace()
    {
        return residencePlace;
    }

    public Integer getResidencePostNumber()
    {
        return residencePostNumber;
    }

    public String getResidencePostOffice()
    {
        return residencePostOffice;
    }

    public String getResidenceStreet()
    {
        return residenceStreet;
    }

    public Integer getResidenceStreetNumber()
    {
        return residenceStreetNumber;
    }

    public String getRetirementTime()
    {
        return retirementTime;
    }

    public Date getStartingDate()
    {
        return startingDate;
    }

    public String getTemporaryAssignmentCountry()
    {
        return temporaryAssignmentCountry;
    }

    public String getTemporaryAssignmentPlace()
    {
        return temporaryAssignmentPlace;
    }

    public Date getTemporaryAssignmentTime()
    {
        return temporaryAssignmentTime;
    }

    public String getTitle()
    {
        return title;
    }

    public String getWeeklyWorkingTime()
    {
        return weeklyWorkingTime;
    }

    public String getWorkAbroadPlace()
    {
        return workAbroadPlace;
    }

    public Date getWorkAbroadTime()
    {
        return workAbroadTime;
    }

    public boolean isAdoptiveParent()
    {
        return adoptiveParent;
    }

    public boolean isBreastFeeding()
    {
        return breastFeeding;
    }

    public boolean isCaretakerDuties()
    {
        return caretakerDuties;
    }

    public boolean isContractBan()
    {
        return contractBan;
    }

    public boolean isDangerOfDisability()
    {
        return dangerOfDisability;
    }

    public boolean isDangerOfReductionWorkAbility()
    {
        return dangerOfReductionWorkAbility;
    }

    public boolean isDisability()
    {
        return disability;
    }

    public boolean isDisabilityPension()
    {
        return disabilityPension;
    }

    public boolean isInjuryAtWork()
    {
        return injuryAtWork;
    }

    public boolean isJobsExtendedInsurancePolicyTime()
    {
        return jobsExtendedInsurancePolicyTime;
    }

    public boolean isJobsHealthAssessment()
    {
        return jobsHealthAssessment;
    }

    public boolean isMaternityORPaternity()
    {
        return maternityORPaternity;
    }

    public boolean isPermitToStayAndWork()
    {
        return permitToStayAndWork;
    }

    public boolean isPregnancy()
    {
        return pregnancy;
    }

    public boolean isProfessionalIllness()
    {
        return professionalIllness;
    }

    public boolean isProfessionalIncapacityToWork()
    {
        return professionalIncapacityToWork;
    }

    public boolean isReducedPartlyLostWorkAbility()
    {
        return reducedPartlyLostWorkAbility;
    }

    public boolean isReducedRemainingWorkAbility()
    {
        return reducedRemainingWorkAbility;
    }

    public boolean isSingleParent()
    {
        return singleParent;
    }

    public boolean isWorkingInDifferentPlaces()
    {
        return workingInDifferentPlaces;
    }

    public void setAdoptiveParent(boolean adoptiveParent)
    {
        this.adoptiveParent = adoptiveParent;
    }

    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }

    public void setBirthPlace(String birthPlace)
    {
        this.birthPlace = birthPlace;
    }

    public void setBreastFeeding(boolean breastFeeding)
    {
        this.breastFeeding = breastFeeding;
    }

    public void setCaretakerDuties(boolean caretakerDuties)
    {
        this.caretakerDuties = caretakerDuties;
    }

    public void setCitizenship(String citizenship)
    {
        this.citizenship = citizenship;
    }

    public void setContractBan(boolean contractBan)
    {
        this.contractBan = contractBan;
    }

    public void setContractBanTime(Date contractBanTime)
    {
        this.contractBanTime = contractBanTime;
    }

    public void setContractOfEmployment(String contractOfEmployment)
    {
        this.contractOfEmployment = contractOfEmployment;
    }

    public void setDangerOfDisability(boolean dangerOfDisability)
    {
        this.dangerOfDisability = dangerOfDisability;
    }

    public void setDangerOfReductionWorkAbility(boolean dangerOfReductionWorkAbility)
    {
        this.dangerOfReductionWorkAbility = dangerOfReductionWorkAbility;
    }

    public void setDisability(boolean disability)
    {
        this.disability = disability;
    }

    public void setDisabilityPension(boolean disabilityPension)
    {
        this.disabilityPension = disabilityPension;
    }

    public void setEndingDate(Date endingDate)
    {
        this.endingDate = endingDate;
    }

    public void setEndingReason(String endingReason)
    {
        this.endingReason = endingReason;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public void setIdleTimeFrom(Date idleTimeFrom)
    {
        this.idleTimeFrom = idleTimeFrom;
    }

    public void setIdleTimeMaternityFrom(Date idleTimeMaternityFrom)
    {
        this.idleTimeMaternityFrom = idleTimeMaternityFrom;
    }

    public void setIdleTimeMaternityTo(Date idleTimeMaternityTo)
    {
        this.idleTimeMaternityTo = idleTimeMaternityTo;
    }

    public void setIdleTimeParentalFrom(Date idleTimeParentalFrom)
    {
        this.idleTimeParentalFrom = idleTimeParentalFrom;
    }

    public void setIdleTimeParentalTo(Date idleTimeParentalTo)
    {
        this.idleTimeParentalTo = idleTimeParentalTo;
    }

    public void setIdleTimeTo(Date idleTimeTo)
    {
        this.idleTimeTo = idleTimeTo;
    }

    public void setInhabitancyEndDate(Date inhabitancyEndDate)
    {
        this.inhabitancyEndDate = inhabitancyEndDate;
    }

    public void setInhabitancyPlace(String inhabitancyPlace)
    {
        this.inhabitancyPlace = inhabitancyPlace;
    }

    public void setInhabitancyPostNumber(Integer inhabitancyPostNumber)
    {
        this.inhabitancyPostNumber = inhabitancyPostNumber;
    }

    public void setInhabitancyPostOffice(String inhabitancyPostOffice)
    {
        this.inhabitancyPostOffice = inhabitancyPostOffice;
    }

    public void setInhabitancyStartDate(Date inhabitancyStartDate)
    {
        this.inhabitancyStartDate = inhabitancyStartDate;
    }

    public void setInhabitancyStreet(String inhabitancyStreet)
    {
        this.inhabitancyStreet = inhabitancyStreet;
    }

    public void setInhabitancyStreetNumber(Integer inhabitancyStreetNumber)
    {
        this.inhabitancyStreetNumber = inhabitancyStreetNumber;
    }

    public void setInjuryAtWork(boolean injuryAtWork)
    {
        this.injuryAtWork = injuryAtWork;
    }

    public void setInternshipDatePassedExam(Date internshipDatePassedExam)
    {
        this.internshipDatePassedExam = internshipDatePassedExam;
    }

    public void setInternshipDuration(Date internshipDuration)
    {
        this.internshipDuration = internshipDuration;
    }

    public void setJobName(String jobName)
    {
        this.jobName = jobName;
    }

    public void setJobsExtendedInsurancePolicyTime(boolean jobsExtendedInsurancePolicyTime)
    {
        this.jobsExtendedInsurancePolicyTime = jobsExtendedInsurancePolicyTime;
    }

    public void setJobsHealthAssessment(boolean jobsHealthAssessment)
    {
        this.jobsHealthAssessment = jobsHealthAssessment;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setMainWorkPlace(String mainWorkPlace)
    {
        this.mainWorkPlace = mainWorkPlace;
    }

    public void setMaternityORPaternity(boolean maternityORPaternity)
    {
        this.maternityORPaternity = maternityORPaternity;
    }

    public void setOib(Long oib)
    {
        this.oib = oib;
    }

    public void setOtherEmployersInformation(String otherEmployersInformation)
    {
        this.otherEmployersInformation = otherEmployersInformation;
    }

    public void setPermitToStayAndWork(boolean permitToStayAndWork)
    {
        this.permitToStayAndWork = permitToStayAndWork;
    }

    public void setPregnancy(boolean pregnancy)
    {
        this.pregnancy = pregnancy;
    }

    public void setProbationTime(Date probationTime)
    {
        this.probationTime = probationTime;
    }

    public void setProfessionalIllness(boolean professionalIllness)
    {
        this.professionalIllness = professionalIllness;
    }

    public void setProfessionalIncapacityToWork(boolean professionalIncapacityToWork)
    {
        this.professionalIncapacityToWork = professionalIncapacityToWork;
    }

    public void setQualification(String qualification)
    {
        this.qualification = qualification;
    }

    public void setReducedPartlyLostWorkAbility(boolean reducedPartlyLostWorkAbility)
    {
        this.reducedPartlyLostWorkAbility = reducedPartlyLostWorkAbility;
    }

    public void setReducedRemainingWorkAbility(boolean reducedRemainingWorkAbility)
    {
        this.reducedRemainingWorkAbility = reducedRemainingWorkAbility;
    }

    public void setResidencePlace(String residencePlace)
    {
        this.residencePlace = residencePlace;
    }

    public void setResidencePostNumber(Integer residencePostNumber)
    {
        this.residencePostNumber = residencePostNumber;
    }

    public void setResidencePostOffice(String residencePostOffice)
    {
        this.residencePostOffice = residencePostOffice;
    }

    public void setResidenceStreet(String residenceStreet)
    {
        this.residenceStreet = residenceStreet;
    }

    public void setResidenceStreetNumber(Integer residenceStreetNumber)
    {
        this.residenceStreetNumber = residenceStreetNumber;
    }

    public void setRetirementTime(String retirementTime)
    {
        this.retirementTime = retirementTime;
    }

    public void setSingleParent(boolean singleParent)
    {
        this.singleParent = singleParent;
    }

    public void setStartingDate(Date startingDate)
    {
        this.startingDate = startingDate;
    }

    public void setTemporaryAssignmentCountry(String temporaryAssignmentCountry)
    {
        this.temporaryAssignmentCountry = temporaryAssignmentCountry;
    }

    public void setTemporaryAssignmentPlace(String temporaryAssignmentPlace)
    {
        this.temporaryAssignmentPlace = temporaryAssignmentPlace;
    }

    public void setTemporaryAssignmentTime(Date temporaryAssignmentTime)
    {
        this.temporaryAssignmentTime = temporaryAssignmentTime;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setWeeklyWorkingTime(String weeklyWorkingTime)
    {
        this.weeklyWorkingTime = weeklyWorkingTime;
    }

    public void setWorkAbroadPlace(String workAbroadPlace)
    {
        this.workAbroadPlace = workAbroadPlace;
    }

    public void setWorkAbroadTime(Date workAbroadTime)
    {
        this.workAbroadTime = workAbroadTime;
    }

    public void setWorkingInDifferentPlaces(boolean workingInDifferentPlaces)
    {
        this.workingInDifferentPlaces = workingInDifferentPlaces;
    }

}
