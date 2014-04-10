/*
 * UniTime 3.2 - 3.5 (University Timetabling Application)
 * Copyright (C) 2010 - 2014, UniTime LLC, and individual contributors
 * as indicated by the @authors tag.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along
 * with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
*/
package org.unitime.timetable.model.base;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.dom4j.Document;
import org.unitime.timetable.model.AcademicClassification;
import org.unitime.timetable.model.Curriculum;
import org.unitime.timetable.model.CurriculumClassification;
import org.unitime.timetable.model.CurriculumCourse;

/**
 * Do not change this class. It has been automatically generated using ant create-model.
 * @see org.unitime.commons.ant.CreateBaseModelFromXml
 */
public abstract class BaseCurriculumClassification implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long iUniqueId;
	private String iName;
	private Integer iNrStudents;
	private Integer iOrd;
	private Document iStudents;

	private Curriculum iCurriculum;
	private AcademicClassification iAcademicClassification;
	private Set<CurriculumCourse> iCourses;

	public static String PROP_UNIQUEID = "uniqueId";
	public static String PROP_NAME = "name";
	public static String PROP_NR_STUDENTS = "nrStudents";
	public static String PROP_ORD = "ord";
	public static String PROP_STUDENTS = "students";

	public BaseCurriculumClassification() {
		initialize();
	}

	public BaseCurriculumClassification(Long uniqueId) {
		setUniqueId(uniqueId);
		initialize();
	}

	protected void initialize() {}

	public Long getUniqueId() { return iUniqueId; }
	public void setUniqueId(Long uniqueId) { iUniqueId = uniqueId; }

	public String getName() { return iName; }
	public void setName(String name) { iName = name; }

	public Integer getNrStudents() { return iNrStudents; }
	public void setNrStudents(Integer nrStudents) { iNrStudents = nrStudents; }

	public Integer getOrd() { return iOrd; }
	public void setOrd(Integer ord) { iOrd = ord; }

	public Document getStudents() { return iStudents; }
	public void setStudents(Document students) { iStudents = students; }

	public Curriculum getCurriculum() { return iCurriculum; }
	public void setCurriculum(Curriculum curriculum) { iCurriculum = curriculum; }

	public AcademicClassification getAcademicClassification() { return iAcademicClassification; }
	public void setAcademicClassification(AcademicClassification academicClassification) { iAcademicClassification = academicClassification; }

	public Set<CurriculumCourse> getCourses() { return iCourses; }
	public void setCourses(Set<CurriculumCourse> courses) { iCourses = courses; }
	public void addTocourses(CurriculumCourse curriculumCourse) {
		if (iCourses == null) iCourses = new HashSet<CurriculumCourse>();
		iCourses.add(curriculumCourse);
	}

	public boolean equals(Object o) {
		if (o == null || !(o instanceof CurriculumClassification)) return false;
		if (getUniqueId() == null || ((CurriculumClassification)o).getUniqueId() == null) return false;
		return getUniqueId().equals(((CurriculumClassification)o).getUniqueId());
	}

	public int hashCode() {
		if (getUniqueId() == null) return super.hashCode();
		return getUniqueId().hashCode();
	}

	public String toString() {
		return "CurriculumClassification["+getUniqueId()+" "+getName()+"]";
	}

	public String toDebugString() {
		return "CurriculumClassification[" +
			"\n	AcademicClassification: " + getAcademicClassification() +
			"\n	Curriculum: " + getCurriculum() +
			"\n	Name: " + getName() +
			"\n	NrStudents: " + getNrStudents() +
			"\n	Ord: " + getOrd() +
			"\n	Students: " + getStudents() +
			"\n	UniqueId: " + getUniqueId() +
			"]";
	}
}
