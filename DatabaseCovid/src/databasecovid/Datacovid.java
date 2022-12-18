/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasecovid;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gramm
 */
@Entity
@Table(name = "DATACOVID")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Datacovid.findAll", query = "SELECT d FROM Datacovid d"),
    @NamedQuery(name = "Datacovid.findByYearnum", query = "SELECT d FROM Datacovid d WHERE d.yearnum = :yearnum"),
    @NamedQuery(name = "Datacovid.findByWeeknum", query = "SELECT d FROM Datacovid d WHERE d.weeknum = :weeknum"),
    @NamedQuery(name = "Datacovid.findByNewCase", query = "SELECT d FROM Datacovid d WHERE d.newCase = :newCase"),
    @NamedQuery(name = "Datacovid.findByTotalCase", query = "SELECT d FROM Datacovid d WHERE d.totalCase = :totalCase"),
    @NamedQuery(name = "Datacovid.findByNewCaseExcludeabroad", query = "SELECT d FROM Datacovid d WHERE d.newCaseExcludeabroad = :newCaseExcludeabroad"),
    @NamedQuery(name = "Datacovid.findByTotalCaseExcludeabroad", query = "SELECT d FROM Datacovid d WHERE d.totalCaseExcludeabroad = :totalCaseExcludeabroad"),
    @NamedQuery(name = "Datacovid.findByNewRecovered", query = "SELECT d FROM Datacovid d WHERE d.newRecovered = :newRecovered"),
    @NamedQuery(name = "Datacovid.findByTotalRecovered", query = "SELECT d FROM Datacovid d WHERE d.totalRecovered = :totalRecovered"),
    @NamedQuery(name = "Datacovid.findByNewDeath", query = "SELECT d FROM Datacovid d WHERE d.newDeath = :newDeath"),
    @NamedQuery(name = "Datacovid.findByTotalDeath", query = "SELECT d FROM Datacovid d WHERE d.totalDeath = :totalDeath"),
    @NamedQuery(name = "Datacovid.findByCaseForeign", query = "SELECT d FROM Datacovid d WHERE d.caseForeign = :caseForeign"),
    @NamedQuery(name = "Datacovid.findByCasePrison", query = "SELECT d FROM Datacovid d WHERE d.casePrison = :casePrison"),
    @NamedQuery(name = "Datacovid.findByCaseWalkin", query = "SELECT d FROM Datacovid d WHERE d.caseWalkin = :caseWalkin"),
    @NamedQuery(name = "Datacovid.findByCaseNewPrev", query = "SELECT d FROM Datacovid d WHERE d.caseNewPrev = :caseNewPrev"),
    @NamedQuery(name = "Datacovid.findByCaseNewDiff", query = "SELECT d FROM Datacovid d WHERE d.caseNewDiff = :caseNewDiff"),
    @NamedQuery(name = "Datacovid.findByDeathNewPrev", query = "SELECT d FROM Datacovid d WHERE d.deathNewPrev = :deathNewPrev"),
    @NamedQuery(name = "Datacovid.findByDeathNewDiff", query = "SELECT d FROM Datacovid d WHERE d.deathNewDiff = :deathNewDiff"),
    @NamedQuery(name = "Datacovid.findByUpdateDate", query = "SELECT d FROM Datacovid d WHERE d.updateDate = :updateDate")})
public class Datacovid implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "YEARNUM")
    private Integer yearnum;
    @Column(name = "WEEKNUM")
    private Integer weeknum;
    @Column(name = "NEW_CASE")
    private Integer newCase;
    @Column(name = "TOTAL_CASE")
    private Integer totalCase;
    @Column(name = "NEW_CASE_EXCLUDEABROAD")
    private Integer newCaseExcludeabroad;
    @Column(name = "TOTAL_CASE_EXCLUDEABROAD")
    private Integer totalCaseExcludeabroad;
    @Column(name = "NEW_RECOVERED")
    private Integer newRecovered;
    @Column(name = "TOTAL_RECOVERED")
    private Integer totalRecovered;
    @Column(name = "NEW_DEATH")
    private Integer newDeath;
    @Column(name = "TOTAL_DEATH")
    private Integer totalDeath;
    @Column(name = "CASE_FOREIGN")
    private Integer caseForeign;
    @Column(name = "CASE_PRISON")
    private Integer casePrison;
    @Column(name = "CASE_WALKIN")
    private Integer caseWalkin;
    @Column(name = "CASE_NEW_PREV")
    private Integer caseNewPrev;
    @Column(name = "CASE_NEW_DIFF")
    private Integer caseNewDiff;
    @Column(name = "DEATH_NEW_PREV")
    private Integer deathNewPrev;
    @Column(name = "DEATH_NEW_DIFF")
    private Integer deathNewDiff;
    @Column(name = "UPDATE_DATE")
    private String updateDate;

    public Datacovid() {
    }

    public Datacovid(Integer yearnum, Integer weeknum, Integer newCase, Integer totalCase, Integer newCaseExcludeabroad, Integer totalCaseExcludeabroad, Integer newRecovered, Integer totalRecovered, Integer newDeath, Integer totalDeath, Integer caseForeign, Integer casePrison, Integer caseWalkin, Integer caseNewPrev, Integer caseNewDiff, Integer deathNewPrev, Integer deathNewDiff, String updateDate) {
        this.yearnum = yearnum;
        this.weeknum = weeknum;
        this.newCase = newCase;
        this.totalCase = totalCase;
        this.newCaseExcludeabroad = newCaseExcludeabroad;
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
        this.newRecovered = newRecovered;
        this.totalRecovered = totalRecovered;
        this.newDeath = newDeath;
        this.totalDeath = totalDeath;
        this.caseForeign = caseForeign;
        this.casePrison = casePrison;
        this.caseWalkin = caseWalkin;
        this.caseNewPrev = caseNewPrev;
        this.caseNewDiff = caseNewDiff;
        this.deathNewPrev = deathNewPrev;
        this.deathNewDiff = deathNewDiff;
        this.updateDate = updateDate;
    }

    public Datacovid(Integer yearnum) {
        this.yearnum = yearnum;
    }

    public Integer getYearnum() {
        return yearnum;
    }

    public void setYearnum(Integer yearnum) {
        this.yearnum = yearnum;
    }

    public Integer getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(Integer weeknum) {
        this.weeknum = weeknum;
    }

    public Integer getNewCase() {
        return newCase;
    }

    public void setNewCase(Integer newCase) {
        this.newCase = newCase;
    }

    public Integer getTotalCase() {
        return totalCase;
    }

    public void setTotalCase(Integer totalCase) {
        this.totalCase = totalCase;
    }

    public Integer getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    public void setNewCaseExcludeabroad(Integer newCaseExcludeabroad) {
        this.newCaseExcludeabroad = newCaseExcludeabroad;
    }

    public Integer getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    public void setTotalCaseExcludeabroad(Integer totalCaseExcludeabroad) {
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
    }

    public Integer getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(Integer newRecovered) {
        this.newRecovered = newRecovered;
    }

    public Integer getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(Integer totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public Integer getNewDeath() {
        return newDeath;
    }

    public void setNewDeath(Integer newDeath) {
        this.newDeath = newDeath;
    }

    public Integer getTotalDeath() {
        return totalDeath;
    }

    public void setTotalDeath(Integer totalDeath) {
        this.totalDeath = totalDeath;
    }

    public Integer getCaseForeign() {
        return caseForeign;
    }

    public void setCaseForeign(Integer caseForeign) {
        this.caseForeign = caseForeign;
    }

    public Integer getCasePrison() {
        return casePrison;
    }

    public void setCasePrison(Integer casePrison) {
        this.casePrison = casePrison;
    }

    public Integer getCaseWalkin() {
        return caseWalkin;
    }

    public void setCaseWalkin(Integer caseWalkin) {
        this.caseWalkin = caseWalkin;
    }

    public Integer getCaseNewPrev() {
        return caseNewPrev;
    }

    public void setCaseNewPrev(Integer caseNewPrev) {
        this.caseNewPrev = caseNewPrev;
    }

    public Integer getCaseNewDiff() {
        return caseNewDiff;
    }

    public void setCaseNewDiff(Integer caseNewDiff) {
        this.caseNewDiff = caseNewDiff;
    }

    public Integer getDeathNewPrev() {
        return deathNewPrev;
    }

    public void setDeathNewPrev(Integer deathNewPrev) {
        this.deathNewPrev = deathNewPrev;
    }

    public Integer getDeathNewDiff() {
        return deathNewDiff;
    }

    public void setDeathNewDiff(Integer deathNewDiff) {
        this.deathNewDiff = deathNewDiff;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (yearnum != null ? yearnum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Datacovid)) {
            return false;
        }
        Datacovid other = (Datacovid) object;
        if ((this.yearnum == null && other.yearnum != null) || (this.yearnum != null && !this.yearnum.equals(other.yearnum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "databasecovid.Datacovid[ yearnum=" + yearnum + " ]";
    }
    
}
